package com.harshit.oops.interfaces;

public class Main1 {
	
	public static void main(String[] args) {
		calculator c = new calculator();
		int addition = c.add(4, 5);
		int subtraction = c.sub(9, 8);
		int multiplication = c.mul(addition, subtraction);
		System.out.println(addition +" "+ subtraction+" "+multiplication);
	}
}
