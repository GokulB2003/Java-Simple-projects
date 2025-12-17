package SalaryBonuses;
import java.util.*;
public class MainClass {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	double DBonus=0.0f,MBonus=0,SBonus=0;
	Employee emp=null;
	emp=new Developer("Ramu",1,20000,4);
	DBonus=emp.calFinalSal();
	emp.calFinalSal();
	emp.display();
	emp=new Manager("Gopi",2,40000,3);
	MBonus=emp.calFinalSal();
	emp.display();
	emp=new SalesExecutive("Mangu",3,5000,4,2000);
	SBonus=emp.calFinalSal();
	emp.display();
}
}
