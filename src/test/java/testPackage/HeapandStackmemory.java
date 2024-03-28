package testPackage;

public class HeapandStackmemory {

//	When ever we are creating an object it will store in Heap Memory and it references are also present in Stack memory
//	But when ever we are creating an object with No reference & null reference, it will be not available in Stack Memory	
//	Heap Memory is Auto monitored by JVM and it will instruct GC(Garbage Collector) will destroy all the No Reference & Null Reference Objects based on Memory available
//	GC will never come into Stack Memory	
//	We can call System.gc(); to invoke Garbage Collector but it check with JVM and do only if required based on the available space. JVM does the De-allocation Automatically
//	Also check how Finalize method related to system.gc();		
	
	
	
	int id;
	String name;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// Created one Object		
		HeapandStackmemory hs1 = new HeapandStackmemory();		
		hs1.id=11;
		hs1.name="rahul";
// Created Second Object			
		HeapandStackmemory hs2 = new HeapandStackmemory();		
		hs1.id=12;
		hs1.name="niharika";
// Created third Object		
		HeapandStackmemory hs3 = new HeapandStackmemory();		
		hs1.id=13;
		hs1.name="tiger";
		
//**********************************************		 
// Creating No reference Object
		new HeapandStackmemory().id=14;
		new HeapandStackmemory().name="kundu";
		
// Creating Null reference Object
		HeapandStackmemory hs4 = new HeapandStackmemory();	
		hs4=null;
	// Below step will lead to null pointer exception as line 31 was pointed to null		
		hs4.id=15;
		

//		When ever we are creating an object it will store in Heap Memory and it references are also present in Stack memory
//		But when ever we are creating an object with No reference & null reference, it will be not available in Stack Memory	
//		Heap Memory is Auto monitored by JVM and it will instruct GC(Garbage Collector) will destroy all the No Reference & Null Reference Objects based on Memory available
//		GC will never come into Stack Memory	
//		We can call System.gc(); to invoke Garbage Collector but it check with JVM and do only if required based on the available space. JVM does the De-allocation Automatically
					
		
	}

}
