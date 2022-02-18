package testCoursJava;

public class testBooleanJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// je teste la boucle while avec boolean.
		
		int compteur=0;
		int affiche=0;
		boolean compteurComplet=false;
		
		while (!compteurComplet) 
		{
			
			System.out.println(affiche);
			compteur++;
			affiche =+ compteur;
			
		if (compteur>10) 
			compteurComplet=true;
		}

	}

}
