package com.harshit.strings;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
public static void main(String[] args) {
	String str = "helloworld";
	Set<Character> set = new HashSet<>();
	StringBuilder sb = new StringBuilder();
	for(char ch:str.toCharArray())
	{
		if(!set.contains(ch))
			sb.append(ch);
		set.add(ch);
	}
	System.out.println(sb.toString());
}
}
