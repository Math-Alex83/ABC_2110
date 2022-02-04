import java.util.Scanner;

public class el_divisator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int nbrx;
		int i;
		int result;
		String reponse;
		// Diviseur ? Même pas peur!!! // autre que 1 et lui même modifié le 21/01/22		
		do 
		{
			//System.out.println("Veuillez saisir un nombre entier \"svp\"."+"\n");
			System.out.println("Veuillez saisir un nombre entier à diviser s'il vous plaît ?");
			nbrx=sc.nextInt();
			System.out.println("Voici la divivision de "+nbrx+"\n");
			for (i=1; i<=(nbrx/2); i=i+1)//i=2 pour ne pas avoir 1 et nbrx-1 pour ne pas avoir lui-même.
			{
				if (nbrx%i==0)
				{
					result=nbrx/i;
					System.out.println(nbrx+" / "+i+" = "+result);
				}
			}
			System.out.println("\nSouhaitez-vous divisiser un autre nombre ? oui/non ");
			reponse=sc.next();
		}
		while (reponse.equals("oui"));	
		sc.close();
	}
}