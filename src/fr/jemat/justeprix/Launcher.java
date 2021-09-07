package fr.jemat.justeprix;

public class Launcher {

	public static void main(String[] args) {

		Formules.AffichageConsole("Jouons au JustePrix !");
		
		int choixCategorieJoueur = selection.ChoixCatégorie();
		Boolean sortie = false;
		
		JustePrix objetJustePrix = selection.ChoixObjet(choixCategorieJoueur);

		while (!sortie){
		
			try {
				
				int justeprix = objetJustePrix.getPrix();
				int mini = objetJustePrix.getMin();
				int maxi = objetJustePrix.getMax();
				int joueur = -1;
				int erreur = 0;
				int compteur = 0;
							
				while (joueur != justeprix || erreur == 1) {
					compteur++;
					try {
						Formules.AffichageConsole("Ta proposition :");
						joueur = Formules.SaisieDuJoueur();
						erreur = 0;
						
						
						/**
						 * Controle de la saisie du joueur
						 *  1_ nombre compris entre mini et maxi
						 *  2_nombre inferieur ou superieur au JustePrix
						 */
						if(joueur > justeprix && joueur > mini && joueur < maxi) {
							Formules.AffichageConsole("Le JustePrix est en dessous (-).");
						} else if (joueur < justeprix && joueur > mini && joueur < maxi){
							Formules.AffichageConsole("Le JustePrix est au dessus (+).");
						} else {Formules.AffichageConsole("Saisir un prix entre " + mini + " et " + maxi);}
						
						
					} catch (Exception e) {
						erreur = 1;
						Formules.AffichageConsole("WARNING! Saisie un nombre entier.");
					}
				}
				
				Formules.AffichageConsole(" Bravo ! \n Tu as trouvé le JustePrix " + justeprix + "\n Nombre d'essais: "+ compteur);
			} catch (Exception e ) {Formules.AffichageConsole("Erreur. Arret du programme.");}
			sortie = Formules.QuitterLeJeu();
		}
		System.exit(1);
	}

	
}
