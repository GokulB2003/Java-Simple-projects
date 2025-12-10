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
	for(Object obj:arr)
	{
		int abc=(int)obj;
		if(!newArr.contains(abc))
		{
			newArr.add(abc);
		}
		
	}
	ListIterator li=newArr.listIterator();
	/*while(li.hasNext())
	{
		Object a=li.next();
		System.out.println(a);
	}*/
	for(Object obj:newArr)
	{
		System.out.println(obj);
	}
}
}
