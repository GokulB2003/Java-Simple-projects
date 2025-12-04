package org.Student;

/*
 Create a POJO class Student with fields: id, name, email, contact, course, marks.
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
Exit.
*/
public class Student {
	private int id;
	private String name;
	private String email;
	private double contact;
	private String course;
	private int marks;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getContact() {
		return contact;
	}
	public void setContact(double contact) {
		this.contact = contact;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}


}
