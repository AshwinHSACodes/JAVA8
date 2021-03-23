package com.java8.streams.collectors;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorsUsingEmployeeClass {

	public static void main(String[] args) {

		Employee emp1 = new Employee("name1", "dept1");
		Employee emp2 = new Employee("name2", "dept2");
		Employee emp3 = new Employee("name3", "dept2");
		Employee emp4 = new Employee("name4", "dept3");
		Employee emp5 = new Employee("name5", "dept3");
		Employee emp6 = new Employee("name6", "dept3");
//		Employee emp7 = new Employee("name7", "dept4");
//		Employee emp8 = new Employee("name8", "dept5");
//		Employee emp9 = new Employee("name9", "dept6");
		
//		Employee emp1 = new Employee("name1", "dept1",1);
//		Employee emp2 = new Employee("name2", "dept2",2);
//		Employee emp3 = new Employee("name3", "dept2",3);
//		Employee emp4 = new Employee("name4", "dept3",4);
//		Employee emp5 = new Employee("name5", "dept3",5);
//		Employee emp6 = new Employee("name6", "dept3",6);
//		Employee emp7 = new Employee("name7", "dept4",7);
//		Employee emp8 = new Employee("name8", "dept5",8);
//		Employee emp9 = new Employee("name9", "dept6",9);

		List<Employee> listOfEmployees = new ArrayList<>();
		listOfEmployees.add(emp1);
		listOfEmployees.add(emp2);
		listOfEmployees.add(emp3);
		listOfEmployees.add(emp4);
		listOfEmployees.add(emp5);
		listOfEmployees.add(emp6);
//		listOfEmployees.add(emp7);
//		listOfEmployees.add(emp8);
//		listOfEmployees.add(emp9);

		Map<Employee, Long> resultMap1 = listOfEmployees.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		resultMap1.forEach((key,value)->System.out.println(key + " : " + value));
		
		System.out.println();
		System.out.println();
		System.out.println();

		Map<String, List<Employee>> resultMap2 = listOfEmployees.stream().collect(Collectors.groupingBy(Employee::getDept));
		//resultMap2.forEach((key,value)->System.out.println(key + " : " + value));
		
		for(Map.Entry<String, List<Employee>> empObject : resultMap2.entrySet()) {
			System.out.println(empObject);
		}
		
		System.out.println();
		System.out.println();
		System.out.println();

		Map<String, List<Employee>> resultMap3 = listOfEmployees.stream().collect(Collectors.groupingByConcurrent(Employee::getDept));
		
		for(Map.Entry<String, List<Employee>> empObject : resultMap3.entrySet()) {
			System.out.println(empObject);
		}
	}

}
