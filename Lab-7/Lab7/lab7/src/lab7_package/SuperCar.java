package lab7_package;

public class SuperCar extends Car {
	Car 	C = new Car();
	int x ;

	public void Move() {
		x = C.Wheel ;
		System.out.println ("SuperCar Move VRANNNNNNNNNNNNNN!!!");
	}
}
