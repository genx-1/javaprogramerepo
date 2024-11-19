package methodOverloading;

public class Shapes {
	 public void area() {
		   System.out.println("Find Area");
	 }
	 public void area(int r) {
		 System.out.println("Circle Area "+ 3.14* r*r);
	 }
	 public void area (double b, int h) {
		 System.out.println("Traingle area "+0.5 *b *h);
	 }
	 public void area (int l, double b) {
		 System.out.println("Rectangle area "+ l*b);
	 }

		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
