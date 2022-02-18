import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class exoKm211 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Conversion de km en mi*/

		String saisi;
		double valeur;
		String unite="Miles";
		double resultat; // km divise par 1.609= (x Miles)
		double conVkm=1.609; // taux de conversion 1 miles=1.609 km
		String rejouer;
		boolean veutQuitter = false;

		Scanner sc = new Scanner(System.in);
		do 
		{

			System.out.println("Please enter a value in Km.\n Ou appuyez sur 'q' pour quitter.");

			saisi=sc.nextLine();

			if (saisi.equals("q"))
			{
				veutQuitter = true;
				System.out.println("End of program");

			}

			else {
				valeur = Double.valueOf(saisi);

				if ((valeur>=0.01)&&(valeur<=1000000)) 
				{
					resultat=(valeur/conVkm);

					// BigDecimal est utiliser pour arrondir le chiffre apres la virgule.
					BigDecimal resultat2 = new BigDecimal (resultat).setScale(2,RoundingMode.HALF_UP);
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
						valeur = Double.valueOf(saisi);
						resultat=(valeur/conVkm);

						// BigDecimal est utiliser pour arrondir le chiffre apres la virgule.
						BigDecimal resultat2 = new BigDecimal (resultat).setScale(2,RoundingMode.HALF_UP);
						System.out.println("La conversion de"+" "+valeur+" "+"Km"+" "+"est "+resultat2+" "+unite);

					}

					while ((valeur<=0) || (valeur>=1000000));
				}
				System.out.println("\nVoullez-vous faire une autre conversion ? oui/non ");

			}
			rejouer=sc.nextLine();
		}	
		while (rejouer.equals("oui") && !veutQuitter);

		sc.close();
	}
}