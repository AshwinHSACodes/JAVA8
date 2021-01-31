package com.java8.streams;

import java.util.List;
import java.util.stream.Collectors;

public class ConvertStringToUpperCaseAndJoinThemUsingComma {

	public static String convertStringToUpperCaseAndJoinThemUsingComma(List<String> originalList){
		
		return originalList.stream().map(str->str.toUpperCase()).collect(Collectors.joining(","));
	}
	
}
