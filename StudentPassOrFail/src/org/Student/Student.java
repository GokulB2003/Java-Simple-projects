package org.Student;
/*Q1. Problem:
Create a POJO class Student with fields: rollNo, name, marks[] (array of 3 subjects). Store data for 5 students using an array of objects. Perform the following operations:
Calculate the total marks of each student.
Find the student with the highest average marks.
Display the list of students who have failed in any subject (marks < 35).
Explanation:
This problem tests array of objects, iteration inside objects, and conditional checks. You practice object encapsulation (POJO) and multiple computations.
*/
public class Student {
	private int rollNo;
	private String name;
	private int marks[];
	int sum;
	public void setRollno(int r)
	{
		rollNo=r;
	}
	public int getRollno()
	{
		return rollNo;
	}
	public void setName(String n)
	{
		name=n;
	}
	public String getName()
	{
		return name;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	public int TotalMarksOfstud()
	{
		 sum=0;
		for(int i=0; i<marks.length; i++)
		{
			//System.out.println("maks"+marks[i]);
			sum+=marks[i];
		}
		return sum;
	}
	public void DisplayTotal()
	{
		System.out.println("id"+" "+getRollno()+"name"+" "+getName()+"Marks:"+" "+TotalMarksOfstud());
		
		
	}
	public int getAvg()
	{
		return TotalMarksOfstud()/marks.length;
	}
	public boolean checkPassOrF()
	{
		boolean flag=false;
		for(int i=0; i<marks.length; i++)
		{
			if(marks[i]<=40)
			{
				flag=true;
				break;
			}
			
		}
		return flag;
	}
	
}
