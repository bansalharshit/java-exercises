package com.harshit.collections;

import java.util.Arrays;

public class Demo1 {
public static void main(String[] args) {
	Integer[] arr = {6,4,7,1,9};
	Arrays.sort(arr,(Integer val1,Integer val2)->val1-val2);
	System.out.println(Arrays.toString(arr));
	
	System.out.println("==============================\n");
	Integer[] arr2 = {6,4,7,1,9};
	Arrays.sort(arr2,(Integer val1,Integer val2)->val2-val1);
	System.out.println(Arrays.toString(arr2));
	
	for(int ele:arr2)
		System.out.println(ele);
}
}
