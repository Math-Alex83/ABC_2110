import java.util.Scanner;

public class annee_A2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//exercice lire une annee A avec 1 condition.
		
		// Variable
		int annee;
		
		//Saisi des entrees
		System.out.println("Veuillez saisir une année s'il vous plait.");
		 //import du Scanner
		Scanner sc = new Scanner(System.in);
		
		//lecture de l'annee
		annee = sc.nextInt();
		
		if (((annee % 4)== 0) && (!((annee % 100) == 0) && ((annee % 400) != 0))) {
			System.out.println("L'année "+annee+" est Bissextile.");
		
		}
		
		else {
			System.out.println("L'année "+annee+" n'est pas Bissextile.");
			
		}
			
						
		// Cloture du scanner
		sc.close();
	
	}
}
// Fin d'exo, jeu d'essai OK