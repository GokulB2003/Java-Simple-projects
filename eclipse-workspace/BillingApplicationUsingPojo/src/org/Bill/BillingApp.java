package org.Bill;
import java.util.*;
public class BillingApp {
//Customer: this class can store data of customer which contain id , name , email, contact ,address	
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Billing Application:");
	Shop s=new Shop();
	Product p=new Product();
	Customer c=new Customer();
	
	/*Product p[]=new Product[2];
	for(int i=0; i<p.length; i++)
	{
		p[i]=new Product();
		p[i].setName("kaaju");
		p[i].setCompanyName("Kajuu");
		
		p[i].setEmail("BHor");
		p[i].setQty(12);
		p[i].setRate(40);
		
		
	}*/
	//s.addProducts(p);
	
	p.setId(1);
	p.setName("kaaju");
	p.setCompanyName("Kajuu");
	p.setEmail("BHor");
	p.setQty(12);
	p.setRate(40);
	s.addProducts(p);
	
	Product p2=new Product();
	p2.setId(1);
	p2.setName("Baddam");
	p2.setCompanyName("Kajuu");
	p2.setEmail("Tidhe");
	p2.setQty(10);
	p2.setRate(20);
	s.addProducts(p2);
	
	c.setId(1);
	c.setName("Raju");
	c.setEmail("R");
	c.setSontact(1234);
	c.setAdd("Pune");
	
	s.calBill(c,p,p2);


	

	
	
	
	
	
}
}
