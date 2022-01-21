import java.util.Scanner;

public class algo_5_exo_1_1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*L’utilisateur est invité à saisir 2 nombres entier.
			Le programme calcule la moyenne des 2 nombres et affiche le résultat sous forme de nombre réel double précision
			ET propose à l'utilisateur de refaire un calcul */

		// Declarations des variables

		double nbr1;
		double nbr2;
		double moyenne;
		String reponse;
		
		// import scanner
		Scanner sc=new Scanner(System.in);
		
		// Faire
		do
		{
			// saisi des entrees.
			System.out.println("Veuillez saisir 2 nombres sépararéent d'un espace s'il vous plait.");

			// lire nbr1 et nbr2
			nbr1=sc.nextDouble();
			nbr2=sc.nextDouble();

			// affichage de la lecture
			System.out.println("Vous avez saisi "+ nbr1 +" et "+ nbr2);
			// Traitement
			moyenne = ((nbr1+nbr2) /2);
			// Affichage du resultat
			System.out.println("La moyenne est de "+ moyenne);

			// Afficher la demande de rejouer le calcul.
			System.out.println("Voulez-vous faire un autre calcul ? o/n");
			reponse = sc.next();
		}
		// jusqu'a ce que la reponse est oui (n'est pas "non").
		while (reponse.equals("o"));

		// cloture scaner
		sc.close();
	}
}
// Jeu d'essai OK
// Jeu d'essai avec boucle OK.