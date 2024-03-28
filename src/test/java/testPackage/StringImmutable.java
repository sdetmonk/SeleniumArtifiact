package testPackage;

public class StringImmutable {

	public static void main(String[] args) {



		
		String str ="Rahul";
		
		String s = str;
		
		System.out.println(s);
		
		str= str.concat(" Dev");
		
		System.out.println(str);
		System.out.println(s);

	}

}
