import java.util.Scanner;

public class Exemple_jeu_doigts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// jeux test avec les doigts
		// D�claration des variables
		int nbrA;
		int nbrB;
		int reste;
		
		// Debut de la partie
		
		// �crire "Les joueurs A et B vont choisir un chiffre entre 0 et 5, si la sommes est paire: Joueur A Gagne ; Si impaire: Joueur B Gagne."
		System.out.println("Les joueurs A et B choisiront un chiffre entre 0 et 5. Si, le r�sultat est paire, Joueur A Gagne, sinon jouer B ");
		//�crire" joueur A commence"
		System.out.println("Commen�ons! Joueur A, entrez un chiffre entre 0 et 5 s'il vous plait.");
		
		// import du scanner
		Scanner sc = new Scanner(System.in);
		//Lire choix du joueur A
		nbrA = sc.nextInt();
		// �crire "A vous joueur B, entrez un chiffre entre 0 et 5 s'il vous plait."
		System.out.println("A vous joueur B, entrez un chiffre entre 0 et 5 s'il vous plait.");
		// Lire choix du joueur B
		nbrB = sc.nextInt();
		
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
		
	sc.close();	
	}

}
