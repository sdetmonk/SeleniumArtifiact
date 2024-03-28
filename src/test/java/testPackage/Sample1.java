package testPackage;

public class Sample1 {
	
//DATA MEMBERS	
	public int x;
	public float y;
	public 	String s;
	public 	String par;
	
//Constructor Class	
	public Sample1(String temp) {
		x=10;
		s="Om Sai Ram";
		par=temp;		
	}
	
//Another Constructor Class	to convey it supports POLYMOSPHISM 
	public Sample1(int temp) {
		x=temp;
		s="Om Sai Ram";		
	}
	
//Another Constructor Class	to convey it supports POLYMOSPHISM 
	public Sample1(int tempint, String tempString) {
		x=tempint;
		s="Om Sai Ram";	
		par=tempString;
	}
	
	
//Operational Methods	
public void display() {
	System.out.println(x);
	System.out.println(y);
	System.out.println(s);
	System.out.println(par);
	}
	
}
