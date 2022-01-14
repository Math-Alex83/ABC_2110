package jalonAlternative;

import java.util.Scanner;

public class sallon_de_coiffure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Pour etudiants Si jeudi = coupe -20% ; Si Mercredi = coupe -50% ; Sinon coupe taux plein.

		//Declaration des variables
		
		String reponse1;
		String reponse2;
		String reponse3;
		// import Scanner
		Scanner sc = new Scanner (System.in);
		System.out.println("Bonjour et bienvenu dans notre sallon de coiffure. ^_^");
		// 1ere question
		do {
		System.out.println("Êtes-vous étudiant ? oui/non");
		// Lecture reponse1
		reponse1 = sc.next();
		}
		while (!reponse1.equals("oui") && !reponse1.equals("non"));
		if (reponse1.equals("oui"))
		{
			do {
			// 2eme question
			System.out.println("Sommes-nous Mercredi ? oui/non");
			// Lecture réponse2
			reponse2 = sc.next();
			}
			while (!reponse2.equals("oui") && !reponse2.equals("non"));
			if (reponse2.equals("oui"))
			{
				
				System.out.println("Vous avez droit à une réduction de 50% !");
			}
			else {
				do {
				// 3eme question
				System.out.println("Sommes-nous Jeudi ? oui/non");
				// Lecture reponse3
				reponse3 = sc.next();
				}
				while (!reponse3.equals("oui") && !reponse3.equals("non"));
				if (reponse3.equals("oui")) 
				{
					System.out.println("Vous avez droit à une réduction de 20% !");
				}
				else {
					System.out.println("Vous n'avez droit à aucune réduction, désolé faut que tu craches l'oseille ^^");
				}
			}
		}
		else {
			System.out.println("Vous n'avez droit à aucune réduction, désolé faut que tu craches l'oseille ^^");
		}
		// Fermeture scanner
		sc.close();
	}		
}		
/* exo fini jeu d'essai OK.
 * Rajout de (do while), jeu d'essai OK.	
 */
		
		
