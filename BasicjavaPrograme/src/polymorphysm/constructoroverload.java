package polymorphysm;

public class constructoroverload {

	public constructoroverload (int a, int b) {
		int c = a+b;
		System.out.println(c);
	}
	
	public constructoroverload (double a, int b) {
		double c = a+b;
		System.out.println(c);
	}
	
	public constructoroverload ( int b ,double a) {
		double c = a+b;
		System.out.println(c);
	}
	
	public void add () {
		
		System.out.println("This is non parameterised method");
	}
	
	public static void main(String[] args) {
		constructoroverload obj1 = new constructoroverload(3, 6);
		constructoroverload obj2 = new constructoroverload(3, 3.5);
		constructoroverload obj3 = new constructoroverload(3.5, 4);
    }}
