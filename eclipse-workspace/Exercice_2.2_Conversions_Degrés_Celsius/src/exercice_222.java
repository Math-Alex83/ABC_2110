import java.util.Scanner;

/*L’utilisateur saisit une unité de mesure (C ou F).
 * 
-->Il saisit ensuite une plage de valeurs (minimum, maximum).

-->Une fois les 2 valeurs saisies, le programme convertit toute la plage de valeur et affiche le résultat.

-->La commande « quit » permet de quitter le programme. 

-->Tant que cette commande n’est pas saisie, l’utilisateur peut continuer à faire des conversions.*/

public class exercice_222 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String unite;
		double valuMini=0;
		double valuMax=0;
		double valuInt=0;
		double[] montab1=new double [100];
		//double[] montab2;		
		//double result=0;
		double index;//=valuMini+1.00
		int i=0;//;
		
		
		
		System.out.println("Programme de conversion Celsius <-> Fahrenheit.\n\nSaisir une unité de mesure (C ou F) :");	
		Scanner sc = new Scanner(System.in);
		unite=sc.next();
		
		System.out.println("Enter the minimum value :");
		valuMini=sc.nextDouble();
		
		System.out.println("Enter the maximum value (must be higher than the minimum value) : ");
		valuMax=sc.nextDouble();
		sc.close();
		for(index=valuMini+1;index<valuMax;index++)
		{
			valuInt=index;
			montab1[i]=valuInt;
			i++;
		}
		
		System.out.println(valuMini+","+ montab1[i] +","+valuMax);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}



