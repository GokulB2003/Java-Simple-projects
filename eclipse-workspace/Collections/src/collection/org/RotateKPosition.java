package collection.org;
/*Given an ArrayList and a value k, rotate the list to the right by k positions:
 Example: [1,2,3,4,5], k=2 → [3,4,5,1,2]
What you practice:
Modular arithmetic
Using temporary lists
Index manipulation
*/
import java.util.*;
public class RotateKPosition {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int k=2;
		ArrayList arr=new ArrayList();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		
		rotateArr(arr,0,arr.size()-1);
		rotateArr(arr,0,k);
		rotateArr(arr,k,arr.size()-1);
		printArr(arr);
			
	}
	
	public static void rotateArr(ArrayList arr,int s,int e)
	{
		while(s<e)
		{
			Object temp=s;
			arr.set(s, arr.get(e));
			arr.set(e, temp);
			
			s++;
			e--;
		}
		
	}
	public static void printArr(ArrayList arr)
	{
		for(int i=0; i<arr.size(); i++)
		{
			System.out.println(arr.get(i));
		}
	}
}
