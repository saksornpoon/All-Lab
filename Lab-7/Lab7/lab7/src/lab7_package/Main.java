package lab7_package ;

public class Main {
	
	public static void main(String[] args) {
		Vehicle V = new Vehicle() ;

		int x = V.Wheel ;
		float y = (float) 673.7;
		
		V.Move();
		V.Move("James");
		
		Car 	C = new Car();
		C.Move();
		C.Move(x, y);
		
		Motorbike M = new Motorbike();
		M.Move();
		M.Move();

		Balloon B = new Balloon();
		B.Move();

		SuperCar S = new SuperCar();
		S.Move();
		
		Drone D = new Drone();
		D.Move();
		
	}



}