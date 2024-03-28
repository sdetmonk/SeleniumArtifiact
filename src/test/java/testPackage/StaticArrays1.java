package testPackage;

import java.util.Arrays;

public class StaticArrays1 {
	
//	Task to list out the list of devices from static String [] array
	
	public String[] getEmpDevicesList(String empName) {
		System.out.println("Welcome to IT Team you are searching for Employee Name:"+empName);
		
		String devices[]= new String[5];
		
		empName=empName.toLowerCase();
		
		if(empName.equals("rahul")) {
			devices[0]="Dell Laptop";
			devices[1]="iPhone11";
			devices[2]="HeadPhones";			
		}
		else if(empName.equals("niharika")) {
			devices[0]="Dell Laptop";
			devices[1]="iPhone14";
			devices[2]="HeadPhones";
			devices[3]="Mouse";
		}
		else if(empName.equals("fruity")) {
			devices[0]="Dell Laptop";
			devices[1]="iPhone11";
			devices[2]="HeadPhones";
			devices[3]="Add Screen";
		}
		else {
			System.out.println("Please enter a valid employee name");
		}
		return devices;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			StaticArrays1 sa= new StaticArrays1();
			
			String empDevList[]= sa.getEmpDevicesList("rahul");
//	We are converting the Arrays to String 		
			System.out.println(Arrays.toString(empDevList));
	}

}
