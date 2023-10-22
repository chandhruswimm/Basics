package com.collection;

import java.util.ArrayList;

public class CollectionforUserDefinedType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(123, "chan", 25000.0, 'a');
		Employee e2 = new Employee(456, "nattu", 26000.0, 'b');
		Employee e3 = new Employee(789, "ara", 30000.0, 'c');
		Student s1=new Student(12,"Raj");
		Student s2=new Student(24,"Raju");
		ArrayList al = new ArrayList();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(s1);
		al.add(s2);
		System.out.println(al);
	}
}

class Employee {
	int empId;
	String empname;
	double empsalary;
	char empgrade;

	public Employee(int empId, String empname, double empsalary, char empgrade) {
		super();
		this.empId = empId;
		this.empname = empname;
		this.empsalary = empsalary;
		this.empgrade = empgrade;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empname=" + empname + ", empsalary=" + empsalary + ", empgrade="
				+ empgrade + "]";
	}
}
	class Student{
		int stuId;
		String stuname;
		public Student(int stuId, String stuname) {
			super();
			this.stuId = stuId;
			this.stuname = stuname;
		}
		@Override
		public String toString() {
			return "Student [stuId=" + stuId + ", stuname=" + stuname + "]";
		}
		
	}
	
