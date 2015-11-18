package com.agy.reflectTest;

public class MainTest {
	
	
	public static void main(String[] args)
	{
		Class<?> clas1 = null;
		try {
			clas1 =  Class.forName("com.agy.reflectTest.Person");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
}
