package collection.org;
class ABC
{
	static void add(int a,int b)
	{
		System.out.println("parent"+(a+b));
	}
}
class NewABC extends ABC
{
	 static void add(int a,int b)
	{
		System.out.println(a+b);
		
	}
}
public class MethodHiding {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewABC obj=new NewABC();
		obj.add(10, 30);
		//System.out.println(result);
	}

}
