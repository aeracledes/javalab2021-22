package MainPackage;
import java.util.Scanner;

import basicElements.Point;
import twoDimensionalShape.Circle;
import twoDimensionalShape.Rectangle;

public class MainClass {

	public static void main(String[] args) {
		
		System.out.println("Enter x,y coordinates:\n");
	    Scanner myObj = new Scanner(System.in);
	    int x1 = myObj.nextInt();
	    int y1 = myObj.nextInt();
	    Point p=new Point(x1,y1);
	
	    System.out.println("Type 1:Rectangle or 2:Circle");
	    int choice = myObj.nextInt();
	    if(choice!=1 | choice!=2) {
	    int count = 0;
	    	while(choice!=1 | choice!=2) {
	    		count++;
	    		if (count>=3) {System.out.println("Stop messing!");}
	    		System.out.println("Enter proper choice!\n1:Rectangle\n2:Circle");
	    		choice = myObj.nextInt();
	    	}
	    }
	    
	    switch(choice) {
			case 1:
				System.out.println("Enter width,height of rectangle");
				double w1 = myObj.nextDouble();
				double h1 = myObj.nextDouble();
				Rectangle objRect=new Rectangle(p,w1,h1);
				System.out.println("Area of Rectangle:"+((Rectangle) objRect).getArea());
				break;
			case 2:
				System.out.println("Enter radius of circle");
				double r1 = myObj.nextDouble();
				Circle objCircle=new Circle(p,r1);
				System.out.println("Area of Circle:"+objCircle.getArea());
				break;
		}
		
	}

}
