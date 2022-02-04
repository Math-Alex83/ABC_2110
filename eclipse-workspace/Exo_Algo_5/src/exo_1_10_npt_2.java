import java.util.Scanner;

public class exo_1_10_npt_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Dans cet exo jai besoin que lutilisateur me dise combien de nombre parfait il veut.
		 * donc boucle jusqua la demande de lutilisateur.
		 * 
		 * Dans la boucle besoin de lutilisateur, une boucle de recherche de nbrx parfait.
		 */
		
		int nbrx=1;
		int d;
		int somDiv=0;
		int reponse;
		//import Scanner
		Scanner sc=new Scanner(System.in);
		
		// 1ere question
		System.out.println("How many perfect numbers would you like to see ?"+"\n");

		//lecture du nombre(nbrx).
		reponse=sc.nextInt();
		System.out.println("you want to see the "+reponse+" perfect numbers.");
		
		//fermeture du Scanner.
		sc.close();
		
		/* Condition d'entrer dans la boucle (for), le nombre doit etre un nombre pair.
		Donc
		Si (nombre%2=0) Alors, => il rentre dans la boucle for.*/
		
		if (nbrx%2==0)
		{

			for (d=1; d<=nbrx/2; d=d+1)//d=2 pour ne pas avoir 1 et nbrx-1 pour ne pas avoir lui-même.
			{	
				// DANS UNE VARIABLE ON AJOUTE DES DIVISEURS
				System.out.println(d);
				somDiv+=d;

				if (somDiv==nbrx)
				{
					System.out.println("\n"+nbrx+" est un nombre parfait.");	
				}
			}
		}
		else 
		{
			System.out.println(nbrx+" n'est pas un nombre parfait.");
		}
	}
}