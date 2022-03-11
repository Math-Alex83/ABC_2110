import java.util.Scanner;

public class moyenneAvecTab113 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		//String saisiUtil;
		String[] tabSaisi;
		double index=0;
		double resultat=0;
		int i;
		//double moyenne;
		//double[] tabMoyenne;

		System.out.println("Veuillez saisir les valeurs à calculer séparer d'un point virgulr  comme suit : 20;15.5;... ");

		tabSaisi=sc.nextLine().split(";");

		sc.close();

		for ( i=0;i<tabSaisi.length;i++) 
		{
			//pour test
			//System.out.println(tabSaisi[i]);
			index=index+Double.valueOf(tabSaisi[i]);
		}		
			resultat=(index/tabSaisi.length);
			System.out.println(resultat);

	} // Fin de main.

} // Fin de programme.
