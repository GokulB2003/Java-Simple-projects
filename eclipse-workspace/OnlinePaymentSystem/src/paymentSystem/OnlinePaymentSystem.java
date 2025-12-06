package paymentSystem;
import java.util.*;
public class OnlinePaymentSystem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		Payment p[]=new Payment[5];
		DisplayData d=new DisplayData();
		int i=0,UPICount=0,CreditCount=0,DebitCount=0;
		int choice;
		do
		{
			System.out.println("*********************************");
			System.out.println("**********************************");
			System.out.println("Enter the amount of Money");
			int amnt=sc.nextInt();
			System.out.println("select the choice");
			System.out.println("1.UPI");
			System.out.println("2.CreditCard");
			System.out.println("3.DebitCard");
			System.out.println("ExIT");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				p[i]=new UPI();
				p[i].processPayment(amnt);
				UPICount++;
				break;
			case 2:
				p[i]=new CreditCard();
				p[i].processPayment(amnt);
				CreditCount++;
				break;
			case 3:
				p[i]=new DebitCard();
				p[i].processPayment(amnt);
				DebitCount++;
				break;
			default:
				System.out.println("Enter the valid choice:");
				continue;
				
			}
			d.setData(p[i]);
			d.display();
			
			i++;
			
		}while(i<p.length);
		
		System.out.println("Total UPI count is:\t\t"+UPICount);
		System.out.println("total CreditCard count is:\t"+CreditCount);
		System.out.println("Total DebitCard count:\t"+DebitCount);
	}

}
