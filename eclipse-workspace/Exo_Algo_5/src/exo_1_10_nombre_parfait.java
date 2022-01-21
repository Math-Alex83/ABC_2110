import java.util.Scanner;

public class exo_1_10_nombre_parfait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* le nombre parfait, est un nombre dont la somme de ses diviseur "strict" autre que lui meme est egal au nombre*/
		/* exmple pour "6" ses diviseurs strict sont 1,2,3,6 donc 1+2+3=6 alors 6 est un nombre dit parfait*/

		double npt=0;
		int nbrx;
		int i;
		//int d;
		double result;
		//import Scanner
		Scanner sc=new Scanner(System.in);


		System.out.println("Veuillez saisir un nombre pour savoir si c'est un nombre parfait s'il vous plaît"+"\n");
		nbrx=sc.nextInt();

		System.out.println(+nbrx+" est-il un nombres parfaits ?"+"\n");
		System.out.println("Les diviseur stric de "+nbrx+" sont :"+"\n");

		for (i=1; i<nbrx; i=i+1)//i=2 pour ne pas avoir 1 et nbrx-1 pour ne pas avoir lui-même.
		{
			if (nbrx%i==0)
			{
				result=nbrx/i;
				npt+=i;
				System.out.println(i);
			}
		}
		if (npt==nbrx) 
		{
			System.out.println(nbrx+" est un nombre parfait.");	
		}
		else 
		{
			System.out.println(nbrx+" n'est pas un nombre parfait.");
		}
		sc.close();
	}
}