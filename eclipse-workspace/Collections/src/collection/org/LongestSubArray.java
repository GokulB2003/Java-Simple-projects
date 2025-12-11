package collection.org;
import java.util.*;
/*______________________________________________________
1. Longest Subarray With Sum ≤ K
Description:
Given an integer list nums and integer k, return the maximum length of a contiguous subarray whose sum is ≤ k.
Example:
Input: nums=[2,3,1,2,4], k=7
Output: 3
Explanation: [3,1,2] has sum 6 ≤ 7.
*/
public class LongestSubArray {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		ArrayList arr=new ArrayList();
		arr.add(2);
		arr.add(3);
		arr.add(1);
		arr.add(2);
		arr.add(4);
		arr.add(5);
		int k=7;
		int i=0,j=0,sum=0,length=0,max=Integer.MIN_VALUE;
		while(j<arr.size())
		{
			sum+=(int)arr.get(j);
			if(sum<=k)
			{
				length=j-i+1;
				if(length>max)
				{
					max=length;
				}
				
			}
			while(sum>k)
			{
				sum=sum-(int)arr.get(i);
				i++;
			}
			j++;
			
			
		}
		
		System.out.println("the maximum window length is:"+max);
		
	}
}
