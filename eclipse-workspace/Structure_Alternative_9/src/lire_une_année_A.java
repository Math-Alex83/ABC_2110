import java.util.Scanner;

public class lire_une_année_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Éxercice Lire l'année A.
		 * 
		 * Déterminer si l'année A est bissextile.
		 * 
		 * Si A n'est pas divisible par 4, l'année n'est pas bissextile.
		 * 
		 * Si A est divisible par 4, l'année est bissextile SAUF si A est divisible par 100 et PAS par 400.
		 * 
		 * Écrire un message "Bissextile" ou "Non bissextile" suivant le cas.
		 */
		int annee;
		//double reste;

		System.out.println("Votre Année est-elle une année Bissextile ?");

		//import scanner
		Scanner sc = new Scanner(System.in);

		// Affichage du méssage pour débuter l'éxo.
		System.out.println("Veuillez saisir une année s'il vous plaît.");

		// Lecture de l'année choisi par l'utilisateur
		annee = sc.nextInt();

		if ((annee % 4) == 0) {
			if (((annee % 100) == 0) && ((annee % 400) != 0)) {
				System.out.println("L'année "+annee+" n'est pas Bissextile.");
			}
			else 
			{
				System.out.println("L'année "+annee+" est Bissextile.");
			}
		}
		else
		{
			System.out.println("L'année "+annee+" n'est pas bissextile.");
		}

		sc.close();

	}
}
// Éxo fini et jeu d'essai OK'