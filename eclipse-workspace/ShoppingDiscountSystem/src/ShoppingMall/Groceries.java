package ShoppingMall;

public class Groceries extends Product {
	boolean member;
	Groceries(String name,double price,boolean member)
	{
		super(name,price);
		this.member=member;
	}
	public double getFinalPrice()
	{
		if(member)
		{
			
			return price-(price*0.03);
		}
		else
		{
			return price;
		}
	}

}
