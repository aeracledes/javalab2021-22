package spaceships;

import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import main.MainClass;

public class SpaceShipGAMA extends SpaceShip{
	
	public static Image img;
	static
    {
		try{
			SpaceShipGAMA.img=ImageIO.read(MainClass.class.getResource("../images/GAMA.png"));
		}
		catch (Exception ex) {System.out.println(ex);}
    }
	public SpaceShipGAMA(){
		SpaceShipName="GAMA";
		horPace=30;
		verPace=30;
		xCoord=0;
		yCoord=MainClass.cosmosHeight-MainClass.spaceShipHeight-MainClass.yOffSet;
		super.SpaceShipImageIcon=new ImageIcon(SpaceShipGAMA.img);
	}

	
	
	
}
