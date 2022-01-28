package projetRobot;

public class Robot {
	
	private String numeroDeSerie;
	private boolean enMarche;
	private String typeDeDeplacement;
	private boolean aDesBras;
	private float positionX;
	private float positionY;
	private float positionZ;
	
	public Robot() {
		numeroDeSerie="0";
		enMarche=false;
		typeDeDeplacement="DéplacementPied";
		aDesBras=true;
		positionX=0;
		positionY=0;
		positionZ=0;
	}
	public Robot(String numeroDeSerie,boolean enMarche,String typeDeDeplacement) {
		numeroDeSerie="0";
		enMarche=false;
		typeDeDeplacement="DéplacementPied";
		aDesBras=true;
		positionX=0;
		positionY=0;
		positionZ=0;
	}
	
	public boolean demarrer () {
		return true;
	}
	
	public boolean arret() {
		return true;
	}
	
	public boolean seDeplacer() 
	{
		if (enMarche) 
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
