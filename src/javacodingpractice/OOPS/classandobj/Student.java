package javacodingpractice.OOPS.classandobj;
import java.util.*;

public class Student {

	private int id;
	private String age;
	
	public Student(int id, String age)
	{
		this.id = id;
		this.age =age;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	public int getId()
	{
		return id;
	}
	public void setAge(String age)
	{
		this.age = age;
	}
	public String getAge()
	{
		return age;
	}
public static void main(String[] args)
{
	Student s = new Student(45,"Harshit");
	System.out.println(s.id);
	System.out.println(s.age);
}
	
}
