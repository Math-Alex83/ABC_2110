import java.util.Scanner;

public class calculDesNombresParfaits_1_10 {




	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* je commence l'exo avec une valeur de 6 pour le nbrR 
		 * car le premier nombre parfait est 6.*/


		int demUtil;
		int nbrR = 6 ;// nombre Recherché dans la boucle ou testé.
		int nbrPT=0; // nombre parfait trouvé

		// 1ere question, combient de nombre parfait l'utilisateur veut voire.
		System.out.println("Combient de nombres parfait souhaitez vous voire ? (Max 4)");

		//import Scanner
		Scanner sc=new Scanner(System.in);

		//lecture de la reponse utilisateur(demUtil).
		demUtil=sc.nextInt(); 
		sc.close();

		// boucle while qui gère la boucle for.
		while (nbrPT<demUtil) 
		{
			//int d; // diviseur
			int somDiv=0; // somme des diviseurs

			/*boucle for qui cherche les nombres parfaits 
			 * en fonction de la boucle while*/

			for (int d=1; d<=nbrR/2; d=d+1)
			{
				/*Si le nbrR modulo D est = à 0 
				 * Alors addition des d dans variable somDiv.*/

				if (nbrR%d==0)
				{
					somDiv+=d;// j'additionne les diviseur et stock dans somDiv		
				}
			}
			/*Si la somme des div est = au nombre Recherché Alors, 
			 * Affichage et je dis que j'ai trouvé un nombre parfait*/
			if (somDiv==nbrR) 
			{
				System.out.println("\n"+nbrR+" est un nombre parfait.");
				nbrPT++;	
			}
			/* la boucle for a trouvée un nbrP 
			 * Donc j'ajoute 2 à mon nombre recherché 
			 * et je réinitialise ma somDiv à 0.*/
			nbrR += 2;
			//somDiv=0; 
			/* je peux supprimer cette action car déclaré dans boucle while, 
			se recrée et initialise à 0 après chaque nbrPT.*/
		}
	}
}