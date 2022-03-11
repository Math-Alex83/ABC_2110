import java.util.Random;
import java.util.Scanner;

/*L'ordinateur « choisit » un nombre entier compris entre 0 et 100. 
 * 
 * Le joueur essaie de le deviner. 
 * 
-->Lors de chaque essai, l'ordinateur affiche la « fourchette » dans laquelle se trouve le nombre qu'il a choisi. 

-->Le choix du nombre par l'ordinateur sera simulé par génération d'un nombre aléatoire : N <-- RANDOM(0,100)*/


public class exo23Fourchette {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nbrAleatoire;
		//int fourchetteBasse=0;
		//int fouchetteHaute=100;
		int nbrUtil;
		
		Scanner sc=new Scanner (System.in);
		// j'appel la fonction Random (comme pour le Scanner
		Random rand = new Random();
		
		// rand.nextInt fonctionne comme le sc.nextInt 
		// donc je dis, tu me génère un nombre aleatoire entre 0 inclusif et 101 exclusif (jusqua 100 quoi) et tu me rentre cette info dans la variable nbrAleatoire. ps: c'est pas necessaire.
		nbrAleatoire=rand.nextInt(101);
		//pour test
		System.out.println(nbrAleatoire);
		
		System.out.println("Veuillez  donner un nombre entier compris entre 0 et 100 inclus s'il vous plaît");
		nbrUtil = sc.nextInt();
		
		
		do 
		{
		
			if (nbrAleatoire>=0 && nbrAleatoire<=25) 
			{
				System.out.println("Le nombre recherché est entre 0 et 25 inclus" );
				nbrUtil = sc.nextInt();
			}
			else if (nbrAleatoire>=25 && nbrAleatoire<=50) 
			{
				System.out.println("Le nombre recherché est entre 25 et 50 inclus" );
				nbrUtil = sc.nextInt();
			}
			if (nbrAleatoire>=50 && nbrAleatoire<=75) 
			{
				System.out.println("Le nombre recherché est entre 50 et 75 inclus" );
				nbrUtil = sc.nextInt();
			}
			else if (nbrAleatoire>=75 && nbrAleatoire<=100) 
			{
				System.out.println("Le nombre recherché est entre 75 et 100 inclus" );
				nbrUtil = sc.nextInt();
			}
	
		
		}
		while (nbrUtil!=nbrAleatoire); 
		
		if (nbrUtil==nbrAleatoire) 
		{
			System.out.println("Bravo! "+nbrUtil+" est bien le nombre caché.");
		}













		sc.close();

	}

}
