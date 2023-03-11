package lab7_package;

public class Drone extends Balloon {
	Balloon B = new Balloon();
	int x ;
	
	public void Move() {
		x = B.Wheel ;
		System.out.println ("Drone Flying to sky!!!");
		
	}
}
