package jalonAlternative;

import java.util.Scanner;

public class essai_do_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Essai de fait-il beau evec do while.

		String reponse1;
		Scanner sc=new Scanner(System.in);

		do {
			System.out.println("Avez-vous trouv� la solution � l'exercice?");
			reponse1 = sc.next();
		}			
		while (!reponse1.equals("oui") && !reponse1.equals("non"));
		/* peut aussi �tre �crit : 
		while (!(reponse1.equals("oui") || reponse1.equals("non"))); */
		if (reponse1.equals("oui")) 
		{
			System.out.println("Vous pouvez jouer � Forza avec Jos�!");
		}
		else 
		{
			System.out.println("Alors cherchez encore!");
		}
		sc.close();
	}
}
// exo fini, jeu d'essai ok!