package org.Bill;
/*Product: this is the pojo class for store product info and product contain id,name,qty,rate,company name 
Customer: this class can store data of customer which contain id , name , email, contact ,address
Shop : contain following methods 
void addProducts(Product …p): this function can accept product info at least 5 
Product [] getProducts(): this function can return product class array 
void calBill(Customer cust,Product …p): this function accept customer and product info and calculate its bill and show bill using a following format
*/
public class Customer {
	private int id;
	private String name;
	private String email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getSontact() {
		return sontact;
	}
	public void setSontact(int sontact) {
		this.sontact = sontact;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	private int sontact;
	private String add;
	
	
}
