package javacodingpractice.OOPS.interfaces;

public class calculator implements Add,sub,multiply {

	@Override
	public int add(int a, int b) {
		return a+b;
	}
	
	public int sub(int a, int b)
	{
		if(a>b)
			return a-b;
		else
		   return b-a;
	}
	
	public int mul(int a, int b)
	{
		return a*b;
	}
}
