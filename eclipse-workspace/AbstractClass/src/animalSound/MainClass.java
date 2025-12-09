package animalSound;
import java.util.*;
public class MainClass {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	Animal a[]=new Animal[5];
	int choice;
	int i=0;
	int petcoun=0,Lioncount=0,snakecount=0;
	do
	{
		System.out.println("select the choice of Animal:");
		System.out.println("1.Dog 2.Lion 3.Snake");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			a[i]=new Dog();
			a[i].sound();
			String ca=a[i].category();
			System.out.println("category of the Animal Is:"+ca);
			petcoun++;
			break;
		case 2:
			a[i]=new Lion();
			a[i].sound();
			String newc=a[i].category();
			System.out.println("Animal category:\t"+newc);
			Lioncount++;
			break;
		case 3:
			a[i]=new Snake();
			a[i].sound();
			String newAc=a[i].category();
			System.out.println("Animal category:\t"+newAc);
			snakecount++;
			break;
		default:
			System.out.println("Invalid choice:");
			continue;
			
		}
		i++;
	
	}while(i<a.length);
	System.out.println("Total no. of count ofAnimal pet is:\t"+petcoun);
	System.out.println("Total no.of count of Wild Animal is:\t"+Lioncount);
	System.out.println("Total no.of count of snake is\t"+snakecount);
	
}
}
