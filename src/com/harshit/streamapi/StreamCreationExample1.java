package com.harshit.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCreationExample1 {

	public static void main(String[] args) {
		// Stream Creation using Array
		Integer[] salaryArray = {2000,1000,6000,4000,5000,9000};
		Stream<Integer> salaryStream = Arrays.stream(salaryArray);
		List<Integer> salaryList = salaryStream.collect(Collectors.toList());
		//List<Integer> salaryList1 = salaryStream.toList();
		System.out.println(salaryStream);
		//System.out.println(salaryList);
		salaryList.add(5000);
		System.out.println(salaryList);
		
		// Stream Creation using static method (Stream.of())
		Stream<Integer> fromStatic = Stream.of(1000,1500,2000,1800,1256).filter((Integer val)->val>1500);
		long output = fromStatic.count();
		System.out.println(output);
		
		// from Stream Builder
		System.out.println("Stream Creation using Stream Builder");
		
		Stream.Builder<Integer> streamBuilder = Stream.builder();
		streamBuilder.add(200).add(150).add(600).add(450);
		Stream<Integer> streamfromStreamBuilder = streamBuilder.build().filter((Integer ele)->ele>100);
		long output1 = streamfromStreamBuilder.count();
		System.out.println(output1);
		System.out.println(streamfromStreamBuilder);
	}
	
}
