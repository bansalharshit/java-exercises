package com.harshit.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
	
public static void main(String[] args) {
	
	List<Integer> salaryList = new ArrayList<>();
	salaryList.add(3000);
	salaryList.add(4100);
	salaryList.add(9000);
	salaryList.add(1000);
	salaryList.add(3500);

	Stream<Integer> StreamList= salaryList.stream().filter((Integer sal)->sal>3000);
	long output = StreamList.count();
	System.out.println("Total Employee with salary > 3000 : "+output);
	
	String[] employee = new String[] {"Akash","Pooja","Radha","Vallabh"};
	String[] employeeName = {"Geeta","Rita","Sunita","Sangita"};
	
	System.out.println(Arrays.toString(employee));
	System.out.println(Arrays.toString(employeeName));
	
	List<String> employeeList = Arrays.asList(employee);
	Stream<String> employeeStream = employeeList.stream().filter((String name)->name.equals("Akash"));
	System.out.println(employeeStream.count());
	
}

}
