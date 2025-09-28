package emp.Employee;
import java.util.*;
/*Q2. Problem:
Create a POJO class Employee with fields: empId, name, basicSalary, hra, and da. Store details of 5 employees using an array of objects. Perform the following operations:
Calculate the gross salary for each employee (gross = basic + hra + da).
Find and display the employee with the maximum salary.
Print the details of employees whose salary is greater than the average salary of all employees.


Explanation:
This covers aggregation + comparison + filtering. You’ll work with numerical calculations and finding max/average values.
*/
public class Employee {
private int empId;
private String name;
private int basicSalary;
private int hra;
private int da;
private int gross;

public int getEmpId() {
	return empId;
	
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getBasicSalary() {
	return basicSalary;
}
public void setBasicSalary(int basicSalary) {
	this.basicSalary = basicSalary;
}
public int getHra() {
	return hra;
}
public void setHra(int hra) {
	this.hra = hra;
}
public int getDa() {
	return da;
}
public void setDa(int da) {
	this.da = da;
}
public void setGrossSal(int t)
{
	gross=t;
}
public int getGrossSal()
{
	return gross;
}


}

