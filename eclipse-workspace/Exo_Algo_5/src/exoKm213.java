import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class exoKm213 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// debut exo 14.02.22
		String saisieU;
		String[] monTab;
		String[] monTab2;
		String unite;
		double valeur;
		double resultat;
		double tau2Conv=1.609344;
		//boolean go = false;
		Scanner sc=new Scanner(System.in);


		System.out.println("Enter the values with units to convert separated by a ';' as follows: '12 km;23 mi' etc...");
		saisieU=sc.nextLine();
		monTab=saisieU.split(";");
		// les infos sont stockees dans le 1er tableau, mtn demande a l'utilisateur si go

		for (int i=0; i<monTab.length;i++) 
		{
			monTab2 = monTab[i].split(" ");
			valeur = Double.valueOf(monTab2[0]);

			if (monTab2.length==1) 
			{
				unite="km";
				// traitement 
				resultat=valeur/tau2Conv;

				// je reduits la reponse a 2 chiffre apres la virgule.
				BigDecimal resultatM = new BigDecimal (resultat).setScale(2,RoundingMode.HALF_UP);

				// affichage du resultat.
				System.out.println(valeur+" "+unite+" est égal à : "+resultatM+" "+"Miles");
			}

			else if (monTab2.length>1) 
			{
				unite=monTab2[1];
				unite=unite.toLowerCase();

				// si dans la case 1 (donc la 2eme active) c est km, conv de km -> Miles.
				if ((unite.equals("km")) || (unite.equals(" ")))
				{
					// traitement 
					resultat=valeur/tau2Conv;

					// je reduits la reponse a 2 chiffre apres la virgule.
					BigDecimal resultatM = new BigDecimal (resultat).setScale(2,RoundingMode.HALF_UP);

					// affichage du resultat.
					System.out.println(valeur+" "+unite+" est égal à : "+resultatM+" "+"Miles");
				}
				else 
				{
					resultat=valeur*tau2Conv;
					// je reduits la reponse a 2 chiffre apres la virgule.
					BigDecimal resultatK = new BigDecimal (resultat).setScale(2,RoundingMode.HALF_UP);
					System.out.println(valeur+" "+unite+" est egal à : "+resultatK+" "+"km");
				}
			}
		}		
		sc.close();
	}
}