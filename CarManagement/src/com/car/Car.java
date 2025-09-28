package com.car;
/*Q3. Problem:
Create a POJO class Car with fields: carId, model, fuelConsumed, and distanceTravelled. Store details of 5 cars using an array of objects. Perform the following operations:
Calculate the mileage of each car (mileage = distanceTravelled / fuelConsumed).
Find the car with the best mileage.
Display cars whose mileage is above the average mileage of all cars.
Why?
 Here you apply formula-based computation + comparison + filtering, just like the employee salary example, but with a different real-world scenario.
*/
public class Car {
private int cardId;
private String model;
private int fuelConsumed;
private int distanceTravelled;
private float milege;
public int getCardId() {
	return cardId;
}
public void setCardId(int cardId) {
	this.cardId = cardId;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public int getFuelConsumed() {
	return fuelConsumed;
}
public void setFuelConsumed(int fuelConsumed) {
	this.fuelConsumed = fuelConsumed;
}
public int getDistanceTravelled() {
	return distanceTravelled;
}
public void setDistanceTravelled(int distanceTravelled) {
	this.distanceTravelled = distanceTravelled;
}
public void setMilege(float m)
{
	milege=m;
}
public float getMilege()
{
	milege=distanceTravelled/fuelConsumed;
	return milege;
}

}
