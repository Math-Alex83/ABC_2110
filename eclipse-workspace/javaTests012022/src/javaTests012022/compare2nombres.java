package javaTests012022;

import java.util.Scanner;

public class compare2nombres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//D�claration des variables
		int nbrA;
		int nbrB;

		//cr�ation du scanner
		Scanner sc = new Scanner(System.in);

		//�crire "veuillez saisir le premier nombre svp"
		System.out.println("Veuillez saisir le premier nombre s'il vous plait.");
		//Lire nbrA
		nbrA = sc.nextInt();

		//�crire "Veuillez saisir le second nombre svp"
		System.out.println("Veuillez saisir le second nombre s'il vous plait.");
		//lire nbrB
		nbrB = sc.nextInt();

		//Traitement
		if (nbrA<nbrB) {
			//�crire (nbrA+"<"+nbrB)
			System.out.println(nbrA +"<"+ nbrB);}
		else if (nbrA>nbrB) {
			System.out.println(nbrB +"<"+ nbrA);
		}

		else if (nbrA==nbrB) {
			System.out.println(nbrA +" et "+ nbrB +" sont �gaux.");

		}

		sc.close();

	}

}
// Fin et jeu d'essaie OK//