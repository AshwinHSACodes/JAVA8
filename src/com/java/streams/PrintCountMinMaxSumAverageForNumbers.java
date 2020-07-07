package com.java.streams;

import java.util.IntSummaryStatistics;
import java.util.List;

public class PrintCountMinMaxSumAverageForNumbers {

	public static void printCountMinMaxSumAverageForNumbers(List<Integer> listOfIntegers) {

		System.out.println("Original Array Contents==================");
		System.out.println(listOfIntegers);
		
		IntSummaryStatistics intSummaryStatistics = listOfIntegers.stream().mapToInt(x->x).summaryStatistics();
		
		System.out.println("Count : " + intSummaryStatistics.getCount());
		System.out.println("Min : " + intSummaryStatistics.getMin());
		System.out.println("Max : " + intSummaryStatistics.getMax());
		System.out.println("Sum : " + intSummaryStatistics.getSum());
		System.out.println("Average : " + intSummaryStatistics.getAverage());
	}

}







