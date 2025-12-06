package paymentSystem;

class DisplayData {

	Payment p;
	public void setData(Payment p)
	{
		this.p=p;
	}
	public void display()
	{
		System.out.println("************************");
		System.out.println("Final Amout of user is:"+p.getCharges());
		
	}
	
	
}
