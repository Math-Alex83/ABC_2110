import java.util.Scanner;

public class anneeBisxtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int annee;
		//double reste;

		System.out.println("Votre Année est-elle une année Bissextile ?");

		//import scanner
		Scanner sc = new Scanner(System.in);

		// Affichage du méssage pour débuter l'éxo.
		System.out.println("Veuillez saisir une année s'il vous plaît.");

		// Lecture de l'année choisi par l'utilisateur
		annee = sc.nextInt();

		System.out.println(estBisextil(annee)? "l'année est bisextil" : "L'année n'est pas bisextil");

		sc.close();

	}
public static boolean estBisextil(int annee) {
	
	return (annee%4==0 && (annee% 100!=0 || annee%400==0));
	
}
}
