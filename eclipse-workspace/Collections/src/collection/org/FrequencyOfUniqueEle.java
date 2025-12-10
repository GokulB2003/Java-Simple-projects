package collection.org;
import java.util.*;
import java.util.List;
/*/Q4. Take an integer array with repeated values. Store it in an ArrayList and print the frequency of each unique number.
What you practice:
Traversing ArrayList
Using another ArrayList to track visited elements
Logical counting
*/
public class FrequencyOfUniqueEle {
public static void main(String argsp[])
{
	Scanner sc=new Scanner(System.in);
	ArrayList arr=new ArrayList();
	ArrayList newArr=new ArrayList();
	arr.add(30);
	arr.add(30);
	arr.add(50);
	arr.add(40);
	arr.add(90);
	arr.add(30);
	Collections.sort(arr);
	
	for(Object obj:arr)
	{
		int abc=(int)obj;
		if(!newArr.contains(abc))
		{
			newArr.add(abc);
		}
		
	}

	int j=0;
	int count=1;
/*	for(int i=1; i<arr.size(); i++)
	{

		if(arr.get(i).equals(arr.get(i-1)))
		{
			count++;
		}
		else
		{
			System.out.println("the frequency of the  :"+arr.get(i-1)+":\t"+count);
			count=1;
			
		}
			
	}
	System.out.println("the frequency of the  :"+arr.get(arr.size()-1)+":\t"+count);
	*/
	System.out.println("the unique element is:");
	ListIterator li=newArr.listIterator();
	while(li.hasNext())
	{
		Object a=li.next();
		System.out.println(a);
	}
	/*for(Object obj:newArr)
	{
		System.out.println(obj);
	}*/
	for(int i=0; i<newArr.size(); i++)
	{
		int k=0;
		count=0;
		while(k<arr.size())
		{
			if(arr.get(k)==newArr.get(i))
			{
				count++;
			}
			k++;
			
		}
		System.out.println("count of:"+newArr.get(i)+":\t"+count);
		
	}
	
	
	
}
}
