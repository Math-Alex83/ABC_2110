import java.util.Scanner;

public class Classer_3_nbrs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// LIRE 3 NOMBRES A, B ET C ET LES CLASSER DANS L'ORDRE CROISSANT.

		//Déclaration des variables

		int a;
		int b;
		int c;

		// import scanner
		Scanner sc = new Scanner(System.in);

		// ecrire " Veuillez saisir le premier nombre svp"
		System.out.println("Veuillez saisir le 1er nombre s'il vous plait.");
		// lire a
		a = sc.nextInt();

		// ecrire " Veuillez saisir le 2ème nombre svp"
		System.out.println("Veuillez saisir le 2ème nombre s'il vous plait.");
		// lire b
		b = sc.nextInt();

		// ecrire "Veuillez saisir le 3ème nombre svp"
		System.out.println("Veuillez saisir le 3ème nombre s'il vous plait");
		//lire c
		c = sc.nextInt();

		//Si a<b et que b<c alors
		if ((a<b) && (b<c))
		{
			// ecrire a<b<c
			System.out.println("L'ordre croissant est: "+a+" < "+b+" < "+c);
		}
		// Si a>b et que b>c alors
		else if ((a<c) && (c<b))
		{
			// ecrire a<c<b
			System.out.println("L'ordre croissant est: "+a+" < "+c+" < "+b);
		}
		// Si b<a et que a<c alors
		else if ((b<a) && (a<c))
		{
			// ecrire b<a<c
			System.out.println("L'ordre croissant est: "+b +" < "+a+" < "+c);
		}
		// Si b<c et que c<a alors
		else if ((b<c) && (c<a))
		{
			// ecrire b<c<a
			System.out.println("L'ordre croissant est: "+b+" < "+c+" < "+a);
		}
		// Si c<a et que a<b alors
		else if ((c<a) && (a<b))
		{
			// ecrire c<a<b
			System.out.println("L'ordre croissant est: "+c+" < "+a+" < "+b);
		}
		// Si c<b et que b<a alors
		else if ((c<b) && (b<a))
		{
			// ecrire c<b<a
			System.out.println("L'ordre croissant est: "+c+" < "+b+" < "+a);
		}
		//fermeture du scanner
		sc.close();

	}
}
// Fin d'éxercice, jeu d'essai OK. 
// Voir pour rajouter les égalitées! 
