package javacodingpractice.OOPS.abstractclass;

public class Employee extends Sunstar {
	 public String name = "Harshit";
	 public void printInfo()
	{
	     System.out.println("Name of Emloyee is "+ name);	
	}
public static void main(String[] args) {
	
	
	Employee e = new Employee();
	System.out.println(e.age);
	e.printInfo();
}
}
