import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class exoKm211 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Conversion de km en mi*/

		String saisi;
		int valeur;
		String unite="Miles";
		double resultat; // km divise par 1.609= (x Miles)
		double conVkm=1.609; // taux de conversion 1 miles=1.609 km
		String rejouer;
		Scanner sc=new Scanner(System.in);
		
		
		do 
		{
			System.out.println("Please enter a value in Km.\n Ou appuyez sur 'q' pour quitter.");
			
			saisi=sc.nextLine();


			if (!(saisi.equals("q")))
			{

				valeur = Integer.valueOf(saisi);

				if ((valeur>=0.01)&&(valeur<=1000000)) 
				{

					resultat=(valeur/conVkm);

					/*resultat=arrondir(resultat,3);*/ // cette methode fonctionne avec la fonction codee en dehor du main

					// BigDecimal est utiliser pour arrondir le chiffre apres la virgule.
					BigDecimal resultat2 = new BigDecimal (resultat).setScale(3,RoundingMode.HALF_UP);
					System.out.println("La conversion de"+" "+valeur+" "+"Km"+" "+"est "+resultat2+" "+unite);

				}

				else 
				{
					do 
					{
						System.out.println("Votre saisie est incorrect,\n"
								+ "Vous devez saisir une valeur comprise entre (0.01 et 1 000 000) s'il vous plait.\n"
								+ "Ou appuyez sur 'q' pour quitter.");
						saisi=sc.nextLine();
						valeur = Integer.valueOf(saisi);
					}
					while ((valeur<=0) || (valeur>=1000001));
				}



			}
			

			else 
			{
				System.out.println("End of program");
			}
			System.out.println("\nVoullez-vous faire une autre conversion ? oui/non ");
			rejouer=sc.nextLine();

			

		}
		while (rejouer.equals("oui"));
		sc.close();
	}

	/*public static double arrondir(double valeur, int decimales) {
		return (new BigDecimal(valeur).setScale(decimales, RoundingMode.HALF_UP)).doubleValue();*/


}
