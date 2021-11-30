package spaceships;

import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import main.MainClass;

public class SpaceShipBETA extends SpaceShip{
	
	public static Image img;
	static
    {
		try{
			SpaceShipBETA.img=ImageIO.read(MainClass.class.getResource("../images/BETA.png"));
		}
		catch (Exception ex) {System.out.println(ex);}
    }
	public SpaceShipBETA(){
		SpaceShipName="BETA";
		horPace=20;
		verPace=20;
		xCoord=0;
		yCoord=MainClass.cosmosHeight-MainClass.spaceShipHeight-MainClass.yOffSet;
		super.SpaceShipImageIcon=new ImageIcon(SpaceShipBETA.img);
	}

	
	
	
}
