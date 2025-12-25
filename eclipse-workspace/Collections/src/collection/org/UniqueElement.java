package collection.org;
import java.util.*;
import java.util.List;
public class UniqueElement {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	/*5. Sum
	Description:
	Find all unique triplets (a,b,c) such that a+b+c = 0 using sorting and ArrayList.
	Example:
	Input: [-1,0,1,2,-1,-4]
	Output: [[-1,-1,2], [-1,0,1]]
	*/
		int arr[]= {-1,0,1,2,-1,-4};
		findUnique(arr);
		//Arrays.sort(arr);
	}
	public static int[][] findUnique(int arr[])
	{
		Arrays.sort(arr);
		List<List<Integer>>ans=new ArrayList<>();
		int left=0;
		int right=arr.length-1;
		while(left<right)
		{
			int sum=arr[left]+arr[left+1]+arr[right];
			if(sum==0)
			{
					ans.add(arr[left],arr[left+1],arr[right]);
			}
			left++;
			right--;
		}
		return ans;
		
	}
}
