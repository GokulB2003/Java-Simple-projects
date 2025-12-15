package collection.org;
import java.util.*;
public class ProductOfArrayExceptSelf {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int product=1;
		ArrayList <Integer>arr=new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		
		ArrayList<Integer>ans=findp(arr);
		System.out.println(ans);
		
		
	}
	public static ArrayList<Integer> findp(ArrayList<Integer>arr)
	{
		int product=1;//1 2 3 4
		ArrayList <Integer>ans=new ArrayList<>();
		for(int i=0; i<arr.size(); i++)
		{
			product=1;
			for(int j=0; j<arr.size(); j++)
			{
				if(j!=i)
				{
					product=arr.get(j)*product;
				}
				
			}
			ans.add(product);
		}
		return ans;
	}
}
