package testPackage;

public class Methods {	
	
	
	public boolean browser(String browserInp) {
		boolean flag = false;
		
		switch (browserInp) {
		case "chrome":
			flag= true;
			break;
		case "firefox":
			flag= true;
			break;
		case "ie":
			flag= true;
			break;
		default:
			System.out.println("Pass the proper browser name");
			break;
		}
		return flag;
		
	}
		

	public static void main(String[] args) {

		boolean flag=new Methods().browser("chrome");
		System.out.println(flag);
		
		if(flag) {
			System.out.println("Chrome Broswer is Launched");
		}
		
		
		

	}

}
