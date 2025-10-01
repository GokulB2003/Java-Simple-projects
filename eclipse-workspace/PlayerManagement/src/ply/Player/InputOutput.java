package ply.Player;
import java.util.*;
/* Create a POJO class Player with fields: playerId, name, runs, and matches. Store details of 5 players using an array of objects. Perform the following operations:
Calculate the average runs per match for each player.
Find and display the player with the highest batting average.
Print the details of players whose batting average is above the team average.
Why?
 This teaches ratio calculations, finding max averages, and filtering players — same aggregation + comparison style.
*/
public class InputOutput {
	Player p[];
	public void set(Player[] p)
	{
		this.p=p;
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<p.length; i++)
		{
			System.out.println("Enter the playerId:");
			int id=sc.nextInt();
			System.out.println("Enter the player name");
			sc.nextLine();
			String name=sc.nextLine();
			System.out.println("Enter the no of runs:");
			int r=sc.nextInt();
			System.out.println("Enter the no. of matches");
			int m=sc.nextInt();
			p[i]=new Player();
			p[i].setPlayerId(id);
			p[i].setName(name);
			p[i].setRuns(r);
			p[i].setMatches(m);
		
		}
		
	}
	public void display()
	{
		calAvgR();
		System.out.println("Average Runs per Player:\n");
		for(int i=0; i<p.length; i++)
		{
			System.out.println(p[i].getName()+"-->"+p[i].getAvgRun()+"\n");
		}
		
		Topperplayer();
		battingAvg();
	}
	public void calAvgR()
	{
		float ag=0.0f;
		for(int i=0; i<p.length; i++)
		{
			ag=(float)p[i].getRuns()/(float)p[i].getMatches();
			p[i].setAvgRun(ag);
		}
	}
	
	public void Topperplayer()
	{
		int maxi=0;
		for(int i=1; i<p.length; i++)
		{
			if(p[i].getAvgRun()>p[maxi].getAvgRun())
			{
				maxi=i;
			}
		}
		System.out.println("Player("+p[maxi].getName()+") with Highest Average:"+p[maxi].getAvgRun());
	}
	public int totalrun()
	{
		int sum=0;
		for(int i=0; i<p.length; i++)
		{
			sum+=p[i].getRuns();
			
		}
		return sum;
	}
	public void battingAvg()
	{
		System.out.println(".........................................................................");
		System.out.println("---details of players whose batting average is above the team average---");
		
			float avg=0.0f;
			int sum=0;
			for(int i=0; i<p.length; i++)
			{
				sum+=p[i].getAvgRun();
			
			}
			avg=sum/p.length;
			System.out.println("Team Average:\t"+avg);
			System.out.println("players above Team Average:");
			for(int i=0; i<p.length; i++)
			{
				
				if(p[i].getRuns()>avg)
				{
					System.out.println(p[i].getName()+"\t");
				}
			}
			
		
	}
	
}
