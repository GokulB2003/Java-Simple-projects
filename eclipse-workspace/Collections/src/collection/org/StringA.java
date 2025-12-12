package collection.org;
import java.util.*;
public class StringA {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String input="abbbcccddee";
		String temp=" ";
		int count=0;
		int i=0;
		while(i<input.length()-1)
		{
			count=0;
		/*	while((i+1<input.length()) && input.charAt(i)==(input.charAt(i+1)))
			{
				count++;
				if(count==1)
				{
					temp+='#';
				}
				else if(count>1)
				{
					temp+=input.charAt(i);
				}
				i++;
				
			}
			if(count==0)
			{
				temp+=input.charAt(i);
			}*/
			
			//Accenture coding Question
			
			
			while((i+1<input.length()) && input.charAt(i)==input.charAt(i+1))
					{
						count++;
						i++;
					}
			if(count==0)
			{
				temp+=input.charAt(i);
			}
			else if(count>0)
			{
				temp+='#';
			}
			i++;
		}
		System.out.println(temp);
	}
}
