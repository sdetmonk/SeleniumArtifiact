package testPackage;

import java.util.Arrays;

public class StaticArrays {
	
// Limitations are: 
//	 1. Size is fixed : To over come this we need to use Dynamic Array instead of Static
//	 2. You can store single type of Data: To overcome this we can use Object Array
//	 We will use static array when the size is fixed
//	For static Arrays, we use length() only but in DynamicArrays we use size()
//	we cannot print static Arrays directly, only way is through specific index or loop. But incase of Dynamic Arrays we can 
// Example for static array printing all values of Array//	System.out.println(Arrays.toString(marks));

	public static void main(String[] args) {		
		int marks[] = new int[4];		
		marks[0]=50;
		marks[1]=100;
		marks[2]=200;
		marks[3]=300;		
		for(int i=0; i<=3; i++ ) {
			System.out.println(marks[i]);
		}				
		int k=0;
		while(k<=3) {
			System.out.println(marks[k]);
			k++;
		}
//		To print all the array values, we need to pass below code
		System.out.println(Arrays.toString(marks));
		

//		Similarly we can do it for byte, short, double
		
		
		///////////////////////////////////////////////////////////////////////
		
//	String ARRAY	
		String Name[] = new String[3];		
		Name[0]="RAM";
		Name[1]="SAI RAM";
		Name[2]="Hanuman";
		for(int i=0; i<Name.length; i++) {
			
			System.out.println(Name[i]);
		}
		
// Object Array
		Object data[]= new Object[5];
		
		data[0]= "Sai Ram";
		data[1]= 9;
		data[2]= 9.5;
		data[3]= true;
		data[4]= 'c';
		
		for(int i=0; i<data.length; i++) {
			
			System.out.println(data[i]);
		}
		
// Method to retrieve		
		
		
		
		
		
	}

}
