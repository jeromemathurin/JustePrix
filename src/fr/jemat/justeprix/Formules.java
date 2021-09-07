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
		String choixQuitter = SaisieDuJoueurString();
		
		
		if ( choixQuitter.length()>1) {
			quit = false;
		} else 
		
		return quit;
	}
	
}
