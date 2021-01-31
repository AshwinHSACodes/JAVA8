package com.java8.streams;

import java.util.List;
import java.util.stream.Collectors;

public class RemoveAllEmptyStringsFromList {

	public static List<String> removeAllEmptyStringsFromList(List<String> stringList){
		
		List<String> resultList = stringList.stream().filter(str->!str.isEmpty()).collect(Collectors.toList());
		
		return resultList;
	}
}
