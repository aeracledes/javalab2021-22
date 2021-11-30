package spaceships;
import javax.swing.ImageIcon;
import java.util.LinkedList;
import main.MainClass;
abstract public class SpaceShip implements Navigation, LaserGuns{
	public LinkedList<Laser> laserShootersLinkedList = new LinkedList<Laser>();
	protected String SpaceShipName;
	protected int horPace;
	protected int verPace;	
	protected int xCoord;
	protected int yCoord;
	protected ImageIcon SpaceShipImageIcon;
	
	public ImageIcon getIcon() {return SpaceShipImageIcon;}
	public int getX() {return xCoord;}
	public int getY() {return yCoord;}
	
	public void fire(int x, int y) {
		laserShootersLinkedList.add(laserShootersLinkedList.size(),new Laser(x,y));
	}
	
	public int moveUP() {
		yCoord -= verPace;  
		if(yCoord<=MainClass.yOffSet)yCoord=MainClass.yOffSet;
		return yCoord;
	}
	
	public int moveDOWN() {
		int limit=MainClass.cosmosHeight-MainClass.spaceShipHeight-MainClass.yOffSet;
		yCoord += verPace; 
		if(yCoord>=limit)yCoord=limit;
		return yCoord;
	}
	
	public int moveLEFT() {
		xCoord -= horPace;    
 	    if(xCoord<0)xCoord = xCoord+horPace;
		return xCoord;
	}

	public int moveRIGHT() {
		int limit=(MainClass.cosmosWidth-MainClass.spaceShipWidth);   
		xCoord += horPace;
		if(xCoord>=limit)xCoord=limit;
 		return xCoord;
	}
	
	public void printCoords() {
		 System.out.println("Spaceship"+SpaceShipName+" "+ "Xcoords:"+xCoord+" Ycoords:"+yCoord);
	}
	
}


