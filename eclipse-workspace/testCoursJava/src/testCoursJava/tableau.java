package testCoursJava;

import java.util.Scanner;

public class tableau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String saisie;
		String[] tableauDeConversion;
		int valeur;
		String uniteDeMesure;
		double conversion;
		Scanner sc = new Scanner(System.in);

		System.out.println("Entrez une valeur suivie de MI ou KM:");

		saisie = sc.nextLine(); // "12 mi"

		tableauDeConversion = saisie.split(" ");

		valeur = Integer.valueOf(tableauDeConversion[0]);

		if(tableauDeConversion.length > 1) 
		{
			uniteDeMesure = tableauDeConversion[1];
		}
		else 
		{
			uniteDeMesure = "km";
		}

		uniteDeMesure = uniteDeMesure.toLowerCase();

		if(uniteDeMesure.equals("km")) 
		{
			// conversion en km vers mi
			conversion= (valeur/1.609);
			System.out.println(" La distance "+valeur+" en km vaut "
					+conversion+" Miles");
		}
		else 
		{
			// conversion mi vers km
			conversion= (valeur*1.609);
			System.out.println(" La distance "+valeur+" en miles vaut "
					+conversion+" km");
		}

		// affichage du résultat

		sc.close();	
	}
}