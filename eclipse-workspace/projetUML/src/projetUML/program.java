package projetUML;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a= 3;
        Scanner sc = new Scanner(System.in);
        Robot robotParDefault = new Robot();
        Robot robotParDefault2 = new Robot();
        Robot robotParDefault3 = new Robot();
        Robot robotNono= new Robot("1a252",true,"roue",true,0,0,0);
        
        
        /*boolean ilfaitbeauAujourdhui=true;
        boolean lerobotvabien = robotNono.caVa(ilfaitbeauAujourdhui);
        ilfaitbeauAujourdhui=false;
        boolean lerobotvabien2 = robotNono.caVa(ilfaitbeauAujourdhui);*/
        
        boolean areussi = robotNono.demarrer();
        boolean areussiPour3= robotParDefault3.demarrer();
	}
}