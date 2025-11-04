package javacodingpractice.patterns;

public class RightTriangleStar {

	public static void main(String[] args)
	{
		// using nested loop 
		for(int i = 1;i<=5;i++)
		{
			for(int j = 0; j<i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("====================================");
		// using single while loop
		String row ="* ";
		int i = 0;
		while(i<5)
		{
			System.out.println(row);
			row = row+"* ";
			i++;
		}
	}
	
	
	
}
