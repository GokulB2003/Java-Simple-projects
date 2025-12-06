package area;
public class Triangle implements Shape{
	int base;
	int height;
	Triangle(int base,int height)
	{
		this.base=base;
		this.height=height;
		
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0.5*base*height;
	}
	

	
}
