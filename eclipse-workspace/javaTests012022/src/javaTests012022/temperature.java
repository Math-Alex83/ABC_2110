package javaTests012022;

import java.util.Scanner;

public class temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Exo Tantque "Ma temp�rature"
		// d�claration de variable

		// chaine temperature
		double temperature ;

		//�crire "Veuillez informer votre Temp�rature svp."
		System.out.println("Veuillez informer votre Temp�rature s'il vous plait.");

		//Import Scanner
		Scanner sc = new Scanner(System.in);

		//lire temperature
		temperature = sc.nextDouble();

		//Tantque (temperature<38) faire
		while (temperature<38) {
			//ecrire "Vous allez tr�s bien !"
			System.out.println("Vous allez tr�s bien !");

			//ecrire "Veuillez encore informer votre Temp�rature svp."
			System.out.println("Veuillez encore informer votre Temp�rature s'il vous plait.");
			//lire temperature
			temperature = sc.nextDouble();
		}

		//ecrire "Courrez chez le Docteur! VITE!"
		System.out.println("Courrez chez le Docteur! VITE!");
		System.out.println("Trop tard, YOU LOOSE...");


		//Fermeture Scanner
		sc.close();

	}

}


// FIN & JEUX D'ESSAI OK.