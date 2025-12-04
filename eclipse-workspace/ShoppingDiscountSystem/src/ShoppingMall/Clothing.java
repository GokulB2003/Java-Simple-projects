package ShoppingMall;

public class Clothing extends Product{
	boolean seasonSell;
	Clothing(String name,double price,boolean seasonSell)
	{
		
		super(name,price);
		this.seasonSell=seasonSell;
	}
	public double getFinalPrice()
	{
		if(seasonSell)
		{
			return price-(price*0.30);
			
		}
		else
		{
			return price-(price*0.05);
		}
	}
	

}
