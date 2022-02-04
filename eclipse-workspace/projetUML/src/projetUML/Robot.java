package projetUML;

public class Robot {
	
	private String numeroDeSerie;
	private boolean enMarche;
	private String typeDeDeplacement;
	private boolean aDesBras;
	private float positionX;
	private float positionY;
	private float positionZ;
	
	//constructeur par default: il donne des valeurs par defaut aux attributs.
	public Robot() {
		numeroDeSerie="0";
		enMarche=false;
		typeDeDeplacement="DéplacementPied";
		aDesBras=true;
		positionX=0;
		positionY=0;
		positionZ=0;
	}
	
	//constructeur classique: il donne les valeurs passées en paramètre aux attributs.
	public Robot(String numeroDeSerie,boolean enMarche,String typeDeDeplacement,boolean aDesBras,float positionX,float positionY,float positionZ) 
	{
		this.numeroDeSerie=numeroDeSerie;
		this.enMarche=enMarche;
		this.typeDeDeplacement=typeDeDeplacement;
		this.aDesBras=aDesBras;
		this.positionX=positionX;
		this.positionY=positionY;
		this.positionZ=positionZ;
	}
	
	//fonction: il renvoie un boolean, ici true.
	public boolean demarrer () 
	{
		if (enMarche==true)
		{
			return false;
		}
		else
		{
			enMarche=true;
			return true;
		}
			
	}
	
	public boolean arret() {
		return true;
	}
	
	public boolean seDeplacer() 
	{
		if (enMarche==false) 
		{
			return false;
		}
		else 
		{
			return true;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
