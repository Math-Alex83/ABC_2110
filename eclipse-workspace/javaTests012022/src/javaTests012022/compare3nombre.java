package javaTests012022;

import java.util.Scanner;

public class compare3nombre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Lire 3 nombres a, b et c. Les écrire dans l'ordre croissant.
		
		//Déclaration des variables
		
		float nbrA;
		float nbrB;
		float nbrC;
		
		//création du scanner
		Scanner sc = new Scanner(System.in);
		
		// Écrire: "Veuillez saisir le premier nombre svp."
		System.out.println("Veuillez saisir le premier nombre s'il vous plaît.");
		// Lire: nbrA.
		nbrA = sc.nextFloat();
		
		//Écrire: "Veuillez saisir le deuxième nombre svp."
		System.out.println("Veuillez saisir le deuxième nombre s'il vous plaît.");
		// Lire: nbrB
		nbrB = sc.nextFloat();
		
		// Écrire: "Veuillez saisir le troisième nombre svp."		
		System.out.println("Veuillez saisir le troisième nombre s'il vous plaît.");
		// Lire: nbrC
		nbrC = sc.nextFloat();
		
		if ((nbrA<nbrB) && (nbrA<nbrC));
		{
		System.out.println(nbrA + "<" + nbrB + "<" + nbrC);
		
		}
		sc.close();
	}

}
