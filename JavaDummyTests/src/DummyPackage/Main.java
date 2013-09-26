package DummyPackage;
import java.awt.Color;
final public class Main {
	
	public static void main(String args[]) {
		
		System.out.println("Hello World !");
		CartesianPoint p1= new CartesianPoint (3,4,Color.RED);
		p1.getColor();
		Point p2= p1; 
		p2.getX();
		
	}
	
} 