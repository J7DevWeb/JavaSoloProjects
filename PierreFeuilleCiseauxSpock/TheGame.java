package fr.bangbig;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TheGame {

	//Lancement du jeu
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		GameLogical game = new GameLogical();
		int quit = 0;
		
		// Afficher les regles en debut de partie
		System.out.println("Bienvenu dans Pierre-feuille-Ciseaux-L�zard-Spock \n");
		System.out.println( "Ici, les r�gles classiques s'appliquent, mais il faut ajouter que le l�zard mange le papier, empoisonne Spock, est �cras� par la pierre et est d�capit� par les ciseaux. \nSpock vaporise la pierre, casse les ciseaux, et est discr�dit� par le papier.");
		System.out.println("\nBon jeu\n");
		//gerer la relance de tours
		while (quit != 9) {
			try {
			game.Play();
			
			System.out.println("Pour passer au tours suivant appuyez sur une touche. Pour quitter le jeu appuyer sur 9.");
			quit = in.nextInt();
			System.out.println("**********************************************************************************"); //separer graphiquement le nb de tour
			}catch (InputMismatchException ex) {
				in.nextLine();
				System.out.println("**********************************************************************************");
			}
		}
		in.close();
		game.displayStats();

	}

}
