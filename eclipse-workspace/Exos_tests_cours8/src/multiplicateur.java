import java.util.Scanner;

public class multiplicateur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//TEST je crée un multiplicateur avec booucle For! chaud le chamalooo!!
		Scanner sc=new Scanner(System.in);
		int nbrx;
		int i;
		int result;
		String reponse;
		do 
		{
			//System.out.println("Veuillez saisir un nombre entier \"svp\"."+"\n");
			System.out.println("Veuillez saisir un nombre entier s'il vous plaît ?");
			nbrx=sc.nextInt();
			System.out.println("Voici la table de "+nbrx+"\n");
			for (i=0; i<=10; i=i+1)
			{
				{
					result=nbrx*i;
					System.out.println(nbrx+" x "+i+" = "+result);
				}
			}
			System.out.println("\nSouhaitez-vous voire une autre table de multiplication ? oui/non ");
			reponse=sc.next();
		}
		while (reponse.equals("oui"));	
		sc.close();
	}
}