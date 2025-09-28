package com.car;
import java.util.*;
/*Q3. Problem:
Create a POJO class Car with fields: carId, model, fuelConsumed, and distanceTravelled. Store details of 5 cars using an array of objects. Perform the following operations:
Calculate the mileage of each car (mileage = distanceTravelled / fuelConsumed).
Find the car with the best mileage.
Display cars whose mileage is above the average mileage of all cars.
Why?
 Here you apply formula-based computation + comparison + filtering, just like the employee salary example, but with a different real-world scenario.
*/

public class InputOperation {
Scanner sc=new Scanner(System.in);
	Car c[];
	public void set(Car c[])
	{
		this.c=c;
	}
	public void getInput()
	{
		for(int i=0; i<c.length; i++)
		{
			System.out.println("Enter the CarId:");
			int cardId=sc.nextInt();
			System.out.println("Enter the model of Car:");
			sc.nextLine();
			String m=sc.nextLine();
			System.out.println("Enter the how much fuel consumed by the car");
			int f=sc.nextInt();
			System.out.println("Enter how much distance travelled by car");
			int d=sc.nextInt();
			c[i]=new Car();
			c[i].setCardId(cardId);
			c[i].setModel(m);
			c[i].setDistanceTravelled(d);
			c[i].setFuelConsumed(f);
			
		}
	}
	public void displayData()
	{
		System.out.println("-----------Mileage of each car---------------");
		for(int i=0; i<c.length; i++)
		{
			
			System.out.println("cardId:"+c[i].getCardId()+"\t"+"Model:"+c[i].getModel()+"\t"+"mileage:"+c[i].getMilege()+"km/l\n");
		}
		findBestMilege();
		avgMilge();
		
	}
	/*public void calMileage()
	{
		for(int i=0; i<c.length; i++)
		{
			float m=(float)c[i].getDistanceTravelled()/(float)c[i].getFuelConsumed();
			c[i].setMilege(m);
		}
	}*/
	public void findBestMilege()
	{
		System.out.println("-------------Best Milege-----------------");
		int maxi=0;
		for(int i=1; i<c.length; i++)
		{
			if(c[i].getMilege()>c[maxi].getMilege())
			{
				maxi=i;
			}
			
		}
		System.out.println("Car("+c[maxi].getModel()+") with the best mileage ("+c[maxi].getMilege()+")\n");
	}
	public void avgMilge()
	{
		int sum=0;
		for(int i=0; i<c.length; i++)
		{
			sum+=c[i].getMilege();
			
		}
		float Avg=0;
		Avg=sum/c.length;
		System.out.println("Average mileage of all cars:"+Avg+"km/l\n");
		for(int i=0; i<c.length; i++)
		{
			if(c[i].getMilege()>Avg)
			{
				System.out.println("Cars with mileage above average("+Avg+"):"+c[i].getModel());
			}
		}
	}
}
