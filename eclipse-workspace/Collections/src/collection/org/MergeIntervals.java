package collection.org;
import java.util.*;
/*2. Merge Intervals
Description:
Given a list of intervals, merge all overlapping intervals and return the merged list sorted by starting time.
Example:
Input: [[1,3],[2,6],[8,10]]
Output: [[1,6],[8,10]]
//intervals = [[1,3],[2,6],[8,10],[15,18]]
*/
public class MergeIntervals {

	Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{
		ArrayList<ArrayList<Integer>>arr=new ArrayList<>();
		ArrayList row1=new ArrayList();
		row1.add(1);
		row1.add(3);
		
		ArrayList row2=new ArrayList();
		row2.add(2);
		row2.add(6);
		
		ArrayList row3 =new ArrayList();
		row3.add(8);
		row3.add(10);
		
		ArrayList row4=new ArrayList();
		row4.add(15);
		row4.add(18);
		
		arr.add(row1);
		arr.add(row2);
		
		arr.add(row3);
		arr.add(row4);
		
		for(int i=0; i<arr.size(); i++)
		{
			for(int j=0; j<arr.get(i).size(); j++)
			{
				System.out.print(arr.get(i).get(j)+" ");
			
				
				
			}
			System.out.println();
		}
		
		
		
	}
	
}
