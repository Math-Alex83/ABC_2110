import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class exokm212 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*L’utilisateur peut choisir le sens de la conversion.
		 * Il saisit une valeur à convertir avec son unité de mesure (km ou mi).
		 * Si aucune unité de mesure n’est indiquée, le programme considère la valeur en kilomètres.*/

		String[] monTab;
		String saisiU;
		double valeur;
		String unite2Mesure="km";
		double resultat;
		double tau2Conv=1.609344;
		String rejouer;


		Scanner sc=new Scanner(System.in);
		do 
		{
			// je demande de rentrer une valeur et une unite de mesure separer d1 espace.
			System.out.println("Enter a value and its unit of measurement (separated by a space)");
			saisiU=sc.nextLine();

			// j affiche ce que l utilisateur a entrer comme information.
			//System.out.println(saisiU);

			// j'incrémante dans monTableau la saisi Utilisateur avec le split. pour separer les informations.
			monTab=saisiU.split(" ");

			// mtn je dis que la premiere info dans celule 0 est converti en double
			valeur = Double.valueOf(monTab[0]);

			if (monTab.length>1)
			{
				
				unite2Mesure=monTab[1];
				unite2Mesure=unite2Mesure.toLowerCase();
			}

			// si dans la case 1 (donc la 2eme active) c est km, conv de km -> Miles.
			if ((unite2Mesure.equals("km")) || (unite2Mesure.equals("")))
			{
				// traitement 
				resultat=valeur/tau2Conv;

				// je reduits la reponse a 2 chiffre apres la virgule.
				BigDecimal resultatM = new BigDecimal (resultat).setScale(2,RoundingMode.HALF_UP);

				// affichage du resultat.
				System.out.println(valeur+" "+unite2Mesure+" est égal à : "+resultatM+" "+"Miles");
			}
			else 
			{
				resultat=valeur*tau2Conv;
				// je reduits la reponse a 2 chiffre apres la virgule.
				BigDecimal resultatK = new BigDecimal (resultat).setScale(2,RoundingMode.HALF_UP);
				System.out.println(valeur+" "+unite2Mesure+" est egal à : "+resultatK+" "+"km");
			}

			System.out.println("Do you want to make another calculation ? y/n ");
			rejouer=sc.nextLine();

		}
		while (rejouer.equals("y"));
		sc.close();
		
		
		// fin jeux d'essai OK
	}
} 