import java.util.Scanner;

public class Classer_2_nbrs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Éxercice 1 classer dans l'ordre croissant a et b

		int a;
		int b;

		// import Scanner
		Scanner sc = new Scanner(System.in);

		// Affichage des consignes
		System.out.println("Veuillez saisir le 1er nombre s'il vous plait.");
		a = sc.nextInt();

		System.out.println("Veuillez saisir le 2ème nombre s'il vous plait.");
		b = sc.nextInt();

		System.out.println("Vous avez saisi, "+a+" et "+b);

		if (a<b) {
			System.out.println(a+" est plus petit que "+b);
		}
		else if (b<a) {
			System.out.println(b+" est plus petit que "+a);
		}
		else if (a==b) {
			System.out.println("Les nombres "+a+" et "+b+" sont éguaux");
		}
		sc.close();
	}
}
