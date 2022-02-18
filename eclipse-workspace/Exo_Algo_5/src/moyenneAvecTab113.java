import java.util.Scanner;

public class moyenneAvecTab113 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		String[] tabMoyenne;
		int index;
		double resulte;
		String notes;
		int i;
		System.out.println("Veuillez saisir vos valeurs séparées d'un espace comme suit : '12.5 45 54.5' ");
		notes = sc.nextLine();
		tabMoyenne = notes.split(" ");
		{
			
		System.out.println(tabMoyenne.length);
		
		}
		
		
		
		sc.close();
	} // Fin de main.

} // Fin de programme.
