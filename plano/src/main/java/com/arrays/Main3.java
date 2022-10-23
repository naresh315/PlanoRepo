package com.arrays;
//https://www.onlinegdb.com/online_java_compiler
import java.util.ArrayList;
import java.util.List;
public class Main3 {
static List<Employee> employeeList = new ArrayList<Employee>();
public static void main(String[] args) {
System.out.println("1.How many female and Male employees in the organisation\n");
System.out.println("2.print the names of the all the department in organisation\n");
System.out.println("3.What is average age of male and female employees\r\n" );
 
System.out.println("4.get details of   highest paid employee  in the organisation\n\n");
 
System.out.println("5..employees joined after 2015 \n"); 
System.out.println("6.employees joined after 2015"); 

System.out.println("7.what is the average salary of each department"); 

System.out.println("8.Get the details of youngest male employee in the product Engineer department");  
System.out.println("9.who is having most expreince in current organization");
 

System.out.println("10.How many females and males in Pilot department"); 
System.out.println("11.List names of  all employees in each department\r\n "); 
System.out.println("\n ()()()()())()())()()()()()()()()()()()()\n"); 

System.out.println("12.what is average salary of male and female employees\r\n"); 
System.out.println("13.what is average salary and total salary of the whole organization.\r\n"); 
 

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
 