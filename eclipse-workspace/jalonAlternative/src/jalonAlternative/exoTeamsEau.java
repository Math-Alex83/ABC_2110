package jalonAlternative;

import java.util.Scanner;

public class exoTeamsEau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Permettre de lire la valeur d'une temp�rature de l'eau et afficher son �tat
		 * (GLACE) Si temp�rature < � 0�
		 * (LIQUIDE) Si la temp�rature est >0� ET <100�
		 * (VAPEUR) Si la temp�rature est =>100�
		 */
		
		float temp;
		
		System.out.println("Voyons dans quel �tat se met l'eau!");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Veuillez saisir une Temp�rature (en �C) s'il vous plait.");
		temp = sc.nextFloat();
		
		if (temp <=0)
		{
			System.out.println("A "+temp+"�C c'est de la GLACE!");
			System.out.println("Vous pouvez sortir les patains!");
		}
		else if ((temp >0) && (temp <100))
		{
			System.out.println("A "+temp+"�C c'est LIQUIDE!");
			System.out.println("Vous pouvez prendre votre maillot de bain!");
		}
		else if (temp >=100)
		{
			System.out.println("A "+temp+"�C c'est de la VAPEUR!");
			System.out.println("Vous pouvez aller faire un sauna!");
		}
		// Fermeture du Scanner
		sc.close();
	}
}
// exo fini, jeu d'essai ok'