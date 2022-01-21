import java.util.Scanner;

public class exo_1_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Lire un nombre entier et déterminer tous ses diviseurs autres que 1 et lui-même.



		//Déclaration des variabbles 

		int nbrx;
		int diviseur;
		boolean diviseurTrouve = false;
		//int reste;

		// import Scanner
		Scanner sc=new Scanner(System.in);

		// Saisi des entrees

		System.out.println("Veuillez saisir un nombre entier s'il vous plait.");
		nbrx = sc.nextInt();

		// debut de la boucle For
		for (diviseur=2; diviseur<nbrx; diviseur++) 
		{
			if (nbrx%diviseur==0) 
			{
				System.out.println(diviseur+" est un diviseur de "+nbrx);
				diviseurTrouve = true;
			}

			// cloture scanner
			sc.close();
		}
		if (!diviseurTrouve)
		{
			System.out.println(nbrx+" est un nombre premier");
		}

	}
}