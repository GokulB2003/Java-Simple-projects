package ply.Player;
/* Create a POJO class Player with fields: playerId, name, runs, and matches. Store details of 5 players using an array of objects. Perform the following operations:
Calculate the average runs per match for each player.
Find and display the player with the highest batting average.
Print the details of players whose batting average is above the team average.
Why?
 This teaches ratio calculations, finding max averages, and filtering players — same aggregation + comparison style.
*/
import java.util.*;
public class PlayerManagement {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Plyers:");
		Player p[]=new Player[sc.nextInt()];
		InputOutput obj=new InputOutput();
		obj.set(p);
		obj.display();
		
	}
}
