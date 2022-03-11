package travauxTableau;

import java.util.Scanner;

/* Travail sur 2 tableaux*/
public class tabAdditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String saisieU;
		String[] tab1 = new String [20];
		String[] tab2;
		int i=0;
		//boolean lanceLeCalcule=false;
		float resultat;
		float index=0;
		Scanner sc = new Scanner (System.in);

		do{
			System.out.println("Entrez votre valaur à additionner");
			saisieU = sc.nextLine();
			tab1[i] = saisieU;
			i++;
			sc.close();
		}
	while (!(saisieU.equals("go")));
			if (saisieU.equals("go")) 
			{
				tab2=tab1[i].split(";");
				
				for (i=0;i<tab2.length;i++)
				{

					//index=index+tab2[i];
				}
				resultat = index;
				System.out.println(resultat);
				
			}







		
	}
}