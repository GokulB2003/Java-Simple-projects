package ShoppingMall;

public class Electronics extends Product{
	Electronics(String name,double  price)
	{
		
		super(name,price);
	}
	public double getFinalPrice()
	{
		if(price>20000)
		{
			return price-(price*0.18);
			
		}
		else
		{
			return price-(price*0.10);
		}
	}
	
	
	public void display(Product p)
	{
		
	}
}

