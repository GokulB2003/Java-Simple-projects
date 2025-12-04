package org.Student;

/*Create a POJO class Student with fields: id, name, email, contact, course, marks.
Create a College class, pass multiple Student objects using var-args.
Implement operations in the main class:

Add Student Details.
Show All Student Details.

Search Student Using:
id
name

Delete Student Using:
email
marks < 40 (failed students).


Update Student Using:
id → update course.
name → update contact.


Sort Students:
By id ascending.
By marks descending.
Display the topper (highest marks).
Display students with marks between 50–80.
Exit
*/
import java.util.*;
class College {
	System.out.println("Enter the number of students to add:");
	Scanner sc=new Scanner(System.in);
	Student students[]=new Student[sc.nextInt()];
	int count=0;
	public void addStud(Student... studs)
	{
		for(Student s:studs)
		{
			students[count++]=s;
			count++;
		}
		
	}
	public void displayData()
	{
		System.out.println("id\t\t"+"name\t\t"+"Email\t\t"+"Contact\t\t"+"course\t\t"+"marks\t\t");
		for(int i=0; i<count; i++)
		{
			System.out.println(students[i].getId()+"\t\t"+students[i].getName()+"\t\t"+students[i].getEmail()+"\t\t"+students[i].getContact()+"\t\t"+students[i].getCourse()+"\t\t"+students[i].getMarks());
		}
	}
	
	public boolean searchById(int id)
	{
		boolean flag=false;
		for(int i=0; i<count; i++)
		{
			if(students[i].getId()==id)
			{
				flag=true;
				break;
			}
		}
		if(flag)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void searchByname(String name)
	{
		for(int i=0; i<count; i++)
		{
			String p=students[i].getName();
			if(p.equals(name))
			{
				System.out.println("id\t\t"+"name\t\t"+"Email\t\t"+"Contact\t\t"+"course\t\t"+"marks\t\t");
				System.out.println(students[i].getId()+"\t\t"+students[i].getName()+"\t\t"+students[i].getEmail()+"\t\t"+students[i].getContact()+"\t\t"+students[i].getCourse()+"\t\t"+students[i].getMarks());
			}
			
		}
	}
	public void deleteStudentbyEmail(String mail)
	{
		
		for(int i=0; i<count; i++)
		{	String a=students[i].getEmail();
			if(a.equals(mail))
					{
						int p=i;
						while(p<count)
						{
							students[p]=students[p+1];
							p++;
						}
					}
				
		}
		System.out.println("Student details deleted successfully:");
		
		
		
	}
	public void deleteStudentbyEmail()
	{
		
		for(int i=0; i<count; i++)
		{	
					if(students[i].getMarks()<=40)
					{
						int p=i;
						while(p<count)
						{
							students[p]=students[p+1];
							p++;
						}
					}
		}
		count--;
		System.out.println("Student details deleted successfully:");
	
	}
	public void update(int id)
	{
		for(int i=0; i<count; i++)
		{
			if(students[i].getId()==id)
			{
				System.out.println("Enter the new Id of Student:");
				//int Id=sc.nextInt();
				students[i].setId(sc.nextInt());
				System.out.println("Enter the new name of the student:");
				sc.nextLine();
				students[i].setName(sc.nextLine());
				System.out.println("Enter the new Email of student:");
				students[i]
				
			}
		}
		
	}

}
