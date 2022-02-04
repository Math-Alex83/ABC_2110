package projetUML;

import java.util.Scanner;

public class exoAge2LaRetraite48 {
	
	//static int monAge;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Creer une fonction <<getRetired()>> acceptant un argument de type int. Elle devra retourner a un String.
		 * Cette fonction permet de calculer le nombre d'annees restant avant la retraite 
		 * ou le nombre d'annees depuis la retraite.
		 * Pour cet exo, l'age de la retraite est fixe a 60ans.*/
		/*Exemples:
		 * getRetired(12);//retourne "il vous reste 48 ans avant la retraite."
		 * getRetired(60);//retourne "Vous etes a la retraite cette annee."
		 * getRetired(72);//retourne "Vous etes a la retraite depuis 12 ans."
		 * getRetired(-2);//retourne "Vous n'etes pas encore ne." */
		// Declaration de variable
		int age;
		//création du Scanner.
		Scanner sc=new Scanner (System.in);
		//Debut et pose de la 1ere question.
		System.out.println("Please enter your age");
		age=sc.nextInt();		
		System.out.println(getRetired(age));		
		sc.close();
	}	
	public static String getRetired(int ageSaisi) 
	{		
		int retraite=60;
		int resultat;
		
		if (ageSaisi>0 && ageSaisi<retraite)
		{
			resultat = retraite-ageSaisi;		
			return ("il vous reste "+resultat+" ans avant la retraite");
		}
		else if (retraite==ageSaisi)
		{
			return "Vous êtes à la retraite !";
		}
		else if (ageSaisi>retraite)
		{
			resultat = ageSaisi-retraite;
			return ("Vous êtes à la retraite depuis "+resultat+" an(s). Profitez!!");
		}
		else 
		{
			return "Vos parents se connaissent ? ô.Ô'";
		}
	}
}