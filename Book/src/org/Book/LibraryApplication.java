package org.Book;

public class LibraryApplication {
	public static void main(String args[])
	{
		Library L=new Library();
		Book obj=new Book();
		obj.setId(1);
		
		obj.setName("C++");
		obj.setAuthor("E BalguruSwami");
		
		Book obj2=new Book();
		obj2.setId(2);
		obj2.setName("java");
		obj2.setAuthor("James g");
		
//		Book obj3=new Book();
//		obj3.setId(3);
//		obj3.setName("C");
//		obj3.setAuthor("Denis Richi");
		
		
		L.addnewBooks(obj,obj2);
		L.show();
		
	}
}
