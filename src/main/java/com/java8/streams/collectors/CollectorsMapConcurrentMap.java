package com.java8.streams.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsMapConcurrentMap {

	public static void main(String[] args) {
		
		List<String> inputList = Arrays.asList("Apple","Banana","Banana","Carrot","Carrot","Carrot","DarkChaco","DarkChaco","DarkChaco","DarkChaco");
		
		System.out.println(inputList);
		System.out.println();
		System.out.println("-------------collectorsGroupingByFunction-------------------");
		collectorsGroupingByConcurrentFunction(inputList);
		System.out.println();
		System.out.println("-------------collectorsGroupingByConcurrentFunction-------------------");
		collectorsGroupingByConcurrentFunction(inputList);

	}

	
	private static void collectorsGroupingByFunction(List<String> inputList) {
		Map<String, Long> resultMap = inputList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(resultMap);
	}
	
	private static void collectorsGroupingByConcurrentFunction(List<String> inputList) {
		Map<Integer, List<String>> resultMap = inputList.stream().collect(Collectors.groupingByConcurrent(String::length));
		
		System.out.println(resultMap);
		
	}
	
}
