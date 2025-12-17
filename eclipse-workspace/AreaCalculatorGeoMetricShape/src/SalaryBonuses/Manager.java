package SalaryBonuses;

public class Manager extends Employee {
	
	
	Manager(String name,int id,double baseSal,int rate)
	{
		super(name,id,baseSal,rate);
	
	}

	
	/*Developer → baseSalary × rating × 0.05


Manager → baseSalary × rating × 0.08


SalesExecutive → baseSalary × rating × 0.04 + (sales × 0.03)


*/
	@Override
	double calCulateBonus() {
		// TODO Auto-generated method stub
		double total=baseSal*rating*0.08;
		return total;
	}
	

}
