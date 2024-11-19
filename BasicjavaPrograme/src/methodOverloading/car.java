package methodOverloading;

public class car extends Vehicle {
	public void run() {
		System.out.println("car is running safely");
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		Vehicle c = new Vehicle();
		c.run();

	}

}
