package collection.org;
import java.util.*;

/*You are given a function.
int CheckPassword(char str[], int n);
The function accepts string str of size n as an argument. Implement the function which returns 1 if given string str is valid password else 0.
str is a valid password if it satisfies the below conditions.

– At least 4 characters
– At least one numeric digit
– At Least one Capital Letter
– Must not have space or slash (/)
– Starting character must not be a number*/

public class AccString {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		boolean ans=checkPass(str);
		if(ans)
		{
			System.out.println(1);
			
		}
		else
		{
			System.out.println(0);
			
		}
	}
	public static boolean checkPass(String str)
	{
		
		if(str.length()<4)
		{
			return false;
		}
		if(str.charAt(0)>='0' && str.charAt(0)<='9')
		{
			return false;
		}
		boolean flag=false;
		boolean caps=false;
		for(int i=1; i<str.length(); i++)
		{
			
			
			if(str.charAt(i)>'0' && str.charAt(i)<'9')
			{
				flag=true;
			}
			else if(str.charAt(i)==' ' || str.charAt(i)=='/') {
				return false;
			}
			else if((str.charAt(i)>='A') && (str.charAt(i)<='Z'))
			{
				caps=true;
				
			}
			
			
		}
		if(flag==true && caps==true)
			return true;
		else
		    return false;	
		
	}
}
