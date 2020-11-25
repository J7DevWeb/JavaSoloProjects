package fr.bangbig;

import java.util.Random;

public class Computer extends Items {
	
	public Computer() {
		super();
	}
	
	//L'ordi tire aleatoirement un symbole 
	public ITEMS computerChoice() {
		Random rand = new Random();
		int theFallen = 1 + rand.nextInt(5);
				switch(theFallen) {
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
				}
				return ITEMS.SPOCK; 
	}
}
