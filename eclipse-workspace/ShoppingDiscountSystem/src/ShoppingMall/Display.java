package ShoppingMall;

public class Display {
public void display(Product p)
{
	double finalP=p.getFinalPrice();
	
	System.out.println("Product Information:");
	System.out.println("Name of the Product is:"+p.name);
	System.out.println("Price of the Product is:"+p.price);
	System.out.println("total Bill of the" +p.name+":"+" is:"+finalP);

}
}
