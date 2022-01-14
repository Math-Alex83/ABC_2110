import java.util.Scanner;

public class lire_une_ann�e_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* �xercice Lire l'ann�e A.
		 * 
		 * D�terminer si l'ann�e A est bissextile.
		 * 
		 * Si A n'est pas divisible par 4, l'ann�e n'est pas bissextile.
		 * 
		 * Si A est divisible par 4, l'ann�e est bissextile SAUF si A est divisible par 100 et PAS par 400.
		 * 
		 * �crire un message "Bissextile" ou "Non bissextile" suivant le cas.
		 */
		int annee;
		//double reste;

		System.out.println("Votre Ann�e est-elle une ann�e Bissextile ?");

		//import scanner
		Scanner sc = new Scanner(System.in);

		// Affichage du m�ssage pour d�buter l'�xo.
		System.out.println("Veuillez saisir une ann�e s'il vous pla�t.");

		// Lecture de l'ann�e choisi par l'utilisateur
		annee = sc.nextInt();

		if ((annee % 4) == 0) {
			if (((annee % 100) == 0) && ((annee % 400) != 0)) {
				System.out.println("L'ann�e "+annee+" n'est pas Bissextile.");
			}
			else 
			{
				System.out.println("L'ann�e "+annee+" est Bissextile.");
			}
		}
		else
		{
			System.out.println("L'ann�e "+annee+" n'est pas bissextile.");
		}

		sc.close();

	}
}
// �xo fini et jeu d'essai OK'