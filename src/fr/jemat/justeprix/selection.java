package fr.jemat.justeprix;

import java.util.Random;

public class selection {
	
	/**
	 * Methode lancement du jeu
	 * Choix de la categorie par le joueur
	 * @return
	 */
	public static int ChoixCatégorie() {
		int niveauChoixCategorie = -1;
		int erreur = -1;
		
		/**
		 * Affichage du menu tant qu'un choix n'est pas fait par le joueur.
		 */
		do {
			try {
				Formules.AffichageConsole("|=====================================|");
				Formules.AffichageConsole("|====== Choisissez une catégorie =====|");
				Formules.AffichageConsole("|=====================================|");
				Formules.AffichageConsole("|** Entrez le nombre de votre choix **|");
				Formules.AffichageConsole("|=====================================|");
				Formules.AffichageConsole("| 1  Voiture                          |");
				Formules.AffichageConsole("| 2  Meuble                           |");
				Formules.AffichageConsole("| 3  Nouvelle Technologie             |");
				Formules.AffichageConsole("| 4  Voyage                           |");
				Formules.AffichageConsole("|=====================================|");

				niveauChoixCategorie = Formules.SaisieDuJoueur();
				erreur = 0;
				
			} catch (Exception e) {
				erreur = 1;
				Formules.AffichageConsole("Warning! Saisir un nombre entier.");
			}
			
			// afficher un  message si le nombre n'est pas compris entre 1 et 4
			if(1 > niveauChoixCategorie || niveauChoixCategorie > 4) {Formules.AffichageConsole("Warning! Saisir un nombre entier 1, 2, 3 ou 4.");}
		
		} while (niveauChoixCategorie < 1 || niveauChoixCategorie > 4 || erreur == 1);
		
		return niveauChoixCategorie;
	}
	
	
	public static JustePrix ChoixObjet(int choixJoueur) {
		
		// int choixJoueur = 1;
		@SuppressWarnings("unused")
		int objetJustePrix = 1;
		int choixSousCategorie = 0;
		int choixSousSousCategorie =0;
		int choixFinalDeLObjet= -1;
		int min = -1;
		int max = -1;
		
		/**
		 * A partir du choix du joueur (un nombre entre 1 et 4)
		 * Recherche de facon random une sous categorie en fonction du choix
		 * 
		 */
		switch(choixJoueur) {
			case 1:
				choixSousCategorie = Formules.NombreAleatoireAvecUnInt(3);
				break;
			case 2:
				choixSousCategorie = Formules.NombreAleatoireAvecUnInt(3);
				break;
			case 3:
				choixSousCategorie = Formules.NombreAleatoireAvecUnInt(4);
				break;
			case 4:
				choixSousCategorie = Formules.NombreAleatoireAvecUnInt(2);
				break;
			default: break;
		}
		
		/**
		 * Initialmisation du prix pour la categorie 1 (Voiture)
		 * 3 Niveau : Citadine , Berline et Sportive
		 */
		if (choixJoueur == 1 && choixSousCategorie == 0) {
			min = 7000;
			max = 9000;
			choixFinalDeLObjet = Formules.NombreAleatoire(min, max);
			Formules.AffichageConsole("Quel est le JustePrix d'un véhicule citadin (entre 7 000€ et 9 000€) " + choixFinalDeLObjet);
		} else if (choixJoueur == 1 && choixSousCategorie == 1) {
			min = 20000;
			max = 50000;
			choixFinalDeLObjet = Formules.NombreAleatoire(min, max);
			Formules.AffichageConsole("Quel est le JustePrix d'un véhicule Berline (entre 20 000€ et 50 000€) " + choixFinalDeLObjet);
		} else if (choixJoueur == 1 && choixSousCategorie == 2) {
			min = 30000;
			max = 70000;
			choixFinalDeLObjet = Formules.NombreAleatoire(min, max);
			Formules.AffichageConsole("Quel est le JustePrix d'un véhicule Sportive (entre 30 000€ et 70 000€) " + choixFinalDeLObjet);
		}
		
		/**
		 * Déterminer la sous categorie de la categorie 2 (Meuble)
		 * de facon aléatoire
		 * 3 Niveau : Bureau, canapé et commode
		 */
		if (choixJoueur == 2 && choixSousCategorie == 0) {
			Random rand21 = new Random();
			choixSousSousCategorie = rand21.nextInt(2);
			Formules.AffichageConsole("Quel est le JustePrix d'un bureau " + choixSousSousCategorie);
		} else if (choixJoueur == 2 && choixSousCategorie == 1) {
			Random rand21 = new Random();
			choixSousSousCategorie = rand21.nextInt(2);
			Formules.AffichageConsole("Quel est le JustePrix d'un canapé " + choixSousSousCategorie);
		} else if (choixJoueur == 2 && choixSousCategorie == 2) {
			choixSousSousCategorie = 0;
			Formules.AffichageConsole("Quel est le JustePrix d'une commode " + choixSousSousCategorie);
		}
		
		/**
		 * Déterminer la sous sous catégorie de la categorie 2 (meuble)
		 * Initialiser le prix du JustePrix
		 * 
		 */
		
		/**
		 * Bureau: Home ou Pro
		 */
		if (choixJoueur == 2 && choixSousCategorie == 0 && choixSousSousCategorie == 0) {
			min = 300;
			max = 400;
			choixFinalDeLObjet = Formules.NombreAleatoire(min, max);
			Formules.AffichageConsole("Home " + choixFinalDeLObjet);
		} else if (choixJoueur == 2 && choixSousCategorie == 0 && choixSousSousCategorie == 1) {
			min = 300;
			max = 600;
			choixFinalDeLObjet = Formules.NombreAleatoire(min, max);
			Formules.AffichageConsole("Pro " + choixFinalDeLObjet);
		} 
		/**
		 * Canapé: 2 places ou 4 places
		 */
		if (choixJoueur == 2 && choixSousCategorie == 1 && choixSousSousCategorie == 0) {
			min = 400;
			max = 800;
			choixFinalDeLObjet = Formules.NombreAleatoire(min, max);
			Formules.AffichageConsole("2 places " + choixFinalDeLObjet);
		} else if (choixJoueur == 2 && choixSousCategorie == 1 && choixSousSousCategorie == 1) {
			min = 700;
			max = 1300;
			choixFinalDeLObjet = Formules.NombreAleatoire(min, max);
			Formules.AffichageConsole("4 places " + choixFinalDeLObjet);
		}
		/**
		 * commode
		 */
		if (choixJoueur == 2 && choixSousCategorie == 2 && choixSousSousCategorie == 0) {
			min = 400;
			max = 800;
			choixFinalDeLObjet = Formules.NombreAleatoire(min, max);
			Formules.AffichageConsole("." + choixFinalDeLObjet);
		}
		
		/**
		 * Initialmisation du prix pour la categorie 3 (Nouvelle Technologie)
		 * 4 Niveau : ordi portable, Smartphone, Tablette, TV4k et enceinte__bluetooth
		 */
		if (choixJoueur == 3 && choixSousCategorie == 0) {
			min = 400;
			max = 700;
			choixFinalDeLObjet = Formules.NombreAleatoire(min, max);			Formules.AffichageConsole("Quel est le JustePrix d'un Ordinateur Portable (entre 400€ et 700€) " + choixFinalDeLObjet);
		} else if (choixJoueur == 3 && choixSousCategorie == 1) {
			min = 86;
			max = 1990;
			choixFinalDeLObjet = Formules.NombreAleatoire(min, max);
			Formules.AffichageConsole("Quel est le JustePrix d'un Smartphone (entre 86€ et 1 990€) " + choixFinalDeLObjet);
		} else if (choixJoueur == 3 && choixSousCategorie == 2) {
			min = 79;
			max = 1050;
			choixFinalDeLObjet = Formules.NombreAleatoire(min, max);			Formules.AffichageConsole("Quel est le JustePrix d'un tablette (entre 79€ et 1 050€) " + choixFinalDeLObjet);
		} else if (choixJoueur == 3 && choixSousCategorie == 3) {
			min = 27;
			max = 890;
			choixFinalDeLObjet = Formules.NombreAleatoire(min, max);
			Formules.AffichageConsole("Quel est le JustePrix d'une enceinte Bluetooth (entre 27€ et 890€) " + choixFinalDeLObjet);
		}
		
		/**
		 * Déterminer la sous categorie de la categorie 4 (Voyage)
		 * de facon aléatoire
		 * 3 Niveau : Week end, 1 semaine
		 */
		if (choixJoueur == 4 && choixSousCategorie == 0) {
			Random rand21 = new Random();
			choixSousSousCategorie = rand21.nextInt(2);
			Formules.AffichageConsole("Quel est le JustePrix d'un Week-End " + choixSousSousCategorie);
		} else if (choixJoueur == 4 && choixSousCategorie == 1) {
			Random rand21 = new Random();
			choixSousSousCategorie = rand21.nextInt(2);
			Formules.AffichageConsole("Quel est le JustePrix d'une semaine de vacance " + choixSousSousCategorie);
		}
		
		/**
		 * Déterminer la sous sous catégorie de la categorie 4 (Voyage)
		 * Initialiser le prix du JustePrix
		 * 
		 */
		
		/**
		 * WeekEnd: Espagne , Italie
		 */
		if (choixJoueur == 4 && choixSousCategorie == 0 && choixSousSousCategorie == 0) {
			min = 59;
			max = 179;
			choixFinalDeLObjet = Formules.NombreAleatoire(min, max);			
			Formules.AffichageConsole("en Espagne (entre 59€ et 179€)" + choixFinalDeLObjet);
		} else if (choixJoueur == 4 && choixSousCategorie == 0 && choixSousSousCategorie == 1) {
			min = 89;
			max = 279;
			choixFinalDeLObjet = Formules.NombreAleatoire(min, max);
			Formules.AffichageConsole("en Italie (entre 89€ et 279€)" + choixFinalDeLObjet);
		} 
		/**
		 * Semaine: France , Portugal
		 */
		if (choixJoueur == 4 && choixSousCategorie == 1 && choixSousSousCategorie == 0) {
			min = 339;
			max = 1680;
			choixFinalDeLObjet = Formules.NombreAleatoire(min, max);			Formules.AffichageConsole("en France " + choixFinalDeLObjet);
		} else if (choixJoueur == 4 && choixSousCategorie == 1 && choixSousSousCategorie == 1) {
			min = 149;
			max = 987;
			choixFinalDeLObjet = Formules.NombreAleatoire(min, max);			Formules.AffichageConsole("au Portugal " + choixFinalDeLObjet);
		}
		
		Formules.AffichageConsole("affichage (méthode) choixSousSousCategorie : " + choixSousSousCategorie);
		//choixFinalDeLObjet = choixSousSousCategorie;
		JustePrix choixFinal = new JustePrix(choixFinalDeLObjet,min,max);
		
		return choixFinal;
		
	}


}
