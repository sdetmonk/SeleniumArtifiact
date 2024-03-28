package classes.InterfaceExample;

public class Test97 {

	public static void main(String[] args) {

		// Creating obj for Interface
		Sample6 obj1 = new Sample7();
		int a= obj1.add(9, 9);
		System.out.println("Addition is :"+a);
		
		// Creating obj for Concrete class
			Sample7 obj2 = new Sample7();
			int b = obj2.substract(10, 1);
			System.out.println("Substract is :"+b);

	}

}
