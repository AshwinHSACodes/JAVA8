package com.java.streams;

import java.util.List;

public class CountStringWhichStartsWithA {

	public static long countStringWhichStartsWithA(List<String> stringList){
		
		long count = stringList.stream().filter( str->str.startsWith("A") ).count();
		
		return count;
	}
}
