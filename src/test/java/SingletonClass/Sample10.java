package SingletonClass;

public class Sample10 {
	
	int x ;

//Private Constructor
	private Sample10() {
		x=9;
	}

//Non static Method
	public void Display() {
		System.out.println(x);
	}

// Static Method to create the object and access it in other class
	public static Sample10 Create() {
		
	Sample10 obj = new Sample10();
	
		return obj;
		
	}
	

}
