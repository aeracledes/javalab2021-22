package main;
import spaceships.*;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingDeque;

public class MainClass {
	public static int cosmosWidth=800;
	public static int cosmosHeight=600;
	public static int spaceShipWidth=100;
	public static int spaceShipHeight=100;
	public static void main(String[] args) {
		LinkedList<SpaceShip> spaceshiplist= new LinkedList<SpaceShip>();
		SpaceShip z = new SpaceShipZERO();
		SpaceShip a = new SpaceShipALPHA();
		SpaceShip b = new SpaceShipBETA();
		SpaceShip g = new SpaceShipGAMMA();
		SpaceShip d = new SpaceShipDELTA();
		SpaceShip e = new SpaceShipENEMY();
		
		spaceshiplist.add(z);
		spaceshiplist.add(a);
		spaceshiplist.add(b);
		spaceshiplist.add(g);
		spaceshiplist.add(d);
		spaceshiplist.add(e);
		System.out.println("Enter command to test spaceships movements:");
		Scanner sc = new Scanner (System.in);
		while(sc.hasNext()) {
			String s1= sc.next();
			System.out.print(s1);
			int i=0;
			while (i < spaceshiplist.size()) {
				if(s1.equals("u"))spaceshiplist.get(i).moveUP();
				if(s1.equals("d"))spaceshiplist.get(i).moveDOWN();
				if(s1.equals("l"))spaceshiplist.get(i).moveLEFT();
				if(s1.equals("r"))spaceshiplist.get(i).moveRIGHT();
				spaceshiplist.get(i).printCoords();
				i++;
			}
		}
		sc.close();
		
	}
	
}
