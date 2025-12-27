package ComparatorExamples;
import java.util.*;
public class ComparatorMain {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Comparator c=new SortByUsingId();
		Employee emp1=new Employee(1,12300,"Raju");
		Employee emp2=new Employee(0,1230,"Mangu");
		Employee emp3=new Employee(3,1400,"Pandit");
		Employee emp4=new Employee(9,11111,"Monyaa");
		Employee emp5=new Employee(10,1900,"Divya");
		
		ArrayList ans=new ArrayList();
		ans.add(emp1);
		ans.add(emp2);
		ans.add(emp3);
		ans.add(emp4);
		ans.add(emp5);
		System.out.println("Data Before Sorting:");
		for(Object obj:ans)
		{
			Employee e=(Employee)obj;
			System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSal());
		}
		System.out.println("After sorting:");
		Collections.sort(ans,c);
		for(Object obj:ans)
		{
			Employee e=(Employee)obj;
			System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSal());
		}
		System.out.println("Sort its by using the Slary:");
		c=new SortByUsingSal();
		Collections.sort(ans,c);
		
		System.out.println("After sorting:");
		
		for(Object obj:ans)
		{
			Employee e=(Employee)obj;
			System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSal());
		}
//		
//		c=(Comparator) new SortByUsingName();
//		Collections.sort(ans,c);
//		System.out.println("After sorting by using Name");
//		for(Object obj:ans)
//		{
//			Employee e=(Employee)obj;
//			System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSal());
//		}
	}

}
