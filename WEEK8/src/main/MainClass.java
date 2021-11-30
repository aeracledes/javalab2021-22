package main;
import gui.SpaceFrame;
public class MainClass  {
	public static int cosmosWidth=800;
    public static int cosmosHeight=600;
    public static int spaceShipWidth=100;
    public static int spaceShipHeight=100;
    public static int yOffSet=30;
    public static SpaceFrame myShootingGame;
    public static void main(String[] args) {
    	myShootingGame=new SpaceFrame(cosmosWidth,cosmosHeight);
    }
}
