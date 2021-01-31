package com.java8.streams;

import java.util.List;

public class CountStringLenghtMoreThanGivenNumber {

	public static long countStringLenghtMoreThanGivenNumber(List<String> stringList, int length ){
		
		long count = stringList.stream().filter( str->str.length()>length ).count();
		
		return count;
	}
	
}
