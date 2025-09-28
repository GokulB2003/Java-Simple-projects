package emp.Employee;
/*Q2. Problem:
Create a POJO class Employee with fields: empId, name, basicSalary, hra, and da. Store details of 5 employees using an array of objects. Perform the following operations:
Calculate the gross salary for each employee (gross = basic + hra + da).
Find and display the employee with the maximum salary.
Print the details of employees whose salary is greater than the average salary of all employees.


Explanation:
This covers aggregation + comparison + filtering. You’ll work with numerical calculations and finding max/average values.
*/
import java.util.*;
public class EmployeeSalary {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("ENter the no.of Employee in company:");
	Employee e[]=new Employee[sc.nextInt()];
	for(int i=0; i<e.length; i++)
	{
		System.out.println("Enter the Employee Id");
		int id=sc.nextInt();
		
		e[i]=new Employee();
		e[i].setEmpId(id);
		sc.nextLine();//clear Buffer
		
		System.out.println("Enter the Employee Name:");
		String name=sc.nextLine();
		e[i].setName(name);
		
		System.out.println("Enter the BasicSalary of Employee:"+" "+e[i].getName());
		int bS=sc.nextInt();
		e[i].setBasicSalary(bS);
		
		System.out.println("Enter the HRA of Employee:"+" "+e[i].getName());
		int hra=sc.nextInt();
		e[i].setHra(hra);
		
		System.out.println("Enter the DA of Employee:"+" "+e[i].getName());
		int da=sc.nextInt();
		e[i].setDa(da);
		
		
		
		
	}
	EmployeeOprations obj=new EmployeeOprations();
	obj.set(e);
	obj.calGrossSalEmp();
	obj.displayData();
	obj.maxSalary();
	obj.TopEmployee();
}
}
