package javaTests012022;

import java.util.Scanner;

public class compare3nombre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Lire 3 nombres a, b et c. Les �crire dans l'ordre croissant.
		
		//D�claration des variables
		
		float nbrA;
		float nbrB;
		float nbrC;
		
		//cr�ation du scanner
		Scanner sc = new Scanner(System.in);
		
		// �crire: "Veuillez saisir le premier nombre svp."
		System.out.println("Veuillez saisir le premier nombre s'il vous pla�t.");
		// Lire: nbrA.
		nbrA = sc.nextFloat();
		
		//�crire: "Veuillez saisir le deuxi�me nombre svp."
		System.out.println("Veuillez saisir le deuxi�me nombre s'il vous pla�t.");
		// Lire: nbrB
		nbrB = sc.nextFloat();
		
		// �crire: "Veuillez saisir le troisi�me nombre svp."		
		System.out.println("Veuillez saisir le troisi�me nombre s'il vous pla�t.");
		// Lire: nbrC
		nbrC = sc.nextFloat();
		
		if ((nbrA<nbrB) && (nbrA<nbrC));
		{
		System.out.println(nbrA + "<" + nbrB + "<" + nbrC);
		
		}
		sc.close();
	}

}
