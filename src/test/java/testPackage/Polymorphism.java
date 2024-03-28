package testPackage;

public class Polymorphism {
	
//	Method overloading & overriding are considered as Poly-morphism
//	Method Overloading is With in the same class, we can have multiple same methods name but different no.of parameters and the return type doesn't matter
/*	1. Different type of parameters
 * 	2. Different number of parameters
 * 	3. Different sequence of parameters
 *  -- return type doesn't matter
 *  ***************** CAN we Overload main Method ? ****************
 *     
 */
	public int test(int a) {
		
		return a;
	}
	public double test(double a) {
		return a;
	}
	
	
	

	public static void main(String a[]) {
		
		System.out.println(a[1]);
		// TODO Auto-generated method stub
		

	}
	public static void main(int[] args) {
		// TODO Auto-generated method stub
		
		Polymorphism a = new Polymorphism();
		
		a.test(0);

	}

}
