package switchcase;
import java.util.Scanner;
 class amazonpay{
	
		public void pay()
		{
			System.out.println("payment done via cash ");
		}
		public void pay(String upi)
		{
			System.out.println("payment done via upi ");
		}
		public void pay(long cardno,int cvv)
		{
			System.out.println("payment done via card ");
		}
		public void pay(String username,String password)
		{
			System.out.println("payment done via internet banking ");
		}
	}
 public class mainamazonpay
	{
		public static void main(String[] args)
		{
			Scanner scn=new Scanner(System.in);
			amazonpay p=new amazonpay();
			System.out.println("1.pay in cash\n2.pay in upi\n3.pay in card\n4.pay in internet banking");
			System.out.println("please enter the choice");
			int choice=scn.nextInt();
			switch(choice)
			{
			case 1:System.out.println("payment recived in cod");
			break;
			case 2:System.out.println("enter your upi pin");
			String pay=scn.next();
			p.pay("upi");
			break;
			case 3:System.out.println("enter your card number");
			long pay1=scn.nextLong();
			System.out.println("enter the cvv");
			int pay2=scn.nextInt();
			p.pay("cardno,cvv");
			break;
			case 4:System.out.println("enter the username");
			String pay3=scn.next();
			System.out.println("enter the password");
			String pay4=scn.next();
			p.pay("username,password");
			break;
			default:System.out.println("invalid choice");	
			}
}
		}
