package com.harshit.oops.abstractclass;

public class Derived1 extends Base1 {
	public Derived1() {System.out.println("Derived Class Constructor Called");}
	
	@Override
	public void Base1Method() {
		System.out.println("Base1 Method is Called from Derived1 Class");
	}
	
	

}
