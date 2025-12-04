package org.Bill;
/*Product: this is the pojo class for store product info and product contain id,name,qty,rate,company name 
Customer: this class can store data of customer which contain id , name , email, contact ,address
Shop : contain following methods 
void addProducts(Product …p): this function can accept product info at least 5 
Product [] getProducts(): this function can return product class array 
void calBill(Customer cust,Product …p): this function accept customer and product info and calculate its bill and show bill using a following format
*/
 class Shop {
	 Product p[];
	 void addProducts(Product ...p)
	 {
		 this.p=p;
	 }
	 void calBill(Customer c,Product ...p)
	 {
		 int total=0;
		 System.out.print("Customer Name:"+c.getName()+"\n"+"Customer Address:"+c.getAdd()+"\n"+"Customer Email:"+c.getEmail()+"\n");
		 System.out.println("Product Name\t\t\t"+"Qty\t\t"+"Rate\t\t"+"total\t\t"+"\n");
		 for(int i=0; i<p.length; i++)
		 {
			 
			 total=p[i].getQty()*p[i].getRate();
			 System.out.println(p[i].getName()+"\t\t\t\t"+p[i].getQty()+"\t\t"+p[i].getRate()+"\t\t"+total);
		 }
		 
	 }
	 
}
