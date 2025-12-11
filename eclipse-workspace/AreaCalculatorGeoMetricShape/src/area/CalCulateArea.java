package area;
import java.util.*;

public class CalCulateArea {
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("********************************");
		int choice;
		ArrayList<Shape>ans=new ArrayList<>();
		
		int i=0;
		do
		{
		System.out.println("Select the choice:");
		System.out.println("1.Circle");
		System.out.println("2.Rectangle");
		System.out.println("3.Triangle");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter the radius of the circle:");
			int r=sc.nextInt();
			ans.add(new Circle(r));
			break;
		case 2:
			System.out.println("Enter the Length of the rectangle:");
			int l=sc.nextInt();
			System.out.println("Enter the breadth of the rectangle:");
			int b=sc.nextInt();
			ans.add(new Rectangle(l,b));
			break;
		case 3:
			System.out.println("Enter the base of the Triangle:");
			int base=sc.nextInt();
			System.out.println("Enter the height of the Triangle:");
			int h=sc.nextInt();
			ans.add(new Triangle(base,h));
			break;
		default:
			System.out.println("Enter the valid choice");
			continue;
			
			
		}
		
		
		i++;
		}while(i<3);
		double max=0.0;
		Shape q;
		System.out.println("********'Area calculation'******************************");
		for(Shape ar:ans)
		{
			double arr=ar.area();
			System.out.println("Area of the :"+ar.getClass().getSimpleName()+"\t"+arr);
			if(arr>max)
			{
				max=arr;
				q=ar;
			}
			
		}
		
		System.out.println("\tMaximum Area is:\t"+max);
	
		
}
	
}
