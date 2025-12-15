package collection.org;

import java.util.*;

public class FindCount {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int arr[]=new int[size];
	for(int i=0; i<arr.length; i++)
	{
		arr[i]=sc.nextInt();
	}
	int result=findC(arr);
	System.out.println(result);	
}
public static int findC(int arr[])
{
	Arrays.sort(arr);
	if(arr.length==0)
	{
		return 0;
	}
	if(arr.length<4)
	{
		return 0;
	}
	int odd=0;
	int Even=0;
	int evencount=0,oddcount=0;
	for(int i=arr.length-1; i>arr.length-4; i--)
	{
		if(i%2==0)
		{
			Even=i;
			evencount++;
		}
		else
		{
			odd=i;
			oddcount++;
		}
	}
	return Even+odd;
}

}
