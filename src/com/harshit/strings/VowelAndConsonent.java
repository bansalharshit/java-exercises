package com.harshit.strings;

public class VowelAndConsonent {
	public static int[] countVowelConsonent(String s)
	{
		int vowCount = 0, conCount = 0;
		String ref = "aeiouAEIOU";
		for(int i =0;i<s.length();i++)
		{
			// check for any special char
			if(s.charAt(i)>='A' && s.charAt(i)<='Z' || s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				if(ref.indexOf(s.charAt(i))!= -1)
					vowCount++;
				else
					conCount++;
					
			}
		}
		return new int[] {vowCount,conCount};
	}
public static void main(String[] args) {
	int[] vc = countVowelConsonent("Harshit Bansal");
	System.out.println("Vowels Count :"+vc[0]+ " "+ "Consonent Count :"+vc[1]);
}
}
