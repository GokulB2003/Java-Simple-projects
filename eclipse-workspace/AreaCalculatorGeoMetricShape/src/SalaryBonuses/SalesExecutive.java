package SalaryBonuses;
import java.util.*;
public class SalesExecutive extends Employee{
	int sales;
	
	SalesExecutive(String name,int id,double baseSal,int rate,int sales)
	{
		super(name,id,baseSal,rate);
		this.sales=sales;
		
	}

/*Developer → baseSalary × rating × 0.05


Manager → baseSalary × rating × 0.08


SalesExecutive → baseSalary × rating × 0.04 + (sales × 0.03)


*/
	@Override
	double calCulateBonus() {
		// TODO Auto-generated method stub
		double total=baseSal*rating*0.04+(sales*0.03);
		
		return total;
	
	}
	
}
