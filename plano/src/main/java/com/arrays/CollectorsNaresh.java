package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorsNaresh {
	
	public static void main(String[] args) {
		firstNonRepeatedChar();
		findFifindFirstandFindMaxrst();
		duplicateElements();
		numbersStartWith1();
		printSumOfSalary();
		groupEmployeeBySalary();
		distinctElements();
		oddEven();
	}
	
	static List<EmployeeLocal> concreteList = new ArrayList<>();
	static {

		concreteList.add(new EmployeeLocal(101, 9));
		concreteList.add(new EmployeeLocal(102, 10));
		concreteList.add(new EmployeeLocal(103, 10));
		concreteList.add(new EmployeeLocal(102, 10));
		concreteList.add(new EmployeeLocal(102, 9));
		concreteList.add(new EmployeeLocal(102, 1000));
	}
private static void   firstNonRepeatedChar() {
	/*
	 * String name = "Naresh Bhabat N B"; name.chars().mapToObj(indchrs->
	 * Character.toLowerCase(Character.valueOf((char)indchrs))).
	 * collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,
	 * Collectors.counting()))).e
	 */
String input =" naresh n b s";
Character result = input.chars() // Stream of String       
                        .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))) // First convert to Character object and then to lowercase         
                        .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //Store the chars in map with count 
                        .entrySet()
                        .stream()
                        .filter(entry -> entry.getValue() == 1L)
                        .map(entry -> entry.getKey())
                        .findFirst()
                        .get();
                        System.out.println(" Non repeated chars "+result+" \n");                    

}
	

	private static void printSumOfSalary() {
		concreteList.stream().map(emp -> emp.getSalary()).distinct().count();
		IntSummaryStatistics statics = concreteList.stream().mapToInt((x) -> x.getId()).summaryStatistics();
		System.out.println("\n\nSum  " + statics.getSum());
		System.out.println("distinct Count " + statics.getCount());
		System.out.println("average " + statics.getAverage());
		System.out.println("max  " + statics.getMax());
		System.out.println("   Print Summation"+ concreteList.stream().mapToDouble(emp -> emp.getSalary()).reduce(0, Double::sum));
		System.out.println("   Print Summation" + concreteList.stream().mapToDouble(emp -> emp.getSalary()).sum());
	}

	private static void oddEven() {
		System.out.println("   Print Summation" + concreteList.stream().mapToDouble(emp -> emp.getSalary()).sum());
		System.out.println(" ODD EVEN Distinct employee names" + concreteList.stream().map(emp -> emp.getId()).collect(Collectors.toSet()));
		concreteList.stream().map(emp -> emp.getId()).filter(em -> (em % 2 == 0)).collect(Collectors.toSet()).forEach(System.out::println);

	}

	private static void numbersStartWith1() {
		List<Integer> sourceList = Arrays.asList(156, 256, 012);
		System.out.println("number starting with 1");
		sourceList.stream().map(elem -> elem + "").filter(elem -> elem.startsWith("1")).forEach(System.out::println);

	}
	private static void findFifindFirstandFindMaxrst() {
		List<Integer> sourceList = Arrays.asList(156, 256, 012,12,11,190);
		System.out.println("\n findFirst");
		sourceList.stream().findFirst().ifPresent(System.out::println);
		System.out.println("\n find max");
		sourceList.stream().max(Integer::compare).ifPresent(System.out::println);
		System.out.println("    Maximum by summary statistics"   + sourceList.stream().mapToInt(elem-> elem).summaryStatistics().getMax());
		//.forEach(System.out::println);

	}
	public static void duplicateElements() {
		List<Integer> sourceList = Arrays.asList(0, 1, 2, 3, 0, 5, 5, 5);
		Set tmp = new HashSet<Integer>();
		System.out.println("Duplicae elements print");
		sourceList.stream().filter(elem -> !tmp.add(elem)).collect(Collectors.toList()).forEach(elem-> {System.out.println("  "+elem) ;});
		System.out.println("\n Duplicae elements print END");

	}

	public static void distinctElements() {
		List<Integer> sourceList = Arrays.asList(0, 1, 2, 3, 5, 5, 5, 5);
		System.out.println(" distinct count " + sourceList.stream().collect(Collectors.toSet()));
		System.out.println(
				" Distinct employee names" + concreteList.stream().map(emp -> emp.getId()).collect(Collectors.toSet()));

	}

	private static void groupEmployeeBySalary() {
		System.out.println("  Grouping by Salary");
		Map<Integer, List<EmployeeLocal>> returnedMap = concreteList.stream()
				.collect(Collectors.groupingBy(emp -> emp.getId()));// .forEach(System.out::print);
		returnedMap.forEach((key, value) -> {
			System.out.println("New Key  " + key + "  " + value);
		});
	}
}
