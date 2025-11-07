package com.harshit.oops.superkeyword;

public class Derived extends Base{

	
	public Derived(int tyr,double price) {
		super(tyr, price);
		System.out.println("Derived class constructor is called");
		
	}

	

	public void printDetail()
	{
		System.out.println("Max Speed :"+ super.maxSpeed);
	}
}
