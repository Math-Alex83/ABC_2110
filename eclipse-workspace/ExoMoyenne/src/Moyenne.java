import java.util.Scanner;

public class Moyenne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Traduction du pseudo code en code Java

		//declaration des variables
		
		//Réel nombre1
		float nombre1;
		
		//Réel nombre2
		float nombre2;
		
		//Réel moyenne
		float moyenne;

		
		//Saisies des entrées

		// ecrire "Veuillez entrer le premier nombre svp"
		System.out.println("Veuillez entrer le premier nombre svp");
		//lire nombre1
		Scanner sc=new Scanner(System.in); //creer un outil scanner
		nombre1 = sc.nextFloat();
		System.out.println("Vous avez saisie nombre1="+nombre1);

		//ecrire "Veuillez entrer le second nombre svp")
		System.out.println("Veuillez entrer le second nombre svp");
		//lire nombre2
		nombre2 = sc.nextFloat();
		System.out.println("Vous avez saisie nombre2="+nombre2);
		
		
		//Traitement
		
		//moyenne <-- (nombre+nombre2)/2 
		moyenne = (nombre1+nombre2)/2;
		
		
		//Affichage
		
		//ecrire moyenne
		System.out.println("la valeur de la moyenne est de "+moyenne);
		
		sc.close();
	}

}
