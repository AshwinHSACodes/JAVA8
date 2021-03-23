package com.java8.interview.algorithms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CountDuplicateCharecterInAGivenString {

	public static void main(String[] args) {
		String inputString = "ashwin Kumar";
		
		//Map<String, Integer> countMap = method1(inputString);
		//Map<Character, Integer> countMap = method2(inputString);
		//Map<Character, Integer> countMap = method3(inputString);
		Map<Character, Long> countMap = method4(inputString);
		
		System.out.println(countMap);
	}

	
	/*
	 * Method 1 using brute-force method.
	 */
	private static Map<String, Integer> method1(String inputString) {
		
		Map<String, Integer> countMap = new HashMap<>();
		
		for(int i=0; i<inputString.length(); i++) {
			
			char ch = inputString.charAt(i);
			
			if(isPresent(ch)) {
				continue;
			}
			
			int tempCount = 0;
			for(int j=0; j<inputString.length(); j++) {
				if(ch == inputString.charAt(j))
					tempCount = tempCount + 1;
			}
			countMap.put(String.valueOf(ch), tempCount);
		}
		
		return countMap;
	}

	private static boolean isPresent(char ch) {
		return false;
	}
	
	/*
	 * Method 2 using containsKey of Map method.
	 */
	private static Map<Character, Integer> method2(String inputString){
		
		Map<Character, Integer> countMap = new LinkedHashMap<>();
		
		for(int i=0; i<inputString.length(); i++) {
			char ch = inputString.charAt(i);
			
			if(countMap.containsKey(ch))
				countMap.put(ch, countMap.get(ch)+1);
			else
				countMap.put(ch, 1);
		}
		
		return countMap;
	}
	
	/*
	 * Method 3 using java 8 compute() method
	 */
	private static Map<Character, Integer> method3(String inputString){
		
		Map<Character, Integer> countMap = new LinkedHashMap<Character, Integer>();
        
		for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            countMap.compute(ch, (key, value) -> (value == null) ? 1 : value + 1);
        }

		return countMap;
	}
	
	
	/*
	 * Method 3 using java 8 Collectors.groupingBy() method
	 */
	private static Map<Character, Long> method4(String inputString){
		
		IntStream intStream = inputString.chars();
		
		Stream<Character> charsStream = intStream.mapToObj(ch->(char)ch);
		
		Map<Character, Long> countMap = charsStream.collect(Collectors.groupingBy(ch->ch,Collectors.counting()));
		
		return countMap;
	}
}

