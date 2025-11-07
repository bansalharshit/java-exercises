package com.harshit.oops.singletonclass;

public class Main1 {
	
public static void main(String[] args) {

	Singleton1 x = Singleton1.getInstance();
	Singleton1 y = Singleton1.getInstance();
	Singleton1 z = Singleton1.getInstance();
	
	System.out.println("Hash code of x: "+x.hashCode());
	System.out.println("Hash code of y: "+y.hashCode());
	System.out.println("Hash code of z: "+z.hashCode());
	
	if(x==y && y==z)
		System.out.println("All Three Object points to the same memory location on the Heap");
	else
		System.out.println("Above three objects points to the different memory location on the heap");
}

}
