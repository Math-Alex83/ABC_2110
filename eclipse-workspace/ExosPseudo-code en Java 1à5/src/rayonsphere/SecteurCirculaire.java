package rayonsphere;

import java.util.Scanner;

public class SecteurCirculaire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Traduction du pseudo code en Java
		
		
		//Déclaration des variables
		
		//Réel rayon 
		double rayon;
		
		//Réel angle en degré
		double angle;
		
		//Réel surface
		double aire;
		
		
		//Saisie des enytrées
		
		//ecrire "Veuillez saisir le rayon s'il vous plait"
		System.out.println("Veuillez saisir le rayon s'il vous plait");
		
		//lire rayon
		//créer un outil scanner
		Scanner sc=new Scanner(System.in); 	
		rayon = sc.nextFloat();
		
		//écrire "Veuillez saisir l'angle en degré s'il vous plait"
		System.out.println("Veuillez saisir l'angle en degré s'il vous plait");
		
		//lire angle
		angle = sc.nextFloat();
		
		
		//Traitement
		
		aire = (Math.PI)*(Math.pow(rayon, 2))*(angle)/360;
		
		
		//Affichage
		//ecrire "L'aire du secteur circulaire est de "
		
		System.out.println("L'aire du secteur circulaire est de "+aire);
		
		sc.close();
	}

}
