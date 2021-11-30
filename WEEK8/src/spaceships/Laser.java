package spaceships;
import main.MainClass;
class Laser {
	int x;
	int y;
	Laser(int x, int y){
		this.x=x+MainClass.spaceShipWidth/2;
		this.y=y;
	}
}
