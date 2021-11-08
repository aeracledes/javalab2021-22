package twoDimensionalShape;
import basicElements.Point;


public class Circle {
	Point cicleCenter;
	double radius=1.0;
	
	 public Circle(Point point,double Radius){
		cicleCenter=point;
		radius=Radius;
	}

	
	 public double getArea(){
		   return radius*radius*3.14159;
		}
}
