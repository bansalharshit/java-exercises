package com.harshit.oops.singletonclass;

public class Main2 {

	public static void main(String[] args) {
	   Singleton2 x = Singleton2.Singleton2();
	   Singleton2 y = Singleton2.Singleton2();
	   
	   x.s = (x.s).toUpperCase();
	   System.out.println("x : "+x.s+ " y: "+ y.s);
	   
	   y.s = (y.s).toLowerCase();
	   System.out.println("x : "+x.s + " y: "+ y.s);
	}
	
}
