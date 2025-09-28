package org.Student;
/*Q1. Problem:
Create a POJO class Student with fields: rollNo, name, marks[] (array of 3 subjects). Store data for 5 students using an array of objects. Perform the following operations:
Calculate the total marks of each student.
Find the student with the highest average marks.
Display the list of students who have failed in any subject (marks < 35).
Explanation:
This problem tests array of objects, iteration inside objects, and conditional checks. You practice object encapsulation (POJO) and multiple computations.
*/
import java.util.*;
public class CheckStudentPassOrFail {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of students:");
		int n=sc.nextInt();
		
		//Student obj=new Student();
		Student[] s=new Student[n];
		for(int i=0; i<s.length; i++)
		{
			System.out.println("Enter the id of Student:");
			int id=sc.nextInt();
	
			sc.nextLine();
			System.out.println("Enter the student name");
			String name=sc.nextLine();
	
			System.out.println("Enter how many Subjects marks u want to store");
			int MarksA=sc.nextInt();
			int marks[]=new int[MarksA];
			for(int j=0; j<marks.length; j++)
			{
				System.out.println("Enter the marks of "+(j+1)+"subject");
				marks[j]=sc.nextInt();
			}
	
			s[i]=new Student();
			s[i].setRollno(id);
			s[i].setName(name);
			s[i].setMarks(marks);
			
			
		}
		for(int i=0; i<s.length; i++)
		{
			s[i].DisplayTotal();
			
		}
		Student st=s[0];
		for(int i=1; i<s.length; i++)
		{
			//Student st=s[i];
			if(s[i].getAvg()>st.getAvg())
			{
				st=s[i];
			}
		}
		System.out.println("Maximum AvG is:"+st.getAvg()+" "+"Topper of class is"+st.getName());
		
		for(int i=0; i<s.length; i++)
		{
			Student sd=s[i];
			
			if(sd.checkPassOrF())
				{
					System.out.println(sd.getName()+" "+"Fail");
				}
			else
			{
				System.out.println(sd.getName()+" "+"Pass");
			}
		}
		
	}
	
	
}
