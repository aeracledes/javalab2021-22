package spaceships;

import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import main.MainClass;

public class SpaceShipENEMY extends SpaceShip{
	public static Image img;
	static
    {
		try{
			SpaceShipENEMY.img=ImageIO.read(MainClass.class.getResource("../images/ENEMY.png"));
		}
		catch (Exception ex) {System.out.println(ex);}
    }
	public SpaceShipENEMY(){
		SpaceShipName="ENEMY";
		horPace=40;
		verPace=40;
		xCoord=MainClass.cosmosWidth-MainClass.spaceShipWidth;
		yCoord=MainClass.yOffSet;
		super.SpaceShipImageIcon=new ImageIcon(SpaceShipENEMY.img);
	}
	
	
	
	
	
	
	
	
}
