package area;

public class Rectangle implements Shape {
	int length;
	int breadth;
	Rectangle(int l,int b)
	{
		this.length=l;
		this.breadth=b;
	}
	public double area()
	{
		return length*breadth;
	}

}
