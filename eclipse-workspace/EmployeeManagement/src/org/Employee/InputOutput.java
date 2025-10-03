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
public class InputOutput {
	Scanner sc=new Scanner(System.in);
	Employee[] emp;
	public void set(Employee[] emp)
	{
		this.emp=emp;
		Input();
	}
	public void Input()
	{
		int index=0;
		System.out.println("select choice:");
		int choice;
		do
		{
			System.out.println("1. Add Employee Details.");
			System.out.println("2. Display All Employee Details.");
			System.out.println("3. Search Employee By Id then employee is found or not.");
			System.out.println("4. Update Employee Details By Name.");
			System.out.println("5. Delete Employee Details By Email.");
			System.out.println("6. Display list count of the Employee in Company.");
			System.out.println("7. Display list the employee in the ascending order of employee salary.");
			System.out.println("8. Display the employee details in highest salary.");
			System.out.println("9. Display the employee details in minimum salary is 10000 to maximum salary is 60000.");
			System.out.println("10. Exit.");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					if(index<emp.length)
					{
						System.out.println("--------------------------Add Employee data---------------------");
						System.out.println("ENter the Employee Id:");
						int id=sc.nextInt();
						emp[index]=new Employee();
						emp[index].setEmpid(id);
						System.out.println("Enter the Employee Name:");
						sc.nextLine();
						String name=sc.nextLine();
						emp[index].setEmpname(name);
						System.out.println("Enter the Employee Email:");
						String email=sc.nextLine();
						emp[index].setEmpemail(email);
						System.out.println("Enter the Employee Contact:");
						int c=sc.nextInt();
						System.out.println("Enter the Employee Salary:");
						int s=sc.nextInt();
						emp[index].setEmpcontact(c);
						emp[index].setEmpsalary(s);
						index++;
					}
					else
					{
						System.out.println("List is full");
					}
					break;
				case 2:
					System.out.println("------------------------All Employee Data-------------------");
					System.out.println("Employee Id\t"+"Name:\t\t"+"Email:\t\t"+"Contact");
					for(int i=0; i<index; i++)
					{
						System.out.println(emp[i].getEmpid()+"\t\t"+emp[i].getEmpname()+"\t\t"+emp[i].getEmpemail()+"\t\t"+emp[i].getEmpcontact());
					}
					break;
				case 3:
					System.out.println("-------------------Employee present or not-------------------");
					System.out.println("Enter the employee Id:");
					int id=sc.nextInt();
					boolean flag=false;
					for(int i=0; i<index; i++)
					{
						if(emp[i].getEmpid()==id)
						{
							System.out.println("Employee Is present with name:\t"+emp[i].getEmpname());
							flag=true;
							break;
						}
						
					}
					if(flag==false)
					{
						System.out.println("Employee is not present please Enter a valid ID");
					}
					break;
				case 4:
					System.out.println("------------------------Update Employee Details By Name:-----------------------------");
					System.out.println("Enter the Employee Name:");
					sc.nextLine();
					String name=sc.nextLine();
					for(int i=0; i<index; i++)
					{
						String p=emp[i].getEmpname();
						if(p.equals(name))
						{
							System.out.println("Enter the new Employee Id:");
							int d=sc.nextInt();
							
							System.out.println("Enter the new Employee Name:");
							sc.nextLine();
							String nm=sc.nextLine();
							
							System.out.println("Enter the new Employee Email:");
							String mail=sc.nextLine();
							
							System.out.println("Enter the new Employee Contact:");
							int con=sc.nextInt();
							
							System.out.println("Enter the new Employee Salary:");
							int sa=sc.nextInt();
							
							emp[i].setEmpcontact(con);
							emp[i].setEmpemail(mail);
							emp[i].setEmpname(nm);
							emp[i].setEmpid(d);
							emp[i].setEmpsalary(sa);
						
							
						}
					}
					System.out.println("Employee Details updated:");
					break;
				case 5:
					System.out.println("---------------Delete Employee Details-----------------");
					System.out.println("Enter the Email of Employee to delete details:");
					sc.nextLine();
					String em=sc.nextLine();
					for(int i=0; i<index; i++)
					{
						String e=emp[i].getEmpemail();
						if(em.equals(e))
						{
							int k=i;
							while(k<index-1)
							{
								emp[k]=emp[k+1];
								k++;
							}
						}
					}
					index--;
					System.out.println("Data Deleted successfully:");
					break;
				case 6:
					System.out.println("--------------------count of Employee--------------------");
					System.out.println("the total count of Employee is:\t"+index);
					break;
				case 7:
					System.out.println("data in ascending order");
					for(int i=0; i<index-1; i++)
					{
						for(int j=i+1; j<index; j++)
						{
							if(emp[i].getEmpsalary()>emp[j].getEmpsalary())
							{
								Employee temp=emp[i];
								emp[i]=emp[j];
								emp[j]=temp;
								
							}
						}
					}
					System.out.println("After Ascending order Salary Employee data is:");
					System.out.println("------------------------All Employee Data-------------------");
					System.out.println("Employee Id\t"+"Name:\\tt"+"Email:\t\t"+"Contact");
					for(int i=0; i<index; i++)
					{
						System.out.println(emp[i].getEmpid()+"\t\t"+emp[i].getEmpname()+"\t\t"+emp[i].getEmpemail()+"\t\t"+emp[i].getEmpcontact());
					}
					break;
				case 8:
					System.out.println("........................Employee Highest salary.................");
					int maxi=0;
					for(int i=0; i<index; i++)
					{
						if(emp[i].getEmpsalary()>emp[maxi].getEmpsalary())
						{
							maxi=i;
						}
						
					}
					System.out.println("The maximum Salary of Emplyee:\t\t"+emp[maxi].getEmpname()+"\tSalary is:\t"+emp[maxi].getEmpsalary());
					break;
				case 9:
					System.out.println("employee details in minimum salary is 10000 to maximum salary is 60000");
					System.out.println("Employee Id\t"+"Name:\t\t"+"Email:\t"+"Contact");
					for(int i=0; i<index; i++)
					{
						if(emp[i].getEmpsalary()>10000 && emp[i].getEmpsalary()<=60000)
						{
							System.out.println(emp[i].getEmpid()+"\t\t"+emp[i].getEmpname()+"\t\t"+emp[i].getEmpemail()+"\t\t"+emp[i].getEmpcontact());
						}
					}
					break;
				case 10:
					System.out.println("................................EXIT.................................");
					break;
			
			}
			
		}while(choice!=10);
		
	}
}
