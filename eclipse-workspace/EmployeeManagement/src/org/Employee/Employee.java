package org.Employee;

/*Q2. Write a menu driven program in java to Create a class name as Employee to hold empid, empname , empemail , empcontact and empsalry.
			
The menu options should be: 
		
	1. Add Employee Details.
	2. Display All Employee Details.\
	3. Search Employee By Id then employee is found or not.
	4. Update Employee Details By Name.
	5. Delete Employee Details By Email.
	6. Display list count of the Employee in Company.
	7. Display list the employee in the ascending order of employee salary.
	8. Display the employee details in highest salary.
	9. Display the employee details in minimum salary is 10000 to maximum salary is 60000.
	10. Exit.

*/
import java.util.*;

class Employee {

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getEmpemail() {
		return empemail;
	}

	public void setEmpemail(String empemail) {
		this.empemail = empemail;
	}

	public int getEmpcontact() {
		return empcontact;
	}

	public void setEmpcontact(int empcontact) {
		this.empcontact = empcontact;
	}

	public int getEmpsalary() {
		return empsalary;
	}

	public void setEmpsalary(int empsalary) {
		this.empsalary = empsalary;
	}

	private int empid;
	private String empname;
	private String empemail;
	private int empcontact;
	private int empsalary;

}
