package paymentSystem;

public class DebitCard implements Payment{
double amnt;
public void processPayment(double amnt)
{
	double charges=amnt*0.01;
	amnt=amnt+charges;
	this.amnt=amnt;
	
}
public double getCharges()
{
	return amnt;
	
}
	
}
