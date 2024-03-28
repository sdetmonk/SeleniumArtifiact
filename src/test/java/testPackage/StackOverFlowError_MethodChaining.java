package testPackage;

//StackOverFlow Error is expected when the Stack Memory is out, As m4() creates a continues chaining
// and first few times it runs and fails with an StackOverFlow Error

//Below example is also called as method chaining 


public class StackOverFlowError_MethodChaining {
	
	
	public void m1() {
		System.out.println("M1 Method");
		m2();
	}
	
	public void m2() {
		System.out.println("M2 Method");
		m3();
	}
	
	public void m3() {
		System.out.println("M3 Method");
		m4();
	}
	
	public void m4() {
		System.out.println("M4 Method");
		m1();
	}
	public static void t1() {
		System.out.println("t1 Static method");
StackOverFlowError_MethodChaining mc= new StackOverFlowError_MethodChaining();
		
		mc.m1();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		StackOverFlowError_MethodChaining mc= new StackOverFlowError_MethodChaining();
		
		mc.m1();
		
	}

}
