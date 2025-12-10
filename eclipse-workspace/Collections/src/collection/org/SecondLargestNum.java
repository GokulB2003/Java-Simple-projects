package collection.org;
import java.util.*;

/*Q5. Take an integer array, store it in a Vector, and determine the second largest number without sorting.
What you practice:
Max/second-max tracking
Using Vector get() method
Efficient single-pass logic
*/
public class SecondLargestNum {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		ArrayList arr=new ArrayList();
		arr.add(90);
		arr.add(10);
		arr.add(20);
		arr.add(40);
		arr.add(90);
		arr.add(40);
		arr.add(40);
		
		Vector v=new Vector(arr);
		int max=Integer.MIN_VALUE;
		int smax=0;
		for(int i=0; i<v.size(); i++)
		{
			int val=(int)v.get(i);
			
			if(val>max)
			{	//smax=max;//[12,34,0,10,5]
				max=val;	
			}
			else if(val>smax && val<max)
			{
				smax=val;
				
			}

		}
		System.out.println("the maximum value of the Array is:"+max);
		System.out.println("the second Maximum value of Array is:"+smax);
		
		
	}
}
