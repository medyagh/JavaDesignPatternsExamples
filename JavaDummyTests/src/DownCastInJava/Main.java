package DownCastInJava;

public class Main {

	public static void main(String[] args) {
		// down casting child to parent (car to vehicle) 
		Vehicle v= new Vehicle();
		v.move();
		Car c= new Car();
		c.drive();
		v=c;
		v.move();
		// After downcast to parent, the child looses its own functions
		// So This Won't Work:
		// v.drive();
		
		
		Vehicle v2= new Vehicle();
		v2.move();
		Car c2= new Car();
		
		
		c2=(Car) v2;  /// this will give a class cast exception, we can not cast child to parent  
		//c2.drive();
		
		// Wont Work : 
		//c=v;
		
		
	}

}
