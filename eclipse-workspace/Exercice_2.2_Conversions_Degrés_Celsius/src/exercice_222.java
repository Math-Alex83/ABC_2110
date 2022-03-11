import java.math.BigDecimal;
import java.math.RoundingMode;
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
		double result=0;

		System.out.println("Programme de conversion Celsius <-> Fahrenheit.\n\nSaisir une unité de mesure (C ou F) :");	
		Scanner sc = new Scanner(System.in);
		unite=sc.next();
		unite=unite.toLowerCase();

		System.out.println("Enter the minimum value :");
		valuMini=sc.nextDouble();

		System.out.println("Enter the maximum value (must be higher than the minimum value) : ");
		valuMax=sc.nextDouble();
		sc.close();

		
		for (valuInt=valuMini;valuInt<=valuMax;valuInt++) 
		{
		if ((unite.equals("c")) || (unite.equals("")))
		{
			result=((valuInt*9/5)+32);
			BigDecimal resultatM = new BigDecimal (result).setScale(3,RoundingMode.HALF_UP);
			System.out.println(valuInt+"°C"+" vaut : "+resultatM+" °F");
		}
		else if (unite.equals("f")) 
		{
			result=(valuInt-32)*5/9;
			BigDecimal resultatM = new BigDecimal (result).setScale(3,RoundingMode.HALF_UP);
			System.out.println(valuInt+"°F"+" vaut : "+resultatM+" °C");
		}
		
		}

sc.close();

	}

}



