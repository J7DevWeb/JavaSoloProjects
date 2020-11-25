package fr.bangbig;

import java.util.Scanner;

public class Players extends Items {
	
	Scanner input = new Scanner (System.in);
	
	// Constructeur de la classe joueur 
	public Players() {
		super();
		
	};
	
	// Obtenir le choix du joueur et le stocker
	public ITEMS getChoices() {
		System.out.println("Choisir le nombre correspondant au symbole que vous voulez jouer : "
				+ "\n 1 - PIERRE  2 - FEUILLE \n 3 - CISEAUX  4 - LEZARD \n        5 - SPOCK");
		
		while(!input.hasNextInt()) 
		input.next();
		int theChosenOne = input.nextInt();
		switch(theChosenOne) {
		case 1 : 
			return ITEMS.PIERRE;
		case 2 : 
			return ITEMS.FEUILLE;
		case 3 : 
			return ITEMS.CISEAUX;
		case 4 : 
			return ITEMS.LEZARD;
		case 5 : 
			return ITEMS.SPOCK;
		default : 
			System.out.println("Le nombre choisie doit etre compris entre 1 et 5 inclus");
			return getChoices();
		}	
	}
}
