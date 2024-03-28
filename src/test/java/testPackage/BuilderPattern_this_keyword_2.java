package testPackage;

public class BuilderPattern_this_keyword_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//	 Creating the object of the class	
		BuilderPattern_this_keyword_1 ig = new BuilderPattern_this_keyword_1();
		
//	We can call all other methods in the class with one method, as it returns 'this' keyword in other class	
		ig.login().HomePage().logout();

	}

}
