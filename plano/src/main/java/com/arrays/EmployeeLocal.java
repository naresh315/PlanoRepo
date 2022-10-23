package com.arrays;

public class EmployeeLocal implements Comparable  {
	public  Integer id;
	public Integer getId() {
		return id;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getYoj() {
		return yoj;
	}
	public void setYoj(int yoj) {
		this.yoj = yoj;
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
	public String getInsuranceScheme() {
		return insuranceScheme;
	}
	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}

	private String name;
	private int  age;
	private String gender;
	private  String department;
	private int yoj;
	public double salary;
	private String designation;
	private String insuranceScheme; 
	public EmployeeLocal() {
		// TODO Auto-generated constructor stub
	}
	 EmployeeLocal(Integer id,String Name,int age,String gender,String department,int yoj,double salary) {
			this.id = id;;
			this.name = name;
			this.age = age;
			this.gender = gender;
			this.department = department;
			this.yoj = yoj;
			this.salary=salary;
	 }
    @Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+"     "+salary;
	}
	public EmployeeLocal(Integer id,double salary) {
		this.id = id;
		this.salary = salary;
		// TODO Auto-generated constructor stub
	}
	 
	 
	  @Override
	  public boolean equals(final Object obj) {
	    if (this == obj) {
	      return true;
	    }
	    if (obj == null) {
	      return false;
	    }
	    if (getClass() != obj.getClass()) {
	      return false;
	    }
	    EmployeeLocal other = (EmployeeLocal) obj;
	    return this.id==other.id;
	  }
	  
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return ((EmployeeLocal)o).id.compareTo(this.id);
	}
	
}