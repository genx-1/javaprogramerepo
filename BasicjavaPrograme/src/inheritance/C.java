package inheritance;

public class C extends B {
	
	
	public void subchild() {
		System.out.println("This is subchild class method");
	}

	public static void main(String[] args) {
		C o = new C();
		o.m1();
		o.childmethod();
		o.subchild();
	}
	}




















