package collection.org;
import java.util.*;
public class BookMain {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	
		Vector v=new Vector();
		
		Book b[]=new Book[4];
		
		for(int i=0; i<b.length; i++)
		{
			System.out.println("Enter the id:");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the author:");
			String author=sc.nextLine();
			
			System.out.println("Enter the name");
			String name=sc.nextLine();
			b[i]=new Book(id,name,author);
			v.add(b[i]);
		}
		//display
		Iterator i=v.iterator();
		System.out.println("ID\t\t"+"Name:\t"+"Author\t");
		while(i.hasNext())
		{
			Object obj=i.next();
			Book val=(Book)obj;
			System.out.println(val.getId()+"\t"+val.getName()+"\t"+val.getAuthor()+"\t");
		}
		
		//search the data by using the id
		System.out.println("Enter the data to search:");
		int newId=sc.nextInt();
		
		Iterator j=v.iterator();
		while(j.hasNext())
		{
			Object ob=j.next();
			Book x=(Book)ob;
			if((int)x.getId()==newId)
			{
				System.out.println("ID\t"+x.getId()+"Author"+x.getAuthor()+"name\t"+x.getName());
			}
		}
		
	}
}
