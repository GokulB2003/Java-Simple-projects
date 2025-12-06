package area;

public class Circle implements Shape{
	int radius;
	Circle(int radius)
	{
		this.radius=radius;
	}
	public double area()
	{
		return 3.14*radius*radius;
		
	}

}
