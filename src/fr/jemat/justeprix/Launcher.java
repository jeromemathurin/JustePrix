package fr.jemat.justeprix;

import java.util.Scanner;

public class Launcher {

	public static void main(String[] args) {

		System.out.println("Jouons au JustePrix !");
		
		int choixCategorieJoueur = selection.ChoixCatégorie();
		
//		JustePrix objetJustePrix = new JustePrix();
		JustePrix objetJustePrix = selection.ChoixObjet(choixCategorieJoueur);
//		System.out.println(objetJustePrix);
		
		try {
			
//			Random r = new Random();
//			int justeprix = r.nextInt(201);
			int justeprix = objetJustePrix.getPrix();
			int mini = objetJustePrix.getMin();
			int maxi = objetJustePrix.getMax();
			int joueur = -1;
			int erreur = 0;
			int compteur = 0;
						
			while (joueur != justeprix || erreur == 1) {
				compteur++;
				try {
					System.out.println("Ta proposition :");
					@SuppressWarnings("resource")
					Scanner scan = new Scanner(System.in);
					joueur = scan.nextInt();
					erreur = 0;
					
					
					/**
					 * Controle de la saisie du joueur
					 *  1_ nombre compris entre mini et maxi
					 *  2_nombre inferieur ou superieur au JustePrix
					 */
					if(joueur > justeprix && joueur > mini && joueur < maxi) {
						System.out.println("Le JustePrix est en dessous (-).");
					} else if (joueur < justeprix && joueur > mini && joueur < maxi){
						System.out.println("Le JustePrix est au dessus (+).");
					} else {System.out.println("Saisir un prix entre " + mini + " et " + maxi);}
					
//					if (joueur < mini || joueur > maxi){
//						System.out.println("Saisir un prix entre " + mini + " et " + maxi);
//						erreur = 1;
//					}
					
				} catch (Exception e) {
					erreur = 1;
					System.out.println("WARNING! Saisie un nombre entier.");
				}
			}
			
			System.out.println(" Bravo ! \n Tu as trouvé le JustePrix " + justeprix + "\n Nombre d'essais: "+ compteur);
		} catch (Exception e ) {System.out.println("Erreur. Arret du programme.");}
		System.exit(1);
	}

	
}
