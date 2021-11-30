package spaceships;
import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import main.MainClass;

public class SpaceShipALPHA extends SpaceShip{
	
	public static Image img;
	static
    {
		try{
			SpaceShipALPHA.img=ImageIO.read(MainClass.class.getResource("../images/ALPHA.png"));
		}
		catch (Exception ex) {System.out.println(ex);}
    }
	
	public SpaceShipALPHA(){
		SpaceShipName="ALPHA";
		horPace=10;
		verPace=10;
		xCoord=0;
		yCoord=MainClass.cosmosHeight-MainClass.spaceShipHeight-MainClass.yOffSet;
		super.SpaceShipImageIcon=new ImageIcon(SpaceShipALPHA.img);
		
		
	}
	
	
	
	
}
