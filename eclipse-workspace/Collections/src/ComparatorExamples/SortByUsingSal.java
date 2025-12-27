package ComparatorExamples;
import java.util.Comparator;
public class SortByUsingSal implements Comparator{
	public int compare(Object a,Object b)
	{
		Employee first=(Employee)a;
		Employee second=(Employee)b;
		if(first.sal>second.sal)
		{
			return 1;
			
		}
		else if(first.sal<second.sal)
		{
			return -1;
			
		}
		else
		{
			return 0;
		}
	}
}
