package SalaryBonuses;

public class Developer extends Employee {
	
	Developer(String name,int id,double baseSal,int rate)
	{
		super(name,id,baseSal,rate);
		
	}

	@Override
	double calCulateBonus() {
		// TODO Auto-generated method stub
//		 baseSal* rating × 0.05
		double total=baseSal*rating*0.05;
		return total;
	}
	
}
