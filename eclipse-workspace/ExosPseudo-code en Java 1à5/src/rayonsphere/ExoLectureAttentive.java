package rayonsphere;

import java.util.Scanner;

public class ExoLectureAttentive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �xercice 1 faire la lecture attentive.

		// D�claration des variables

		String reponse1;
		String reponse2;
		
		// import scanner
		Scanner sc = new Scanner(System.in);

		// Premi�re instruction
		System.out.println("Faites une lecture attentive du texte s'il vous plait.");

		// 1�re question
		System.out.println("La lecture est-elle comprise ?");

		// R�ccup�ration de la r�ponse1
		reponse1 = sc.nextLine();

		// D�but de la condition

		if (reponse1.equals("non")){
			System.out.println("Lire une nouvelle fois le texte s'il vous plait.");

			// Demander si la relecture est comprise.
			System.out.println("La relecture est-elle comprise ?");
			// R�ccup�ration de la r�ponse utilisateur
			reponse2 = sc.nextLine();

				// Si r�ponse2=non alors, demander au formateur
				if (reponse2.equals("non")) {
					// Alors
							System.out.println("Demandez de l'aide au formateur.");
				}			
		}
		
		
		// Fin des conditions, faire le travail demand�.
		System.out.println("Vous pouvez faire le travail demand�.");

		// Fermeture du scanner
		sc.close();
	}
	
}