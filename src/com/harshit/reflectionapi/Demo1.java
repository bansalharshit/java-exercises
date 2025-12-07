package com.harshit.reflectionapi;

import java.lang.reflect.Field;

public class Demo1 {
	
public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {
	
	Class demo1Class = ReflectionApi.class;
	
	ReflectionApi apiObj = new ReflectionApi();
	
	Field field = demo1Class.getDeclaredField("studentName");
	
	field.setAccessible(true);
	
	field.set(apiObj, "Harshit Bansal");
	
	
	System.out.println(apiObj.toString());
	
}
}
