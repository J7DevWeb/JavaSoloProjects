package fr.demo.app;

import java.util.Scanner;

public class TesteurPalinApp {

	public static void main(String[] args) {
		
		char restart;
		
		System.out.println("Tester un palindrome !");
		System.out.println("Se dit d'un mot que l'on peut lire indifféremment de gauche à droite ou de droite à gauche.");
		
		do{ //Relance le programme si restart == 'r' sinon arret du prog.
			
		//Recup saisie
			
		System.out.println("Veuillez saisir un mot à tester ->");
		Scanner scan = new Scanner(System.in);
		String palin = scan.nextLine().toLowerCase();
		
		//Stockage dans un tableau
		
		char tabPalin[] = new char[palin.length()];
		for (int i=0; i< palin.length(); i++) {
		tabPalin[i] = palin.charAt(i);
		}
		//Creer et generer tableau inverse
		
		char tabPalinInv[] = new char[palin.length()];
		for (int i=0; i< palin.length(); i++) {
			tabPalinInv[i] = palin.charAt(palin.length()-1-i);
			}
		
		//Comparaison
		
		boolean isPalin = true;
		for (int i=0; i<palin.length(); i++) {
			if (tabPalin[i] != tabPalinInv[i]) {
				isPalin = false;
			}
		}
		
		//Afficher resultat et proposition relance 
		
		if (isPalin == true) {
			System.out.println("Le mot saisie est un palindrome.");
		}else {
			System.out.println("Le mot saisie n'est pas un palindrome.");
		}
		System.out.println("appuyer sur la touche r pour recommencer.");
		 restart = scan.nextLine().toLowerCase().charAt(0);
	} while(restart =='r');
		
	}
}
