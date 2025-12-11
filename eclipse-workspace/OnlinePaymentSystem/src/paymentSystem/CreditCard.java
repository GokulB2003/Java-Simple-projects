package paymentSystem;

public class CreditCard implements Payment{
	double charges;
	public void processPayment(double amnt)
	{
		charges=amnt*0.02;
		charges+=amnt;
		this.charges=charges;
		
	}
	public double getCharges()
	{
		return charges;
		
		
	}

}
