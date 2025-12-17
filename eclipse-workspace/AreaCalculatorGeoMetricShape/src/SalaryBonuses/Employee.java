package SalaryBonuses;
import java.util.*;
public abstract class Employee implements Performance{

	String name;
	int id;
	double baseSal;
	int rating;
	Employee(String n,int id,double baseSal,int rating)
	{
		this.name=n;
		this.id=id;
		this.baseSal=baseSal;
		this.rating=rating;
	}
	abstract double calCulateBonus();
	double calFinalSal()
	{
		return calCulateBonus()+baseSal;
	}
	public int getRating()
	{
		return rating;
	}
	public void display()
	{
		System.out.println("Welcome to the Company...............");
		System.out.println("ID:\t\t"+id);
		System.out.println("name\t\t"+name);
		System.out.println("Basic Salary:\t"+baseSal);
		System.out.println("rating:\t\t"+rating);
		System.out.println("Bonus:\t\t"+calCulateBonus());
		System.out.println("Final Sal:\t"+calFinalSal());
		
		
	}
	
}
