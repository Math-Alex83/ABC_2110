import java.util.Scanner;

public class Exemple_jeu_doigts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// jeux test avec les doigts
		// D�claration des variables
		int nbrA;
		int nbrB;
		int reste;
<<<<<<< Updated upstream
		String reponse;
		
		// import du scanner
				Scanner sc = new Scanner(System.in);
		// Debut de la partie
		do
		{
=======
	
		// import du scanner
				Scanner sc = new Scanner(System.in);
		// D�but de la partie

>>>>>>> Stashed changes
		// �crire "Les joueurs A et B vont choisir un chiffre entre 0 et 5, si la sommes est paire: Joueur A Gagne ; Si impaire: Joueur B Gagne."
		System.out.println("Les joueurs A et B choisiront un chiffre entre 0 et 5. Si, le r�sultat est paire, Joueur A Gagne, sinon jouer B ");
		
		
<<<<<<< Updated upstream
=======
		//�crire" joueur A commence"
		System.out.println("Commen�ons! Joueur A, entrez un chiffre entre 0 et 5 s'il vous plait."); 
>>>>>>> Stashed changes
		//Lire choix du joueur A
		nbrA = sc.nextInt();
		
		
		// �crire "A vous joueur B, entrez un chiffre entre 0 et 5 s'il vous plait."
		System.out.println("A vous joueur B, entrez un chiffre entre 0 et 5 s'il vous plait.");
		// Lire choix du joueur B
		nbrB = sc.nextInt();
<<<<<<< Updated upstream
		
		// Traitement
		reste = ((nbrA + nbrB) % 2);
		
		if (reste == (0)) 
		{
			System.out.println("Bravo au joueur A, vous avez gagner!");
		}
		else 
		{
			System.out.println("Bravo joueur B, vous avez gagner!");
		}
		// Voulez-vous rejouer?
		System.out.println("Voulez-vous rejouer ? o/n");
		reponse=sc.next();
		}
		while (!reponse.equals("non"));
	sc.close();	
=======



		sc.close();	
>>>>>>> Stashed changes
	}

}
