import java.util.Scanner;

public class exo_1_10_nombre_parfait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* le nombre parfait, est un nombre dont la somme de ses diviseur "strict" autre que lui meme est egal au nombre*/
		/* exmple pour "6" ses diviseurs strict sont 1,2,3,6 donc 1+2+3=6 alors 6 est un nombre dit parfait*/


		int nbrx;
		int d;
		int somDiv=0;
		// 1ere question
		System.out.println("Veuillez saisir un nombre entier positif pour savoir si il est parfait s'il vous plaît"+"\n");

		//import Scanner
		Scanner sc=new Scanner(System.in);

		//lecture du nombre(nbrx).
		nbrx=sc.nextInt();
		
		System.out.println("Les diviseur stric de "+nbrx+" sont :"+"\n");
		sc.close();
		
		/* Condition pour entrer dans la boucle (for), le nombre doit etre un nombre pair.
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