package com.stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamImplementations {
	static List<Employee>   concreteList = new ArrayList<>();
	static {
		
		 concreteList.add(new Employee(101, 9));concreteList.add(new Employee(102, 10));concreteList.add(new Employee(103, 10));
		 concreteList.add(new Employee(102, 10));concreteList.add(new Employee(102, 9));concreteList.add(new Employee(102, 1000));
	}
public static void main(String[] args) {
	 Long count = regularStreamOperation();
	 System.out.println(count);
	 
	passAbstractTomMap();
}

private static Long regularStreamOperation() {

	 concreteList.stream().sorted().forEach(System.out::println);
	 Long count = concreteList.stream().mapToLong(emp->emp.getId()).summaryStatistics().getCount();
	return count;
}

private static void passAbstractTomMap() {
	/// Map<Object, List<Employee>>  empbySalary = concreteList.stream().collect(Collectors.groupingBy(emp-> emp.id)
	//		 ,Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(emp->emp.id)))
	//		 );
	// System.out.println(empbySalary);
	 
	 List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
	   integers.stream()
	   .map(MyInteger::new)
	  ;
}
}

class MyInteger extends Object {
	public MyInteger(Integer inputInt) {
		// TODO Auto-generated constructor stub
	}
	public static int intValue(Integer inputInt) {
		return 100;
	}
	
}

 

  class Employee implements Comparable {
	public  Integer id;
	private String name;
	public double salary;
	private String designation;
	private String insuranceScheme;
	public Integer getId() {
		return id;
	}@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+"     "+salary;
	}
	public Employee(Integer id,double salary) {
		this.id = id;
		this.salary = salary;
		// TODO Auto-generated constructor stub
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getinsuranceScheme() {
		return insuranceScheme;
	}
	public void setinsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("called");
		return this.id==((Employee)obj).id;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return ((Employee)o).id.compareTo(this.id);
	}
	
}