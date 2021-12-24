import java.util.Scanner;

public class Exemple_jeu_doigts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// jeux test avec les doigts
		// Déclaration des variables
		int nbrA;
		int nbrB;
		int reste;
		// Traitement
		reste =(nbrA + nbrB)mod 2;
		
		
		// Début de la partie
		
		// écrire "Les joueurs A et B vont choisir un chiffre entre 0 et 5, si la sommes est paire: Joueur A Gagne ; Si impaire: Joueur B Gagne."
		System.out.println("Les joueurs A et B choisiront un chiffre entre 0 et 5. Si, le résultat est paire, Joueur A Gagne, sinon jouer B ");
		//écrire" joueur A commence"
		System.out.println("Commençons! Joueur A, entrez un chiffre entre 0 et 5 s'il vous plait.");
		
		// import du scanner
		Scanner sc = new Scanner(System.in);
		//Lire choix du joueur A
		nbrA = sc.nextInt();
		// écrire "A vous joueur B, entrez un chiffre entre 0 et 5 s'il vous plait."
		System.out.println("A vous joueur B, entrez un chiffre entre 0 et 5 s'il vous plait.");
		// Lire choix du joueur B
		nbrB = sc.nextInt();
		
		
		
	sc.close();	
	}

}
