package fr.bangbig;



public class GameLogical extends Items {
	//Declaration attributs
	private Players player;
	private Computer cpu;
	private ITEMS playerChoice;
	private ITEMS cpuChoice;
	private RESULTS result;
	
	private int win;
	private int lose;
	private int tie;
	
	//Constructeur 
	public GameLogical() {
		super();
		player = new Players();
		cpu = new Computer();
	}
	
	//lancer le jeu
	public void Play() {
		playerChoice = player.getChoices(); 
		cpuChoice = cpu.computerChoice();
		
		result = HeartOfGame();
		displayResults();
		stats();
	}
	
	//logique du jeu
	public RESULTS HeartOfGame() {
		if(playerChoice == cpuChoice) {
			return RESULTS.EGALITE;
		};
		
		switch(playerChoice) {
		case PIERRE : return (cpuChoice == ITEMS.CISEAUX | cpuChoice == ITEMS.LEZARD ? RESULTS.VICTOIRE : RESULTS.DEFAITE);
		case FEUILLE : return (cpuChoice == ITEMS.PIERRE | cpuChoice == ITEMS.SPOCK ? RESULTS.VICTOIRE : RESULTS.DEFAITE);
		case CISEAUX : return (cpuChoice == ITEMS.FEUILLE | cpuChoice == ITEMS.LEZARD ? RESULTS.VICTOIRE : RESULTS.DEFAITE);
		case LEZARD : return (cpuChoice == ITEMS.SPOCK | cpuChoice == ITEMS.FEUILLE ? RESULTS.VICTOIRE : RESULTS.DEFAITE);
		case SPOCK : return (cpuChoice == ITEMS.PIERRE | cpuChoice == ITEMS.CISEAUX ? RESULTS.VICTOIRE : RESULTS.DEFAITE);
		}
		
		return RESULTS.EGALITE; 
	}
	
	//Afficher resultats 
	public void displayResults() {
		switch(result) {
		case VICTOIRE : 
			System.out.println("Victoire!!! Vous avez choisie " + playerChoice + " alors que l'ordinateur a choisie " + cpuChoice);break;
		case DEFAITE : 
			System.out.println("Defaite!!! Votre " + playerChoice + " est vaincue par " + cpuChoice); break;
		default : 
			System.out.println( playerChoice + " contre " + cpuChoice + " C'est une EGALITE !");
		}
		
	}
	
	
	//Obtenir Compteurs de points (victoire, defaite, egalite, nombre de tours de jeu)
	
	private void stats() {
		if(result == RESULTS.VICTOIRE) {
			win++;
		}else if(result == RESULTS.DEFAITE) {
			lose++;
		}else {
			tie++;
		}
	}
	
	//Afficher les compteurs (quand on quitte le jeu)
	public void displayStats() {
		if (win>lose) {
			System.out.println("=======Vainqueur!!!=========== \nVous avez rempoté plus de manches que l'ordinateur.");
		}else if(win<lose) {
			System.out.println("=======Defaite!!!=========== \nL'ordinateur a remporté plus de manches que vous.");
		}else {
			System.out.println("=======Egalité parfaite!!!=========== \nLe jeu ne fait que commencer.");
		}
		System.out.println("Nombre de tours : " + (win+lose+tie));
		System.out.println("Vos victoires " + win + " Vos defaites : " + lose);
		System.out.println("Nombre d'egalité " + tie + " \n A bientot pour une nouvelle partie!");
	}


	
}
