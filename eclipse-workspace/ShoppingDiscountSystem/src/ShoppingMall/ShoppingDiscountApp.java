package ShoppingMall;
import java.util.*;
public class ShoppingDiscountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of the products:");
		int n=sc.nextInt();
		Product p[]=new Product[n];
		//String name=sc.nextLine();
		double finalP=0.0;
		double finalPrice=0.0;
		double result=0.0;
		
		int i=0;
		do
		{
			System.out.println("ENter the type of the Product:");
			System.out.println("1.Elecronics:");
			System.out.println("2.Clothing");
			System.out.println("3.Groceries");
			int type=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the name of the product:");
			String name=sc.nextLine();
		
			System.out.println("Enter the Price of the Product:");
			int price=sc.nextInt();
			
			
			switch(type)
			{
			case 1:
				p[i] = new Electronics(name, price);
				break;
			case 2:
				  System.out.println("Season sale? (true/false):");
				  sc.nextLine();
                  boolean a = sc.nextBoolean();
                  p[i] = new Clothing(name, price, a);
                  break;
			case 3:
				   System.out.println("Are you a member? (true/false):");
				   sc.nextLine();
                   boolean b = sc.nextBoolean();
                   p[i] = new Groceries(name, price, b);
                   break;
			}
			Display d=new Display();
			d.display(p[i]);
			i++;
			
		}
		while(i<n);
		
	
		
		

	}

}
