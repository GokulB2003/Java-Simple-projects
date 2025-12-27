package ComparatorExamples;
import java.util.Comparator;
class SortByUsingId implements Comparator {
	
	public int compare(Object a,Object b)
	{
		Employee first=(Employee)a;
		Employee second=(Employee)b;
		if(first.id>second.id)
		{
			return 1;
			
			
		}
		else if(first.id<second.id) {
			return -1;
		}
		else
		{
			return 0;
		}
	}
}
