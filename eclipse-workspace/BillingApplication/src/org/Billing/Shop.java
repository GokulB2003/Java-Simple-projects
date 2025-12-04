/*Example: WAP to create Billing Application using a array object and variable argument concept 
We have following classes 
Product: this is the pojo class for store product info and product contain id,name,qty,rate,company name 
Customer: this class can store data of customer which contain id , name , email, contact ,address
Shop : contain following methods 
void addProducts(Product …p): this function can accept product info at least 5 
Product [] getProducts(): this function can return product class array 
void calBill(Customer cust,Product …p): this function accept customer and product info and calculate its bill and show bill using a following format
*/
package org.Billing;
import java.util.*;
public class Shop {
	private Product products[];
	public void addProducts(Product ...p)
	{
		this.products=p;
	}
	public Product[] getProducts()
	{
		return products;
		
	}
	public void calBill(Customer cust,Product ...p)
	{
		
		
	}
	
	
}
