package rayonsphere;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Calcul_interet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//D�claration des variables
		
		//Reel somme (S)
		float somme;
		//Reel interet (i)
		float interet; 
		//Entier nombre (n)
		int nombre;
		//Reel simple (resultat avec interet simple)
		double simple;
		//Reel compos� (resultat avec interet compose)
		double compose;
		
		
		//Saisie des entrees		
		//ecrire "veuillez renseigner la somme initiale s'il vous plait"
		System.out.println("Veuillez renseigner la somme initiale s'il vous plait");
		
		//creer un outil scanner
		Scanner sc=new Scanner(System.in);
		
		//lire somme
		somme = sc.nextFloat();
		
		//ecrire "veuillez renseigner le nombre d'ann�es s'il vous plait"
		System.out.println("Veuillez renseigner le nombre d'ann�e s'il vous plait");
		//lire nombre
		nombre = sc.nextInt();
		
		//ecrire "Veuillez renseigner le taux de l'int�ret s'il vous plait"
		System.out.println("Veuillez renseigner le taux d'int�ret s'il vous plait");
		//lire "le taux d'int�ret"
		interet = sc.nextFloat();
		
		//Traitement
		simple = (double)(somme*(1+nombre*interet));
		
		compose = (double)(somme*(Math.pow(1+interet, nombre)));
		
		
		
		//Affichage
		DecimalFormat df = new DecimalFormat("0.00");
		//ecrire "La valeur acquise avec interet Simple est de "+simple
		System.out.println("La valeur acquise avec int�ret simple est de "+df.format(simple));
		//ecrire "La valeur acquise avec int�ret compos� est de "+compos�
		System.out.println("La valeur acquise avec int�ret compos� est de "+df.format(compose));
		
		sc.close();	
	}

}
