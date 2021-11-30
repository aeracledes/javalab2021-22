package spaceships;
import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import main.MainClass;

public class SpaceShipZERO extends SpaceShip{
	
	public static Image img;
	static
    {
		try{
			SpaceShipZERO.img=ImageIO.read(MainClass.class.getResource("../images/ZERO.png"));
		}
		catch (Exception ex) {System.out.println(ex);}
    }
	
	public SpaceShipZERO(){
		SpaceShipName="ZERO";
		horPace=5;
		verPace=5;
		xCoord=0;
		yCoord=(MainClass.cosmosHeight-MainClass.spaceShipHeight)-MainClass.yOffSet;
		super.SpaceShipImageIcon=new ImageIcon(SpaceShipZERO.img);
	}
	
}
