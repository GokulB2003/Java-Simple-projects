package emp.Employee;

/*Q2. Problem:
Create a POJO class Employee with fields: empId, name, basicSalary, hra, and da. Store details of 5 employees using an array of objects. Perform the following operations:
Calculate the gross salary for each employee (gross = basic + hra + da).
Find and display the employee with the maximum salary.
Print the details of employees whose salary is greater than the average salary of all employees.


Explanation:
This covers aggregation + comparison + filtering. You’ll work with numerical calculations and finding max/average values.*/

public class EmployeeOprations {
	
	Employee emp[];
	public void set(Employee emp[])
	{
		this.emp=emp;
	}
	public void displayData()
	{
		System.out.println(".................Employee Details................");
		for(int i=0; i<emp.length; i++)
		{
			System.out.println("EMP ID:"+" "+emp[i].getEmpId()+" "+"EmpName:"+" "+emp[i].getName()+" "+" "+"Empoyee HRA:"+" "+emp[i].getHra()+" "+"DA:"+" "+emp[i].getDa()+"GrossSalary"+emp[i].getGrossSal());
		
		}
	}
	public void maxSalary()
	{
		System.out.println("\n................Maximum Salary...........................");
		int maxi=0;
		
		for(int i=1; i<emp.length; i++)
		{
			if(emp[i].getGrossSal()>emp[maxi].getGrossSal())
			{
				maxi=i;
			}
		}
		System.out.println("Maximum Salary Of Employee;");
		System.out.println("Name:"+emp[maxi].getName()+" "+"Salary:"+" "+emp[maxi].getGrossSal());
		
		
	}
	public void calGrossSalEmp()
	{
		int total=0;
		for(int i=0; i<emp.length; i++)
		{
			total=emp[i].getBasicSalary()+emp[i].getHra()+emp[i].getDa();
			emp[i].setGrossSal(total);
			
		}
	
			
	}
	public int getsum()
	{
		int total=0;
		for(int i=0; i<emp.length; i++)
		{
			total+=emp[i].getGrossSal();
		}
		return total;
	}
	public float averageSalaryOfEmp()
	{
		float avg=0.0f;
			avg=(float)getsum()/emp.length;
			return avg;
	}
	public void TopEmployee()
	{
		System.out.println("\n------------Employees with Salary Greater than Average-------------");
		for(int i=0; i<emp.length; i++)
		{
			if(emp[i].getGrossSal()>averageSalaryOfEmp())
			{
				System.out.println("Name:"+emp[i].getName());
				
			}
		}
	}
	
	

}
