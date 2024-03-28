package testPackage;

public class SwitchCase {

	public static void main(String[] args) {


		/*Cross browser Logic & Faster then Loop
		 * multi environments
		 * 
		
		
		*/
		 String name= "rahul";
		
		 switch (name.toLowerCase()) {
		 case "99":
			 System.out.println("Name is 99");
			 break;
		 case "nikku":
			 System.out.println("Name is Nikku");
			 break;
		 case "tiger":
			 System.out.println("Name is tiger");
			 break;
		 case "rahul":
			 System.out.println("Name is rahul");
			 break;
		 case "fruity":
			 System.out.println("Name is fruity");
			 break;
		default:
			System.out.println("Enter correct name");
			break;		
		}
		 
		 
		 	int x= 100;
			int y= 700;
			int z= 300;
			int k= 900;
			
			if(x>y && x>z && x>k) {
				System.out.println("x is greatest");
			}
			else if(y>z && y>k) {
				System.out.println("y is greatest");
			}
			else if(z>k) {
				System.out.println("z is greatest");
			}
			else {
				System.out.println("k is greatest");
			}

	}

}
