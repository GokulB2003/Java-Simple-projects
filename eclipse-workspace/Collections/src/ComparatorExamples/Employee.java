package ComparatorExamples;
import java.util.*;
class Employee {
int id;
int sal;
private String name;
Employee(int id,int sal,String name)
{
	this.name=name;
	this.id=id;
	this.sal=sal;
	
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getSal() {
	return sal;
}
public void setSal(int sal) {
	this.sal = sal;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}
