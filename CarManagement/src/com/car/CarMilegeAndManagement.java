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
public class CarMilegeAndManagement {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("----*****************************---");
		System.out.println("Enter the no. of Cars:");
		Car c[]=new Car[sc.nextInt()];
		InputOperation obj=new InputOperation();
		obj.set(c);
		obj.getInput();
		obj.displayData();
	}
}
