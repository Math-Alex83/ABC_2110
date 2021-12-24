import java.util.Scanner;

public class Mme2Bovary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// D�claration des variables
		String reponse1;
		String reponse2;
		String reponse3;
		String reponse4;
		String reponse5;

		// Affichage 
		// ecrire "Fait-il beau demain ?"
		System.out.println("Fait-il beau demain ?");

		// importation du scanner
		Scanner sc = new Scanner(System.in);

		//lire reponse1
		reponse1 = sc.next();
		// condition Si (reponse1="oui") Alors
		if (reponse1.equals("oui")) {
			//�crire (Le v�lo est-il en bon �tat ?)
			System.out.println("Le v�lo est-il en �tat ?");
			//lire la reponse2
			reponse2 = sc.next();

			if (reponse2.equals("non")) 
			{
				//ecrire "Je passe au garage"
				System.out.println("Je passe au garage");
				//ecrire "Le v�lo est-il r�parable"
				System.out.println("Le v�lo est-il r�parable ?");

				//lire reponse3
				reponse3 = sc.next();
				if (reponse3.equals("non")) 
				{

					//ecrire "J'irai cueuillir des Joncs"
					System.out.println("J'irai cueuillir des Joncs");
				}
				else {
					// �crire "j'irai faire une balade � v�lo	
					System.out.println("J'irai faire une balade � v�lo");
				}
			}
			//sinon
			else {
				System.out.println("Je vais faire une balade � v�lo");
			}
		}
		else 
		{

			// �crire "J'irai � la biblioth�que du salon"
			System.out.println("Je vais � la biblioth�que du salon");	
			//�crire "Le livre, Mme Bovary' y est-il?"
			System.out.println("Le livre, Mme Bovary' y est-il ?");
			//lire reponse4
			reponse4 = sc.next();

			// Si (reponse4=="non") Alors
			if (reponse4.equals("non")) 
			{
				//ecrire "Je vais � la biblioth�que municipale"
				System.out.println("Je vais � la biblioth�que municipale");
				//ecrire "Ont-ils Mme Bovary'?"
				System.out.println("Ont-ils le livre: Mme Bovary'?");
				//lire reponse5
				reponse5 = sc.next();

				// Si (reponse == "non") Alors
				if (reponse5.equals("non")) 
				{
					//�crire "Prendre un livre policier"
					System.out.println("Je prends un livre Policier");
				}
				else {
					//�crire "Je prends le livre: Mme Bovary'"
					System.out.println("Je prends le livre: Mme Bovary'");
				}
				// Je rentre � la maison"
				System.out.println("Je rentre � la maison");
			}	
			// �crire "Je m'installe et je lis"
			System.out.println("Je m'installe et je lis");
			// Fermeture du scanner

		}
		sc.close();
	}	
}	



