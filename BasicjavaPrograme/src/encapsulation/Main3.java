package encapsulation;

import methodOverloading.Shapes;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shapes s = new Shapes();
		s.area();
		s.area(4);
		s.area(3.5, 5);
		s.area(7, 3.5);
	}

}
