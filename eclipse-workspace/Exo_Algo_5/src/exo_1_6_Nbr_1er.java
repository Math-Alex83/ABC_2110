import java.util.Scanner;

public class exo_1_6_Nbr_1er {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Lire un nombre N et déterminer s’il est un nombre premier.

		// Saisi des variables
		int nbrx; 
		int diviseur;
		//int estNombrePremier; //a enlever sinon erreur car "estNombrePremier" est dupliqué

		// Saisi des entrees.
		System.out.println("Veuillez saisir un nombre entier positif s'il vous plaît.");

		// import scanner
		Scanner sc = new Scanner(System.in);

		// lire nbrx
		nbrx = sc.nextInt();

		//traitement
		// au départ diviseur est égal à 2 donc diviseur==2 puis avec while dire que diviseur < à nbrx.
		diviseur = 2;

		//boolean estNombrePremier = true;

		while (diviseur < nbrx) //(diviseur < nbrx && true) 

		{
			// Si nbrx modulo diviseur = 0
			if (nbrx % diviseur == 0) 
			{
				//estNombrePremier=false;
				diviseur = nbrx+1;
			}
			else 
			{
			diviseur++;
			}
		}
		if (diviseur>nbrx)
		{
			System.out.println(" "+nbrx+" n'est pas un nombre premier.");
		}
		else
		{
			System.out.println(" "+nbrx+" est un nombre premier.");
		}
		// cloture Scanner
		sc.close();
	}
}
// Fin exercice, jeu d'essai ok'