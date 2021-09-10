package fr.jemat.justeprix;

import java.util.Random;
import java.util.Scanner;

public class Formules {
	
	public static void AffichageConsole(String message) {
		System.out.println(message);
	}
	
	public static int NombreAleatoireAvecUnInt (int nombre) {
		Random rand = new Random();
		int resultat = rand.nextInt(nombre);
		return resultat;
	}
	
	public static int NombreAleatoire (int min, int max) {
		Random rand = new Random();
		int resultat = rand.nextInt((max-min)+1)+min;
		return resultat;		
	}
	
	public static int SaisieDuJoueur() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int saisie = scan.nextInt();
		return saisie;		
	}
	
	public static String SaisieDuJoueurString() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String saisie = scan.nextLine();
		return saisie;		
	}
	
	public static boolean QuitterLeJeu() {
		AffichageConsole("Quitter le jeu ? Oui/Non");	
		boolean quit = false;
		String continuer = "stop";
		String oui = "o", non="n";
		do {
			try {
				/**
				 * controle de la saisie
				 *  taille de la variable
				 */
			String choixQuitter = SaisieDuJoueurString().toLowerCase();
			if ( choixQuitter.length()>1) {
				AffichageConsole("Continuer ? o / n");
				/**
				 * LA saisie pocede 1 seul caractere
				 *  verifier si la valeur saisie est "o"
				 */
			} else if (choixQuitter.equals(oui)) {
				continuer = "passer";
				quit = true;
				/**
				 * verifier si la valeur est "n"
				 */
			} else if (choixQuitter.equals(non)){
				continuer = "passer";
				quit = false;
				/**
				 * toute les valeurs autres sont refusé (String)
				 */
			} else {
				AffichageConsole("Continuer ? o / n");
			}
			}catch(Exception e) {
				/**
				 * rejette les valeurs int et autres.
				 */
			}
		} while(continuer.equals("stop"));
		
		return quit;
	}
	
}
