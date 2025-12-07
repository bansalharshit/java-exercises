package com.harshit.classes;

public class ObjectTest1 {

	public static void main(String[] args) {
		OuterClass1 outClassObj = new OuterClass1();
		OuterClass1.InnerClass innerClassObj = outClassObj.new InnerClass(); // Tricky Part 
		innerClassObj.print();
	}
}
