//import java.io.InputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
/*->L’utilisateur peut saisir plusieurs valeurs à convertir.
 * 
->Il saisit une valeur à convertir avec son unité de mesure (km ou mi).

->Si aucune unité de mesure n’est indiquée, le programme considère la valeur en kilomètres.

->A l’appui de la touche « Entrée », la valeur saisie est enregistrée dans un tableau en mémoire.
L’utilisateur peut enregistrer autant de valeurs qu’il souhaite.

->Si l’utilisateur saisit la commande « go », le programme convertit toutes les valeurs mémorisées et affiche le résultat 
de chaque conversion.

->La commande « quit » permet de quitter le programme. Tant que cette commande n’est pas saisie, l’utilisateur peut 
continuer à faire des conversions.*/
public class exo213bis {

	public static void main(String[] args) {

		String[] monTab1 = new String[100]; 
		String saisieU;
		boolean conversion = false;
		int index = 0;
		String[] monTab2;
		String unite;
		double valeur;
		double resultat;
		double tau2Conv=1.609344;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Pour convertir vos valeurs,\n"
				+ "Veuillez saisir la valeur puis l'unité de mesure séparées d'un espace dans la limite de 100 valeurs,\n"
				+ "Exemple : 12 km\n"
				+ "Si aucune unité n'est précisée, l'unité par défault est le km.\n ");
		
		do 
		{
			System.out.println("Saisir votre valeur svp");
			saisieU=sc.nextLine();
			
			if (!(saisieU.equals("go")))
			{
				monTab1[index]=saisieU;				
				index=index+1;				
			}
			else 
			{
				conversion=true;
			}			
		}
		while (!conversion);
		
		if (conversion=true) // a partir dici je colle le traitement stantard ! jusque là code est ok si erreur c'est d'ici! 
		{
			 /* ici i< à index car monTab1=100 emplacements donc ne doit prendre en compte que les données stocké 
			  * car si i<monTab.length c'est la totalité du tab et donc donne une erreur de i null !!
			  */
			for (int i=0; i< index; i++)
			{
				monTab2 = monTab1[i].split(" ");
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
		}

sc.close();
	}
}