package collection.org;
import java.util.*;

public class List {
	public static void main(String args[])
	{
		Vector v=new Vector();
		v.add(12);
		v.add(34);
		v.add(16);
		v.add(20);
		v.set(3, 100);
		
		ListIterator i=v.listIterator();
		
		while(i.hasNext())
		{	Object p=i.nextIndex();
			System.out.println(p);
			Object obj=i.next();
			System.out.println(obj);
		}
		
	}
}
