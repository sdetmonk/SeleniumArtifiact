package testPackage;

public class StaticKeywordandMainMethodOverloading {

// where do static varible's are stored: Those are not stored in Heap & Stack Memory(Object are stored)
//	, but there are stored in CMA(Common Memory Allocation)also called as Permanent Generation
//	after JDK 1.8 this area is called as METASPACE. 
	
//	Static Variable should be called using the ClassName or calling directly in same class, If you call it through creting an
//	an object, it will warn you to use static
//	We should use static for variable if the value doesn't change and have many occurrences in methods
//	Static keyword can be only created on class level & not at method level
//	Once final used after static that value cannot be changed 
	
	
	public void main(int a) {
		System.out.println("In Int Main Method"+a);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("In String Main Method");
		
		StaticKeywordandMainMethodOverloading am = new StaticKeywordandMainMethodOverloading();
		
	
		
	}

}
