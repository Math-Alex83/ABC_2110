package rayonsphere;

import java.util.Scanner;

public class ExoLectureAttentive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Éxercice 1 faire la lecture attentive.

		// Déclaration des variables

		String reponse1;
		String reponse2;
		
		// import scanner
		Scanner sc = new Scanner(System.in);

		// Première instruction
		System.out.println("Faites une lecture attentive du texte s'il vous plait.");

		// 1ère question
		System.out.println("La lecture est-elle comprise ?");

		// Réccupération de la réponse1
		reponse1 = sc.nextLine();

		// Début de la condition

		if (reponse1.equals("non")){
			System.out.println("Lire une nouvelle fois le texte s'il vous plait.");

			// Demander si la relecture est comprise.
			System.out.println("La relecture est-elle comprise ?");
			// Réccupération de la réponse utilisateur
			reponse2 = sc.nextLine();

				// Si réponse2=non alors, demander au formateur
				if (reponse2.equals("non")) {
					// Alors
							System.out.println("Demandez de l'aide au formateur.");
				}			
		}
		
		
		// Fin des conditions, faire le travail demandé.
		System.out.println("Vous pouvez faire le travail demandé.");

		// Fermeture du scanner
		sc.close();
	}
	
}