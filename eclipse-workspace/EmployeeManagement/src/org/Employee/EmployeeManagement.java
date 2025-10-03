package org.Employee;
import java.util.*;

public class EmployeeManagement {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(".................Enter the no.of Employee:.................");
		Employee Emp[]=new Employee[sc.nextInt()];
		InputOutput obj=new InputOutput();
		obj.set(Emp);
		
	}
}
