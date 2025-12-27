package ComparatorExamples;
import java.util.Comparator;
public class SortByUsingName {

	public int compare(Object one,Object two)
	{
		Employee first=(Employee)one;
		Employee second= (Employee)two;
		return first.getName().compareTo(second.getName());
		
		
	}
	
}
