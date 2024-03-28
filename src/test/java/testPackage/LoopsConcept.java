package testPackage;

public class LoopsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//WHILE LOOP: when you don't know how many times to iterate
//Page load time out, Calendar, pagination, page scrolling like to look for an post in Instagram
		
//For LOOP: When the iterations are fixed 
//	drop down, menu items, Arrays & Array List
		
//Do -while: 	when you don't know how many times to iterate	
		
		// Instead of int we can use byte, short, long, double, char
		for(int i=1;i<=10;i++) {
			System.out.print(i);
			System.out.print(",");
		}
//		char(uses ASCII value for alphabets)
//		print alphabets from a to z
		for(char c= 'a'; c<='z'; c++) {
			
			System.out.print(c);
		}
// How to print the ASCII values for the above logic		
		for(char c= 'a'; c<='z'; c++) {
			
			System.out.println(c+" : "+(int)c);
		}
		
//		While Loop
		int k=1;
		while(k<=10) {
			System.out.print(k);
			System.out.print(":");
			k++;			
		}
		
// Nested Loop
//	once it enters into nested loop, it will print all the n values 	
System.out.println("Nested Loop");
		for(int m=0; m<=10; m++) {
			for(int n=0;n<=10; n++) {
				System.out.print(m +""+ n);
			}

			System.out.println(" ");
		}
		
		

	}

}
