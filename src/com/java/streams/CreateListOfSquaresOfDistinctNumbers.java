package com.java.streams;

import java.util.List;
import java.util.stream.Collectors;

public class CreateListOfSquaresOfDistinctNumbers {

	public static List<Integer> createListOfSquaresOfDistinctNumbers(List<Integer> listOfIntegers) {
		
		return listOfIntegers.stream().distinct().map(i->i*i).collect(Collectors.toList());
		
	}
}
