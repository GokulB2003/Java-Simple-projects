package org.library;
import java.util.*;
/*Q1. Create a class called Library to hold accession number,title of the book,author name,price of the book and write a menu driven program in java that implements the working of a library :
		The menu options should be: 
		1. Add Book Details.
		2. Display All Book Details.
		3. Display List of all book of given author.
		4. Display list the title of specified book.
		5. Display list count of the book in the library.
		6. Display list the books in the ascending order of accession number.
		7. Update book details by title of book.
		8. Delete book details by price.
		9. Display the price range between 100 to 500.
		10. Exit The Code.
*/
public class Libarary {
private String title;
private String author;
private int price;
private int accessionNum;
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getAccessionNum() {
	return accessionNum;
}
public void setAccessionNum(int accessionNum) {
	this.accessionNum = accessionNum;
}


}
