package com.java8.streams;

import java.util.List;
import java.util.stream.Collectors;

public class CreateListWithMoreThanSpecifiedNumberOfCharecters {

	public static List<String> createListWithMoreThanSpecifiedNumberOfCharecters(List<String> stringList, int length){
		
		List<String> resultList = stringList.stream().filter( str-> str.length()>length ).collect(Collectors.toList());
		
		return resultList;
	}
	
}
