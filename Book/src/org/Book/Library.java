package org.Book;

public class Library {
	private Book book[];
	public void addnewBooks(Book ...b)
	{
		book=b;
	}
	public void show()
	{
		for(int i=0; i<book.length; i++)
		{
			System.out.println(book[i].getId()+"\t"+book[i].getName()+"\t"+book[i].getAuthor());
			
		}
		
	}
}
