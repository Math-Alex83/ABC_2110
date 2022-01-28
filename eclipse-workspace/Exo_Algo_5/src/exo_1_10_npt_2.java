import java.util.Scanner;

public class exo_1_10_npt_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double max_value=Double.MAX_VALUE;
		double npt=0;
		double nbrx; 
		double i;
		//int d;
		double result;
		
	
		//import Scanner
		Scanner sc=new Scanner(System.in);


		System.out.println("Veuillez saisir combient de nombres parfait vous souhaitez connaître s'il vous plaît"+"\n");
		nbrx=sc.nextDouble();

		//System.out.println("Les diviseur stric de "+nbrx+" sont :"+"\n");

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
			System.out.println(nbrx+max_value+" est un nombre parfait.");	
		}
		else 
		{
			System.out.println(nbrx+" n'est pas un nombre parfait.");
		}
		sc.close();
	}
}