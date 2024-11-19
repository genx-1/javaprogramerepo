package polymorphysm;

public class child extends parent
{
	int a = 20;
	protected void m1()
	{
		System.out.println("non static m1 method from Child class ");
	}
	
	
	public static void main(String[] args) {
		parent p = new parent();
		p.m1();
		child c = new child();
		c.m1();
		parent pp = new child ();
		pp.m1();
		
	}
}

	
	
	


	
	

	
 
	


