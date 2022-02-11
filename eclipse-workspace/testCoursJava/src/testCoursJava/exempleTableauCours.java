package testCoursJava;

public class exempleTableauCours {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        String[] monTableau;
        //instancier/initialiser/affecter une valeur le tableau
      
        monTableau= new String[7];
        monTableau[0]="riri";
        monTableau[1]="fifi";
        monTableau[2]="loulou";
        monTableau[3]="picsou";
        monTableau[4]="donald";
        monTableau[5]="daisy";
        monTableau[6]="mickey";
       // System.out.println(monTableau[monTableau.length-1]);
        
        
        
        for (int i=0; i < monTableau.length ; i++) {
        	
        	System.out.println(monTableau[i]+"\n"+"Maintenant on rajoute un 's' et on compte le nombre de caractère(s) Ô.ô" );
        	
            monTableau[i]=monTableau[i]+"s";
            System.out.println(monTableau[i] + " nbCaracter"+ monTableau[i].length()+"\n");
        }
	}

}
