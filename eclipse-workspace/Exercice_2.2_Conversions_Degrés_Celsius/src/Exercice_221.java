import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/*Soit "X" la valeur à convertir.
Formule °F vers °C : °C = (X − 32) * 5/9
Formule °C vers °F : °F = (X * 9/5) + 32
L'utilisateur saisit une valeur numérique comprise entre -459.67 et 5 000 000 suivi de l'unité de température : 
▪ C pour Celsius
▪ F pour Fahrenheit
La valeur et l'unité de température sont séparés par un espace (exemple: 32 C pour 32 degrés Celsius). Si la valeur est 
hors limite, l’utilisateur recommence la saisie. 
Pour information, le zéro absolu correspond à -459.67 Degrés Fahrenheit ou -273.15 degrés Celsius. En physique, rien 
ne peut être plus froid que le zéro absolu !
La température de la plus basse jamais enregistrée sur Terre est de -95 degrés Celsius.
Le programme affiche le résultat de la conversion sous forme de nombre réel double précision.*/
public class Exercice_221 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String saisiU;
		String unite="c";
		Double valeurX=0.0;
		String[] monTab;
		Scanner sc = new Scanner(System.in);
		double resultatEnC; 
		double resultatEnF;
		String rejouer;
		
		
		do {
		System.out.println("Programme de conversion Celsius <-> Fahrenheit.\n");
		 
		{
		System.out.println("Saisir une température avec son unité de mesure (C ou F) :");
		saisiU=sc.nextLine();
		monTab=saisiU.split(" ");
		valeurX=Double.valueOf(monTab[0]);
		
		}
		while (!((valeurX>-459.67) && (valeurX<5000000)));
		
		if (monTab.length>1)
		{
			unite=monTab[1];
			unite=unite.toLowerCase();
		}
		// unite est le Celsius, conversion --> Fahrenheit
		if ((unite.equals("c")) || (unite.equals("")))
		{
			resultatEnF=((valeurX*9/5)+32);
			BigDecimal resultatM = new BigDecimal (resultatEnF).setScale(3,RoundingMode.HALF_UP);
			System.out.println(saisiU+" vaut : "+resultatM+" °F");
		}
		else 
		{
			resultatEnC=(valeurX-32)*5/9;
			BigDecimal resultatM = new BigDecimal (resultatEnC).setScale(3,RoundingMode.HALF_UP);
			System.out.println(saisiU+" vaut : "+resultatM+" °C");
		}
		System.out.println("Voulez-vous refaire une conversion ? o/n ");
		rejouer=sc.nextLine();
		
		}
		while (!(rejouer.equals("n")));
		
		
		sc.close();
	}

}
