package projetUML;

import java.util.Scanner;

public class program_age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age;
		//String resultat;
		String rep;

		Scanner sc=new Scanner(System.in);
		do 
		{
			{
				System.out.println("Veuillez saisir un age s'il vous plaît.");
			}

			age=sc.nextInt();

			
			/*resultat=estIlMajeur(age);
	System.out.println(resultat);*/
			{
				System.out.println("Vous avez : "+age+"ans"+" Vous êtes donc " + estIlMajeur(age));
			}
			{
				System.out.println("Voulez-vous entrer un nouvel âge?");
			}
			rep=sc.next();

		}
		while (!rep.equals("non"));
		sc.close();
	}


	public static String estIlMajeur(int ageATester) 
	{


		if (ageATester>=18) 

			return "Majeur !";

		else 

			return "Mineur !";
	}
}
