package rayonsphere;

import java.util.Scanner;

public class AdansB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Exercice 5 Lire 2 nombres a et b. Mettre le contenu de a dans b et celui de b dans a.
		
		//Déclaration des variables
		
		//Réel boite a
		int a;
		//Réel boite b
		int b;
		//Réel boite tempon (t)
		int t;
		
		
		//Saisie des entrées
		//Création de l'outil scanner
		Scanner sc=new Scanner (System.in);
		
		//ecrire "Veuillez entrer un nombre dans la boite a svp"
		System.out.println("Veuillez entrer un nombre dans la boite (a) s'il vous plait");
		//lire a
		a = sc.nextInt();
		
		//ecrire "Veuillez entrer un nombre dans la boite (b) svp"
		System.out.println("Veuillez entrer un nombre dans la boite (b) s'il vous plait");
		//lire b
		b = sc.nextInt();
		
		//Traitement
		
		// t <-- b ; b <-- a ; a <-- t .
		t = b;
		b = a;
		a = t;
		
		
		//Affichage
		
		//ecrire "Le résultat est "+a 
		System.out.println("La boîte (a) est égal à "+a);
		System.out.println("La boîte  (b) est égal à "+b);
		
		sc.close();
	}

}
