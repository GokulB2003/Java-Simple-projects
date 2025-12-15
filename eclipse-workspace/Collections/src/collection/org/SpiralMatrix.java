package collection.org;
import java.util.*;

public class SpiralMatrix {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
		System.out.println("Enter the no. of rows: In matrix:");
		int rows=sc.nextInt();
		System.out.println("Enter the no.of columns:");
		int col=sc.nextInt();
		for(int i=0; i<rows; i++)
		{
			ArrayList<Integer>row=new ArrayList<>();
			for(int j=0; j<col; j++)
			{
				row.add(sc.nextInt());
			}
			ans.add(row);
		}
		
		for(ArrayList<Integer>r:ans)
		{
	System.out.println(r);
		}
		
	}

}
