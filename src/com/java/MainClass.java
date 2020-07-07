package com.java;

import java.util.Arrays;
import java.util.List;

import com.java.streams.ConvertStringToUpperCaseAndJoinThemUsingComma;
import com.java.streams.CountEmptyStrings;
import com.java.streams.CountStringLenghtMoreThanGivenNumber;
import com.java.streams.CountStringWhichStartsWithA;
import com.java.streams.CreateListOfSquaresOfDistinctNumbers;
import com.java.streams.CreateListWithMoreThanSpecifiedNumberOfCharecters;
import com.java.streams.PrintCountMinMaxSumAverageForNumbers;
import com.java.streams.RemoveAllEmptyStringsFromList;

public class MainClass {

	public static void main(String[] args) {
		
		//Call Methods And Run Here
		printCountMinMaxSumAverageForNumbers();
	}

	//1.Count Empty Strings in ArrayList
	private static void countEmptyStrings(){
		List<String> stringList = Arrays.asList("NotEmpty","","NotEmpty","","","NotEmpty","","");
		long countEmptyString = CountEmptyStrings.countEmptyStrings(stringList);
		System.out.println("Empty Strings in List are : " + countEmptyString);
	}
	
	//2.Count Strings with length more than n
	private static void countStringLenghtMoreThanGivenNumber(int length){
		
		List<String> stringListOne = Arrays.asList("one","twoo","three","two","more","les","less","again");
		List<String> stringListTwo = Arrays.asList("fsdf","d","sdf","s","er","we","fdsdf","sdff");
		
		System.out.println("In stringListOne count : " + CountStringLenghtMoreThanGivenNumber.countStringLenghtMoreThanGivenNumber(stringListOne, length));
		System.out.println("In stringListOne count : " + CountStringLenghtMoreThanGivenNumber.countStringLenghtMoreThanGivenNumber(stringListTwo, length));
	}
	
	//3.Count Strings which starts with A
	private static void countStringsWhichStartsWithA(){
		
		List<String> stringList = Arrays.asList("Ashwin","Vinay","Ajay","akhil", "Tommy", "Amar");
		long count = CountStringWhichStartsWithA.countStringWhichStartsWithA(stringList);
		
		System.out.println("Count : " + count);
	}

	//4.Remove All Empty Strings from List
	private static void removeAllEmptyStringsFromList(){
		
		List<String> originalList = Arrays.asList("","A","","B","","C","","D","","E","","F");
		List<String> resultList = RemoveAllEmptyStringsFromList.removeAllEmptyStringsFromList(originalList);
		
		System.out.println("Original List");
		System.out.println(originalList);
		System.out.println("Result List");
		System.out.println(resultList);
	}
	
	//5.Create List with more than specified number of charecters
	private static void createListWithMoreThanSpecifiedNumberOfCharecters(int length){
		
		List<String> originalList = Arrays.asList("1","T2","Tri","Four","FFive","SixSix","Sevenss","Eight888");
		List<String> resultList = CreateListWithMoreThanSpecifiedNumberOfCharecters.createListWithMoreThanSpecifiedNumberOfCharecters(originalList, length);
		System.out.println(originalList);
		System.out.println(resultList);
		
		
		
	}
	
	//6.Convert String ToUpperCase And Join Them Using Comma
	private static void convertStringToUpperCaseAndJoinThemUsingComma(){
		
		List<String> originalList = Arrays.asList("ashwin","raju","anu","ahas","sumukh","charani","chandan","vikki");
		String resultString = ConvertStringToUpperCaseAndJoinThemUsingComma.convertStringToUpperCaseAndJoinThemUsingComma(originalList);
		
		System.out.println(originalList);
		System.out.println(resultString);
	}
	
	//7.Create List Of Squares Of All Distinct Numbers
	private static void createListOfSquaresOfDistinctNumbers(){
		
		List<Integer> listOfIntegers = Arrays.asList(1,2,3,2,4,3,5);
		List<Integer> resultList = CreateListOfSquaresOfDistinctNumbers.createListOfSquaresOfDistinctNumbers(listOfIntegers);
		System.out.println(listOfIntegers);
		System.out.println(resultList);
	}

	//8.Get Count Min Max Sum And Average For Numbers
	private static void printCountMinMaxSumAverageForNumbers(){
		List<Integer> listOfIntegers = Arrays.asList(1,2,3,4,5,6,7,8);
		PrintCountMinMaxSumAverageForNumbers.printCountMinMaxSumAverageForNumbers(listOfIntegers);
	}
	
	
}
