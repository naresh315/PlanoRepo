package com.arrays;
//https://www.onlinegdb.com/online_java_compiler
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
public class Main2 {
static List<Employee> employeeList = new ArrayList<Employee>();
public static void main(String[] args) {
System.out.println("\n1.How many female and Male employees in the organisation\n");
employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting())).entrySet().forEach(System.out::println);
System.out.println("\n2.print the names of the all the department in organisation\n");
employeeList.stream().map(emp->emp.getDepartment()+"  ").collect(Collectors.toSet()).forEach(System.out::println);
System.out.println("\n3.What is average age of male and female employees\r\n" );
employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge))).entrySet().forEach(System.out::println);
System.out.println("\n4.get details of   highest paid employee  in the organisation\n\n");
Comparator<Employee> maxCompartor = Comparator.comparing(Employee::getSalary);
employeeList.stream().collect(Collectors.maxBy(maxCompartor)).ifPresent(System.out::print);
employeeList.stream().collect(Collectors.maxBy(maxCompartor)).ifPresent(System.out::print);
System.out.println("\n5..employees joined after 2015 \n");
employeeList.stream().filter(emp->emp.getAge()>=2015).forEach(System.out::print                    );
System.out.println("\n6.employees joined after 2015"); 

System.out.println("\n7.what is the average salary of each department"); 
employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary))).entrySet().forEach(System.out::println);
System.out.println("\n8.Get the details of youngest male employee in the product Engineer department");  
employeeList.stream().filter(emp->emp.getDepartment().equalsIgnoreCase("Engineer")).collect(Collectors.minBy(Comparator.comparing(Employee::getAge))).ifPresent(System.out::print);
System.out.println("\n9.who is having most expreince in current organization");
 

System.out.println("\n 10.How many females and males in Pilot department"); 
System.out.println("\n11.List names of  all employees in each department\r\n "); 
System.out.println("\n ()()()()())()())()()()()()()()()()()()()\n"); 

System.out.println("\n12.what is average salary of male and female employees\r\n"); 
System.out.println("\n13.what is average salary and total salary of the whole organization.\r\n"); 
 

 System.out.println(" Total elements "+ employeeList.stream().collect(Collectors.counting()));


}

	static {
		employeeList.add(new Employee(4, "Naresh", 32, "male", "Engineer", 2011, 100));
		employeeList.add(new Employee(3, "Ramesh", 56, "male", "Engineer", 1990, 98));
		employeeList.add(new Employee(7, "Krishna", 33, "male", "Doctor", 2019, 34));
		employeeList.add(new Employee(2, "Ganga", 19, "female", "Pilot", 2000, 56));
		employeeList.add(new Employee(8, "Radha", 16, "female", "Engineer", 2010, 77));
		employeeList.add(new Employee(1, "Parvati", 25, "male", "Pilot", 2011, 45));
		employeeList.add(new Employee(1, "Parvati1", 28, "female", "Pilot", 2018, 66));

	}

}
