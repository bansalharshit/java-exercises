package com.harshit.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreationWays {
public static void main(String[] args) {
	// from collection
	List<Integer> salaryList = new ArrayList<>();
	salaryList.add(5000);
	salaryList.add(4000);
	salaryList.add(8000);
	salaryList.add(5500);
	System.out.println(salaryList);
	
	System.out.println("stream integer from list");
	List<Integer> amountList = Arrays.asList(1000,2000,3000,4000,5000);
	Stream<Integer> streamAmountList = amountList.stream();
	
	System.out.println("Using Array of Integer to Stream Integer");
	
	Integer[] salaryArray = {55000,65000,37520,89654};
	Stream<Integer> streamSalary = Arrays.stream(salaryArray);
	
	int[] salaryArray1 = {55000,65000,37520,89654};
	Stream<Integer> streamSalary1 = Arrays.stream(salaryArray);
	
	System.out.println("From Static Method\n");
	Stream<Integer> streamFromStaticMethod = Stream.of(1000,2000,3000,4000,5000);
	Stream<Integer> newStream = streamFromStaticMethod.filter((Integer val)->val>3000);
	long output = newStream.count();
	System.out.println(output);
}
}
