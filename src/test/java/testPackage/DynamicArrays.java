package testPackage;

import java.util.ArrayList;
import java.util.Collections;

public class DynamicArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		ArrayList is default class of JAVA (JDK, import from java.util package)
//		collections: Dynamic Array
//		Order/index based ArrayList
/*		When an Array list is created it will have by default 10 virtual segments,
		But when those 10 virtual segments are filled, it will take the  10/2 & give 5(called as Load Factor) more virtual segments of 11th index
	
	default virtual capacity of Array list is 10, when new row is added, then it will take the  10/2 & give 5(called as Load Factor) more virtual segments of 11th index
	FOR EACH LOOP & JAVA GENERICS
	
	*/	
		
// In ArrayList, To know the physical capacity we can use ar.size() method
// We can add N number of Null & duplicate values inside an ArrayList
// if we add any element in between the elements of ArrayList with specific index it will shift the item to next index towards right side
//		Ex: ar.add(index, element)
// if we try to add any element to any specific index where the location is not present it will leads to index out of bound exception   
				
	ArrayList<Integer> ar = new ArrayList<Integer>();				
		ar.add(100); //index 0
		ar.add(200); //index 1
		ar.add(300); //index 2
		ar.add(400); //index 3
		ar.add(500); //index 4
		System.out.println("Size of Total Array(Phycical Capacity)"+ar.size());
		System.out.println("Printing All Values"+ar);
		System.out.println("Printing Specific Values on index 3"+ar.get(3));
		System.out.println("FOR LOOP");
//		for loop
		for(int i=0; i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		System.out.println("FOR EACH LOOP");
		
		for(int k:ar) {
			System.out.println(k);
		}
		
//	To swap index from 0 to 1	using Collections function
//		Collections.swap(ar, 0, 1);
// To reverse the order of ArrayList using Collections function		
//		Collections.reverse(ar);
		
	}

}
