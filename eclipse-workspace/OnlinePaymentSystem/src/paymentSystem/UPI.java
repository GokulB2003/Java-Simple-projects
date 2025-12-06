package paymentSystem;

class UPI implements Payment{
	double amount;
	public void processPayment(double amount)
	{
		this.amount=amount;
		
	}
	public double getCharges()
	{
		return amount;
		
	}
	
	
	
	

}
