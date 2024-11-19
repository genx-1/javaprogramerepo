package polymorphysm;

public class overloadProg1 {


		 protected void m1()
		{
			System.out.println("m1 non static method");
		}

		
		public void m1(int i)
		{
			System.out.println("m1  non static method with 1 argument");
		}
		
		
	private static void m1(int i, int j)
		{
			System.out.println("m1 static method with 2 argument");
		}
		
		
		public static int m1(String s)
		{
			return 50;
			}
		public static void main(String[] args) {
			
			
			System.out.println(m1("abc"));//50
			overloadProg1 obj = new overloadProg1();
			obj.m1(3);
			obj.m1();
			obj.m1(2, 8); 
			//or 
			m1(20, 60);
			m1("abc");
			//or
			obj.m1("komal");
		}}


	


