package com.java8.streams;

import java.util.List;

public class CountEmptyStrings {

	public static long countEmptyStrings(List<String> stringList){
		
		long count = stringList.stream().filter(str->str.isEmpty()).count();
		
		return count;
	}
}
