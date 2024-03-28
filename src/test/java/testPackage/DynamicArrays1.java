package testPackage;

import java.util.ArrayList;
import java.util.Arrays;

public class DynamicArrays1 {
	
//	
	public  ArrayList<String> getEmpDevicesList(String empName) {
		System.out.println("Welcome to IT Team you are searching for Employee Name:"+empName);
		
		
		ArrayList<String> devices = new ArrayList<String>();
		empName=empName.toLowerCase();
		
		if(empName.equals("rahul")) {
			devices.add("DellLaptop");
			devices.add("iPhone11");
			devices.add("HeadPhones");
		}
		else if(empName.equals("niharika")) {
			devices.add("DellLaptop");
			devices.add("iPhone14");
			devices.add("HeadPhones");
			devices.add("Mouse");
		}
		else if(empName.equals("fruity")) {
			devices.add("DellLaptop");
			devices.add("iPhone11");
			devices.add("HeadPhones");
			devices.add("AdditionalScreen");
		}
		else {
			System.out.println("Please enter a valid employee name");
		}
		return devices;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			DynamicArrays1 da= new DynamicArrays1();			
		ArrayList<String> empDevList= da.getEmpDevicesList("rahul");
		
			System.out.println(empDevList);
	}

}

