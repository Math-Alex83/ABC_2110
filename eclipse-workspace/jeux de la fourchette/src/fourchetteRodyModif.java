import java.util.Random;
import java.util.Scanner;

public class fourchetteRodyModif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nbrAleatoire;
		int fourchetteBasse=0;
		int fourchetteHaute=100;
		boolean fourchetteBasseExclus, fourchetteHauteExclus;
		fourchetteBasseExclus = fourchetteHauteExclus = false;
		int nbrUtil;

		Scanner sc=new Scanner (System.in);
		// j'appel la fonction Random (comme pour le Scanner
		Random rand = new Random();

		// rand.nextInt fonctionne comme le sc.nextInt 
		// donc je dis, tu me génère un nombre aleatoire entre 0 inclusif et 101 exclusif (jusqua 100 quoi) et tu me rentre cette info dans la variable nbrAleatoire. ps: c'est pas necessaire.
		nbrAleatoire=rand.nextInt(101);
		//pour test
		//System.out.println(nbrAleatoire);

		do 
		{
			System.out.println("Veuillez  donner un nombre entier compris entre " + 
					(fourchetteBasseExclus ? fourchetteBasse+1 : fourchetteBasse) + " et " + 
					(fourchetteHauteExclus ? fourchetteHaute-1 : fourchetteHaute) + " inclus s'il vous plaît");
			nbrUtil = sc.nextInt();
			if  (nbrUtil!=nbrAleatoire)
			{
				if (nbrAleatoire>nbrUtil) 
				{
					fourchetteBasse=nbrUtil;
					fourchetteBasseExclus = true;
					/* En commentaire n'est plus utile
					System.out.println("Le nombre recherché est entre "+nbrUtil+" et "+fourchetteHaute );
					nbrUtil = sc.nextInt();*/
				}
				else if (nbrAleatoire<nbrUtil) 
				{
					fourchetteHaute=nbrUtil;
					fourchetteHauteExclus=true;
					/* En commentaire n'est plus utile
					System.out.println("Le nombre recherché est entre "+nbrUtil+" et "+fourchetteBasse );
					nbrUtil = sc.nextInt();*/
				}
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