import java.util.Scanner;

/*L’utilisateur saisit une unité de mesure (C ou F).
 * 
-->Il saisit ensuite une plage de valeurs (minimum, maximum).

-->Une fois les 2 valeurs saisies, le programme convertit toute la plage de valeur et affiche le résultat.

-->La commande « quit » permet de quitter le programme. 

-->Tant que cette commande n’est pas saisie, l’utilisateur peut continuer à faire des conversions.*/
public class exo222AvecTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double valeurMini;
		double valeurMax;
		double resultat;
		
		Scanner sc=new Scanner (System.in);
		
		
		System.out.println("veuillez saisir votre valeur minimum");
		valeurMini=sc.nextDouble();
		
		System.out.println("veuillez saisir votre valeur maximum");
		valeurMax=sc.nextDouble();
		
		
		
		//provisoir pour test tab1
				/*System.out.println(valuMini);

				for(index=valuMini+1;index<valuMax;index++)
				{		
					montab1[i]=index;
					// test tab1 i++ reste
					System.out.println(montab1[i]);
					i++;
				}

				System.out.println(valuMax);*/
		
		
		
		
		
		
		
		
		
		
		
		
		
	sc.close();	
		
	}

}
