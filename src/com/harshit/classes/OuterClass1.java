package com.harshit.classes;

public class OuterClass1{
	
	int instanceVariable = 10;
	static int classVariable = 20;
	
     class InnerClass{
	public void print()
	{
		System.out.println(classVariable+ " "+ instanceVariable);
	}
	
   }
    
//    public void display()
//    {
//    	NestedClass nestedObj = new NestedClass();
//    	nestedObj.print();
//    }
}
