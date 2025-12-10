package collection.org;
import java.util.*;
/*Q6. Create a Vector with repeated integers. Remove duplicates without disturbing the original order.
What you practice:
Checking previous occurrences
Creating a new Vector for results
Order-preserving logic
*/
public class RemoveDuplicates {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]= {10,20,30,30,20,50};
		Arrays.sort(arr);
		Vector v=new Vector();
		for(int i=0; i<arr.length; i++)
		{
			v.add(arr[i]);
		}
		int j=0;
		int k=0;//1 11
		while(j<v.size()-1)
		{
			int val=(int)v.get(j);
			if(v.get(j)!=v.get(j+1))
			{
				v.set(k,val);
				k++;
			}
			
			j++;
		}
		v.set(k, v.get(v.size()-1));
		for(int i=0; i<=k; i++)
		{
			System.out.println(v.get(i));
		}
		
	}
}
