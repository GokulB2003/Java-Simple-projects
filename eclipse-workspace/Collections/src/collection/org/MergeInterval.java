package collection.org;
import java.util.*;
import java.util.List;
public class MergeInterval {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		//int intervals[][] = {[1,3],[2,6],[8,10],[15,18]};
		merge(new int[][]{{1,3},{2,6},{8,10},{15,18}});
		
				
		
	}
	public static int[][] merge(int[][] intervals)
	{
		if(intervals.length<1)
		{
				
			
		}
		List<int []>l1=new ArrayList<>();
		Arrays.sort(intervals,Comparator.comparingInt(i->i[0]));
		
		
		
	}
}
