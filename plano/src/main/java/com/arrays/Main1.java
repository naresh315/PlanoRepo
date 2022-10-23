package com.arrays;
//https://www.onlinegdb.com/online_java_compiler
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Main1 {
static List<Employee> employeeList = new ArrayList<Employee>();
public static void main(String[] args) {
 System.out.println("1.How many female and Male employees in the organisation");
 employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting())) .forEach((key, value) -> { System.out.println(key + ":=" + value); });
 System.out.println("2.print the names of the all the department in organisation");
employeeList.stream().map(emp -> emp.getDepartment() + "|").collect(Collectors.toSet()).forEach(System.out::print);
employeeList.stream().map(emp-> emp.getAge()+"  | ").collect(Collectors.toList()).forEach(System.out::print);
System.out.println("\n\n **3.What is average salary  of male and female employees");
employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary))) .forEach((k, v) -> { System.out.println("  key " + k + "  value " + v);});
employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary))).forEach((k,v)->{
	System.out.println("  "+k+"  "+v );
});
System.out.println("\n\n 4.get details of   highest paid employee  in the organisation\n\n");
Comparator<Employee> bySalary = Comparator.comparing(Employee::getSalary);
Map<String, Optional<Employee>> variable = employeeList.stream().collect( Collectors.groupingBy(Employee::getDepartment, Collectors.reducing(BinaryOperator.maxBy(bySalary))));
		variable.entrySet().stream();//.forEach(System.out::println);
System.out.println("   "+employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))).get().toString());
		// Optional<Employee> max1 =employeeList.stream().sorted().collect(Collectors.toList()).get(0);
		 Employee max2 =employeeList.stream().sorted().collect(Collectors.toList()).get(0);
		 System.out.println("  "+max2.id);
System.out.println("Average age of employees by department");
employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getAge))).forEach((k,v)->{System.out.println(k+"  "+v);});

System.out.println("employees joined after 2015");
employeeList.stream().filter(emp-> emp.getYoj() >=2015).forEach(System.out::println);


System.out.println("Employees in each department");
employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting())).forEach((k,v)->{System.out.println(k+"  "+v);});
System.out.println("7.what is the average salary of each department");
employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary))).forEach((k,v)->{System.out.println(k+"  "+v);});

System.out.println("8.Get the details of youngest male employee in the product Engineer department");
Comparator<Employee> minEmployee =Comparator.comparing(Employee::getAge);
System.out.println(" "+employeeList.stream().filter(emp->emp.getDepartment().equalsIgnoreCase("Engineer")).collect(Collectors.minBy(minEmployee)).get());
System.out.println("9.who is having most expreince in current organization");

Comparator<Employee> minimumYoj = Comparator.comparing(Employee::getYoj);
System.out.println("Oldest joined Employee "+employeeList.stream().collect(Collectors.minBy(minimumYoj)).get());

System.out.println("10.How many females and males in Pilot department");
 employeeList.stream().filter(emp->emp.getDepartment().equalsIgnoreCase("Pilot")).collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()))
                                                                                 .forEach((k,v)->{System.out.println(k+"  "+v);});
System.out.println("11.List names of  all employees in each department\r\n ");
employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment)) .forEach((k,v)->{
	System.out.println("\n"+k+"  Department\n " );
	  v.stream().forEach(System.out::print);
	 
	
	});
System.out.println("\n ()()()()())()())()()()()()()()()()()()()\n");
employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment)).entrySet().forEach(l->{System.out.println(l);});

System.out.println("12.what is average salary of male and female employees\r\n");
employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary))).entrySet().forEach(System.out::println);

System.out.println("13.what is average salary and total salary of the whole organization.\r\n");
DoubleSummaryStatistics summaryStatistics = employeeList.stream().mapToDouble(emp->emp.getSalary()).summaryStatistics();
System.out.println(summaryStatistics.getAverage()+"  totoal "+summaryStatistics.getSum());

String[][] array = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};

String arrayNew[]=Stream.of(array).flatMap(Stream::of).toArray(String[]::new);
 // employeeList.stream().map(emp->emp.getEmployeeCities()).flatMap(array2D-> Arrays.stream(array2D)).forEach(null)           
 
System.out.println("\n print count of the words in string");
//Stream<String> words = Stream(string).flatMap(line -> Stream.of(line.split(" +")));
//List<String[]> listOfAllChars =employeeList.stream().map(emp->emp.getEmployeeCities()).streamflatMap(array2D-> Arrays.stream(array2D)).collect(Collectors.toList());//.forEach(emp->{System.out.println(emp);});
//map(str->str.toString()).forEach(emp->{System.out.println(" emp  "+emp.toLowerCase());});
 

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
