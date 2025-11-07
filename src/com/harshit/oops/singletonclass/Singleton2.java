package com.harshit.oops.singletonclass;

public class Singleton2 {

	private static Singleton2 single_instance = null;
	
	public String s;
	
	private Singleton2()
	{
		s= "Singleton2 Constructor is Called";
	}
	
	public static Singleton2 Singleton2()
	{
		if(single_instance == null)
			single_instance = new Singleton2();
		
		return single_instance;
	}
	
}
