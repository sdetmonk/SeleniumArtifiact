package testPackage;

public class BuilderPattern_this_keyword_1 {
	
//	return of 'this' is class name
//	we are using 'this' returns the class objects, and we can call all methods by using only one method. ex shown in 'BuilderPattern_this_keyword_2' class
	public BuilderPattern_this_keyword_1 login() {
		System.out.println("Login Page");
		return this;
	}
	
	public BuilderPattern_this_keyword_1 HomePage() {
		System.out.println("Home Page");
		return this;
	}
	
	public BuilderPattern_this_keyword_1 logout() {
		System.out.println("Logout Page");
		return this;
	}

}
