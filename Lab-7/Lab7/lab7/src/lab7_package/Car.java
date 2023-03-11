package lab7_package;

public class Car extends Vehicle {	
	
	public void Move() {
		System.out.println ("Car Move");
	}//end method
	
	public void Move(int x, float y) {
		System.out.println("The car have "+ x +" wheels and has weight "+ y);
	}//end method	
	
	
}
