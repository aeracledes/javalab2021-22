package spaceships;

public abstract class SpaceShip implements Navigation {
	String name = "ship";
	int xCoord =0 ;
	int yCoord = 450;
	int xspeed = 0;
	int yspeed = 0;
	int CosmosWidth = 500 ,CosmosHeight = 500; 
	final int shipHeight = 10;
	final int shipWidth = 10;
	public SpaceShip() {};

	@Override
	public int moveUP() {
		yCoord +=yspeed;
		if ((yCoord > CosmosHeight) | (yCoord < 0)){
			yCoord -=yspeed;
		}
		return yCoord;
	}

	@Override
	public int moveDOWN() {
		yCoord +=yspeed;
		if ((yCoord > CosmosHeight) | (yCoord < 0)){
			yCoord -=yspeed;
		}
		return yCoord;
	}

	@Override
	public int moveLEFT() {
		xCoord +=xspeed;
		if ((xCoord > CosmosWidth) | (xCoord < 0)){
			xCoord -=xspeed;
		}
		return xCoord;
	}

	@Override
	public int moveRIGHT() {
		xCoord += xspeed;
		if ((xCoord > CosmosWidth) | (xCoord < 0)){
			xCoord -=xspeed;
		}
		return xCoord;
	}

	public void printCoords() {
		System.out.printf("SpaceShip%s Xcoords:%d Ycoords:%d",name,xCoord,yCoord);
	}
	
}


