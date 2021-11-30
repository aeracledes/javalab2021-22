package spaceships;

import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import main.MainClass;

public class SpaceShipDELTA extends SpaceShip{
	
	public static Image img;
	static
    {
		try{
			SpaceShipDELTA.img=ImageIO.read(MainClass.class.getResource("../images/DELTA.png"));
		}
		catch (Exception ex) {System.out.println(ex);}
    }
	public SpaceShipDELTA(){
		SpaceShipName="DELTA";
		horPace=40;
		verPace=40;
		xCoord=0;
		yCoord=MainClass.cosmosHeight-MainClass.spaceShipHeight-MainClass.yOffSet;
		super.SpaceShipImageIcon=new ImageIcon(SpaceShipDELTA.img);
	}
	
	

	
	
}
