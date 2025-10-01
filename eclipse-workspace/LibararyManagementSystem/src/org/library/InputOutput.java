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
public class InputOutput {
	Scanner sc=new Scanner(System.in);
	Libarary L[];
	public void set(Libarary l[])
	{
		this.L=l;
		display();
	}
	public void display()
	{
		System.out.println("------------Menu Driven program-------------");
		System.out.println("Select the proper choice:");
		int choice,index=0;
		do
		{
			System.out.println("1. Add Book Details.");
			System.out.println("2. Display All Book Details.");
			System.out.println("3. Display List of all book of given author.");
			System.out.println("4. Display list the title of specified book.");
			System.out.println("5. Display list count of the book in the library.");
			System.out.println("6. Display list the books in the ascending order of accession number.");
			System.out.println("7. Update book details by title of book");
			System.out.println("8. Delete book details by price.");
			System.out.println("9. Display the price range between 100 to 500.");
			System.out.println("10. Exit The Code.");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					if(index<L.length)
					{
						System.out.println("-------------------Add Book Details-----------------------");
						System.out.println("Enter the book accession number:");
						int accno=sc.nextInt();
						System.out.println("Enter the title of the Book:");
						sc.nextLine();
						String title=sc.nextLine();
						System.out.println("Enter the Author of the book:");
						String author=sc.nextLine();
						System.out.println("Enter the price of the book:");
						int p=sc.nextInt();
						L[index]=new Libarary();
						L[index].setAccessionNum(accno);
						L[index].setAuthor(author);
						L[index].setPrice(p);
						L[index].setTitle(title);
						index++;
					}
					else
					{
						System.out.println("-------------------List is full--------------------------");
						
					}
					break;
				case 2:
					System.out.println("-----------All Book Details------------");
					System.out.print("Accession number:\t"+"title:\t\t"+"Author\t\t"+"Price\t\t\n");
					for(int i=0; i<index; i++)
					{
						
						System.out.print(L[i].getAccessionNum()+"\t\t"+L[i].getTitle()+"\t\t"+L[i].getAuthor()+"\t\t"+L[i].getPrice()+"\n");
						
					}
					break;
				case 3:
					System.out.println("----------------------******---------------------------------");
					System.out.println("Enter the Author Name:");
					sc.nextLine();
					String author=sc.nextLine();
					System.out.print("Accession number:\t\t"+"title:\n");
					for(int i=0; i<index; i++)
					{
						String s=L[i].getAuthor();
						if(s.equals(author))
						{
							
							System.out.print(L[i].getAccessionNum()+"\t\t"+L[i].getTitle());
							
						}
					}
					break;
				case 4:
					System.out.println("----------------------******---------------------------------");
					System.out.println("Enter the Book Title:");
					sc.nextLine();
					String t=sc.nextLine();
					System.out.print("Accession number:\t\t"+"title:\t\t"+"Author\t\t"+"Price\t\t\n");
					for(int i=0; i<index; i++)
					{
						String title=L[i].getTitle();
						if(title.equals(t))
						{
							
							System.out.println(L[i].getAccessionNum()+"\t\t"+L[i].getTitle()+"\t\t\t"+L[i].getAuthor()+"\t\t\t"+L[i].getPrice()+"\n");
						}
					}
					break;
				case 5:
					System.out.println("----------------------******---------------------------------");
					System.out.println("\r\n"+ "Total number of books in library:"+index);
					break;
				case 6:
					System.out.println("----------------------******---------------------------------");
					//Arrays.sort(L);
					System.out.println("Books in Ascending Order of Accession Number:");
					System.out.print("Accession number:\t\t"+"title:\t\t"+"Author\t\t"+"Price\t\t\n");
					
					for(int i=0; i<index-1; i++)
					{
						for(int j=i+1; j<index; j++)
						{
							if(L[i].getAccessionNum()>L[j].getAccessionNum())
							{
								Libarary temp=L[i];
								L[i]=L[j];
								L[j]=temp;
								
							}
						}
						
					}
					for(int i=0; i<index; i++)
					{

						
						System.out.println(L[i].getAccessionNum()+"\t\t"+L[i].getTitle()+"\t\t"+L[i].getAuthor()+"\t\t"+L[i].getPrice()+"\n");
					}
					break;
				case 7:
					System.out.println("---------------Update Book Details---------------------------");
					System.out.println("Enter the name of the Book Title to update");
					sc.nextLine();
					String newN=sc.nextLine();
					for(int i=0; i<index; i++)
					{
						String b=L[i].getTitle();
						if(b.equals(newN))
						{
							System.out.println("Enter new book accession number of:"+L[i].getAccessionNum());
							int accno=sc.nextInt();
							System.out.println("Enter new title of the Book of:"+L[i].getTitle());
							sc.nextLine();
							String title=sc.nextLine();
							System.out.println("Enter the Author of the book:"+L[i].getAuthor());
							String auth=sc.nextLine();
							System.out.println("Enter the price of the book:"+L[i].getPrice());
							int p=sc.nextInt();
							//L[i]=new Libarary();
							L[i].setAccessionNum(accno);
							L[i].setAuthor(auth);
							L[i].setPrice(p);
							L[i].setTitle(title);
						}
					}
					System.out.println("Book details updated successfully!");
					break;
				case 8:
					System.out.println("----------------------******---------------------------------");
					System.out.println("Enter the Price to delete:");
					int p=sc.nextInt();
					for(int i=0; i<index; i++)
					{
						
						if(L[i].getPrice()==p)
						{
							int q=i;
							while(q<index-1)
							{
								L[q]=L[q+1];
								q++;
							}
							L[index-1]=null;
							index--;
							break;
						}
					}
					System.out.println("Book with price ("+p+") deleted Successfully:");
					break;
				case 9:
					System.out.println("----------------------******---------------------------------");
					System.out.println("*********Price range between the 100 to 500******************");
					System.out.print("Accession number:\t\t"+"title:\t\t"+"Author\t\t"+"Price\t\t\n");
					for(int i=0; i<index; i++)
					{
						if(L[i].getPrice()>=100 && L[i].getPrice()<=500)
						{
							
							System.out.println(L[i].getAccessionNum()+"\t\t"+L[i].getTitle()+"\t\t"+L[i].getAuthor()+"\t\t"+L[i].getPrice()+"\n");
						}
					}
					break;
				case 10:
					System.out.println("------------------------EXIT---------------------------------");
					break;
				default:
					System.out.println("Enter the valid choice");
					continue;		
					
			}
		}while(choice!=10);
	}
}
