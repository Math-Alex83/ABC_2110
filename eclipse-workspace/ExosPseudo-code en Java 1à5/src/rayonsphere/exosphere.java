package rayonsphere;

import java.util.Scanner;

public class exosphere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Traduction du pseudo code en Java

		//Déclarations des variables

		//Réel rayon
		double rayon;
		
		//Réel surface
		double surface;
		
		//Réel volume
		double volume;


		//Saisie des entrées

		//ecrire "Veuillez saisir le rayon s'il vous plait"
		System.out.println("Veuillez saisir le rayon s'il vous plait");

		//lire rayon
		Scanner sc=new Scanner(System.in); //créer un outil scanner
		rayon = sc.nextFloat();
		
		
		//Traitement
		
		surface = 4*Math.PI*Math.pow(rayon, 2);
		volume = 4D/3*Math.PI*Math.pow(rayon, 3);
		
		
		//Affichages
		
		//ecrire "La valeur de la surface est de"+surface 
		System.out.println("La valeur de la Surface est de "+surface);
			
		//ecrire "La valeur du volume est de"+volume
		System.out.println("Le valeur du Volume est de "+volume);
			

		sc.close();
	}

}
