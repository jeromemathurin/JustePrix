package fr.jemat.justeprix;

import java.util.Random;
import java.util.Scanner;

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
				System.out.println("|=====================================|");
				System.out.println("|====== Choisissez une catégorie =====|");
				System.out.println("|=====================================|");
				System.out.println("|** Entrez le nombre de votre choix **|");
				System.out.println("|=====================================|");
				System.out.println("| 1  Voiture                          |");
				System.out.println("| 2  Meuble                           |");
				System.out.println("| 3  Nouvelle Technologie             |");
				System.out.println("| 4  Voyage                           |");
				System.out.println("|=====================================|");
				@SuppressWarnings("resource")
				Scanner scan = new Scanner(System.in);
				niveauChoixCategorie = scan.nextInt();
				erreur = 0;
			} catch (Exception e) {
				erreur = 1;
				System.out.println("Warning! Saisir un nombre entier.");
			}
			
			// afficher un  message si le nombre n'est pas compris entre 1 et 4
			if(1 > niveauChoixCategorie || niveauChoixCategorie > 4) {System.out.println("Warning! Saisir un nombre entier 1, 2, 3 ou 4.");}
		
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
				Random rand01 = new Random();
				choixSousCategorie = rand01.nextInt(3);
				System.out.println("affichage (méthode) choixSousCategorie : " + choixSousCategorie);
				break;
			case 2:
				Random rand02 = new Random();
				choixSousCategorie = rand02.nextInt(3);
				System.out.println(choixSousCategorie);
				break;
			case 3:
				Random rand03 = new Random();
				choixSousCategorie = rand03.nextInt(4);
				System.out.println(choixSousCategorie);
				break;
			case 4:
				Random rand04 = new Random();
				choixSousCategorie = rand04.nextInt(2);
				System.out.println(choixSousCategorie);
				break;
			default: break;
		}
		
		/**
		 * Initialmisation du prix pour la categorie 1 (Voiture)
		 * 3 Niveau : Citadine , Berline et Sportive
		 */
		if (choixJoueur == 1 && choixSousCategorie == 0) {
			Random rand11 = new Random();			
			min = 7000;
			max = 9000;
			choixFinalDeLObjet = rand11.nextInt((max-min)+1)+min;
			System.out.println("Quel est le JustePrix d'un véhicule citadin (entre 7 000€ et 9 000€) " + choixFinalDeLObjet);
		} else if (choixJoueur == 1 && choixSousCategorie == 1) {
			Random rand11 = new Random();			
			min = 20000;
			max = 50000;
			choixFinalDeLObjet = rand11.nextInt((max-min)+1)+min;
			System.out.println("Quel est le JustePrix d'un véhicule Berline (entre 20 000€ et 50 000€) " + choixFinalDeLObjet);
		} else if (choixJoueur == 1 && choixSousCategorie == 2) {
			Random rand11 = new Random();			
			min = 30000;
			max = 70000;
			choixFinalDeLObjet = rand11.nextInt((max-min)+1)+min;
			System.out.println("Quel est le JustePrix d'un véhicule Sportive (entre 30 000€ et 70 000€) " + choixFinalDeLObjet);
		}
		
		/**
		 * Déterminer la sous categorie de la categorie 2 (Meuble)
		 * de facon aléatoire
		 * 3 Niveau : Bureau, canapé et commode
		 */
		if (choixJoueur == 2 && choixSousCategorie == 0) {
			Random rand21 = new Random();
			choixSousSousCategorie = rand21.nextInt(2);
			System.out.println("Quel est le JustePrix d'un bureau " + choixSousSousCategorie);
		} else if (choixJoueur == 2 && choixSousCategorie == 1) {
			Random rand21 = new Random();
			choixSousSousCategorie = rand21.nextInt(2);
			System.out.println("Quel est le JustePrix d'un canapé " + choixSousSousCategorie);
		} else if (choixJoueur == 2 && choixSousCategorie == 2) {
			choixSousSousCategorie = 0;
			System.out.println("Quel est le JustePrix d'une commode " + choixSousSousCategorie);
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
			Random rand21 = new Random();		
			min = 300;
			max = 400;
			choixFinalDeLObjet = rand21.nextInt((max-min)+1)+min;
			System.out.println("Home " + choixFinalDeLObjet);
		} else if (choixJoueur == 2 && choixSousCategorie == 0 && choixSousSousCategorie == 1) {
			Random rand21 = new Random();		
			min = 300;
			max = 600;
			choixFinalDeLObjet = rand21.nextInt((max-min)+1)+min;
			System.out.println("Pro " + choixFinalDeLObjet);
		} 
		/**
		 * Canapé: 2 places ou 4 places
		 */
		if (choixJoueur == 2 && choixSousCategorie == 1 && choixSousSousCategorie == 0) {
			Random rand21 = new Random();		
			min = 400;
			max = 800;
			choixFinalDeLObjet = rand21.nextInt((max-min)+1)+min;
			System.out.println("2 places " + choixFinalDeLObjet);
		} else if (choixJoueur == 2 && choixSousCategorie == 1 && choixSousSousCategorie == 1) {
			Random rand21 = new Random();			
			min = 700;
			max = 1300;
			choixFinalDeLObjet = rand21.nextInt((max-min)+1)+min;
			System.out.println("4 places " + choixFinalDeLObjet);
		}
		/**
		 * commode
		 */
		if (choixJoueur == 2 && choixSousCategorie == 2 && choixSousSousCategorie == 0) {
			Random rand21 = new Random();			
			min = 400;
			max = 800;
			choixFinalDeLObjet = rand21.nextInt((max-min)+1)+min;
			System.out.println("." + choixFinalDeLObjet);
		}
		
		/**
		 * Initialmisation du prix pour la categorie 3 (Nouvelle Technologie)
		 * 4 Niveau : ordi portable, Smartphone, Tablette, TV4k et enceinte__bluetooth
		 */
		if (choixJoueur == 3 && choixSousCategorie == 0) {
			Random rand11 = new Random();			
			min = 400;
			max = 700;
			choixFinalDeLObjet = rand11.nextInt((max-min)+1)+min;
			System.out.println("Quel est le JustePrix d'un Ordinateur Portable (entre 400€ et 700€) " + choixFinalDeLObjet);
		} else if (choixJoueur == 3 && choixSousCategorie == 1) {
			Random rand11 = new Random();			
			min = 86;
			max = 1990;
			choixFinalDeLObjet = rand11.nextInt((max-min)+1)+min;
			System.out.println("Quel est le JustePrix d'un Smartphone (entre 86€ et 1 990€) " + choixFinalDeLObjet);
		} else if (choixJoueur == 3 && choixSousCategorie == 2) {
			Random rand11 = new Random();			
			min = 79;
			max = 1050;
			choixFinalDeLObjet = rand11.nextInt((max-min)+1)+min;
			System.out.println("Quel est le JustePrix d'un tablette (entre 79€ et 1 050€) " + choixFinalDeLObjet);
		} else if (choixJoueur == 3 && choixSousCategorie == 3) {
			Random rand11 = new Random();			
			min = 27;
			max = 890;
			choixFinalDeLObjet = rand11.nextInt((max-min)+1)+min;
			System.out.println("Quel est le JustePrix d'une enceinte Bluetooth (entre 27€ et 890€) " + choixFinalDeLObjet);
		}
		
		/**
		 * Déterminer la sous categorie de la categorie 4 (Voyage)
		 * de facon aléatoire
		 * 3 Niveau : Week end, 1 semaine
		 */
		if (choixJoueur == 4 && choixSousCategorie == 0) {
			Random rand21 = new Random();
			choixSousSousCategorie = rand21.nextInt(2);
			System.out.println("Quel est le JustePrix d'un Week-End " + choixSousSousCategorie);
		} else if (choixJoueur == 4 && choixSousCategorie == 1) {
			Random rand21 = new Random();
			choixSousSousCategorie = rand21.nextInt(2);
			System.out.println("Quel est le JustePrix d'une semaine de vacance " + choixSousSousCategorie);
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
			Random rand21 = new Random();
			min = 59;
			max = 179;
			choixFinalDeLObjet = rand21.nextInt((max-min)+1)+min;
			
			System.out.println("en Espagne (entre 59€ et 179€)" + choixFinalDeLObjet);
		} else if (choixJoueur == 4 && choixSousCategorie == 0 && choixSousSousCategorie == 1) {
			Random rand21 = new Random();

			min = 89;
			max = 279;
			choixFinalDeLObjet = rand21.nextInt((max-min)+1)+min;
			System.out.println("en Italie (entre 89€ et 279€)" + choixFinalDeLObjet);
		} 
		/**
		 * Semaine: France , Portugal
		 */
		if (choixJoueur == 4 && choixSousCategorie == 1 && choixSousSousCategorie == 0) {
			Random rand21 = new Random();
			min = 339;
			max = 1680;
			choixFinalDeLObjet = rand21.nextInt((max-min)+1)+min;
			System.out.println("en France " + choixFinalDeLObjet);
		} else if (choixJoueur == 4 && choixSousCategorie == 1 && choixSousSousCategorie == 1) {
			Random rand21 = new Random();
			min = 149;
			max = 987;
			choixFinalDeLObjet = rand21.nextInt((max-min)+1)+min;
			System.out.println("au Portugal " + choixFinalDeLObjet);
		}
		
		System.out.println("affichage (méthode) choixSousSousCategorie : " + choixSousSousCategorie);
		//choixFinalDeLObjet = choixSousSousCategorie;
		JustePrix choixFinal = new JustePrix(choixFinalDeLObjet,min,max);
		
		return choixFinal;
		
	}


}
