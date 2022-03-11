import java.util.Scanner;

public class anneeBisxtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int annee;
		//double reste;

		System.out.println("Votre Ann�e est-elle une ann�e Bissextile ?");

		//import scanner
		Scanner sc = new Scanner(System.in);

		// Affichage du m�ssage pour d�buter l'�xo.
		System.out.println("Veuillez saisir une ann�e s'il vous pla�t.");

		// Lecture de l'ann�e choisi par l'utilisateur
		annee = sc.nextInt();

		System.out.println(estBisextil(annee)? "l'ann�e est bisextil" : "L'ann�e n'est pas bisextil");

		sc.close();

	}
public static boolean estBisextil(int annee) {
	
	return (annee%4==0 && (annee% 100!=0 || annee%400==0));
	
}
}
