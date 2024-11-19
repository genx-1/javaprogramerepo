package polymorphysm;

public class methodoverload {
	
	public void add (int a, int b) {
		int c = a+b;
		System.out.println(c);
	}
	
	public void add (double a, int b) {
		double c = a+b;
		System.out.println(c);
	}
	
	public void add ( int b ,double a) {
		double c = a+b;
		System.out.println(c);
	}
	
	public void add () {
		
		System.out.println("This is non parameterised method");
	}
	
	
	
	

	public static void main(String[] args) {
		methodoverload obj = new methodoverload();
		obj.add();
		obj.add(3.4, 9);
		obj.add(5, 3.5);
		obj.add(3, 6);
		

	}

}
