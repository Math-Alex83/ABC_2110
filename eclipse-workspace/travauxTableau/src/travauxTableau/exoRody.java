package travauxTableau;

import java.util.Scanner;


public class exoRody {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String saisieUtil;
		int [] tabSaisiU;

		Scanner sc= new Scanner(System.in);
		do 
		{
			System.out.println("Veuillez entrer une date de naissance comme suit : jj/mm/aaaa ");
			saisieUtil=sc.nextLine();
			tabSaisiU=dateToInt(saisieUtil);
			if (!dateCorrect(tabSaisiU)) {
				System.out.println("Veuillez ressaisir la date est incorrecte");
			}
			if (tabSaisiU.length == 3) {
				System.out.println(estBisextil(tabSaisiU[2]) ? "Bissextile" : "Non bissextile");
			} else {
				System.out.println("format incorrect");
			}
		}
		while (!dateCorrect(tabSaisiU));

		System.out.println("La date est correcte");
		sc.close();	
	}

	public static int[] dateToInt (String saisiU) 
	{
		String[] split = saisiU.split("/");
		int [] retour = new int[split.length];

		for (int i=0;i<split.length;i++) 
		{
			retour[i]=Integer.valueOf(split[i]);
		}
		return retour;
	}
	public static boolean dateCorrect (int[] tabDate) 
	{
		if (tabDate.length==3) 
		{
			if (tabDate[0]>=1 && tabDate[0]<=31 && tabDate[1]>=1 && tabDate[1]<=12 && tabDate[2]>=1900)
			{
				int [] nbJourMois = { 31,(estBisextil(tabDate[2]) ? 29 : 28),31,30,31,30,31,31,30,31,30,31};
				return tabDate[0] <= nbJourMois[tabDate[1]-1]; 
			}
		}
		return false;
	}
	public static boolean estBisextil(int annee) 
	{
		return (annee%4==0 && (annee% 100!=0 || annee%400==0));
	}
}
