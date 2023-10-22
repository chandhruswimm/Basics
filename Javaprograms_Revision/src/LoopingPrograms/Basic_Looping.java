package LoopingPrograms;

public class Basic_Looping {
	public static void main(String[] args) {
		Basic_Looping bl=new Basic_Looping();
		//bl.sum_of_digits();
		//bl.Neon_Number();
		//bl.perfect_number();
		//bl.multiples_of_3and5();
		//bl.Reverse_the_number(); 
		//bl.spy_number();
		//bl.least_common_divisors();
		//bl.swapping();
		//bl.gcd();
		//bl.Factorial();
		//bl.Fibanacci_series();
		//bl.oddposition_evenposition();
		//bl.sum_until_singledigit(12345);
		//bl.printing_no();//1 11 121
		bl.five_printing();//print 5 between 1 to 100
		}

	private void five_printing() {
		for(int no=1;no<=100;no++) {
			if(no%5==0 && no%10!=0) {
				System.out.print(no+" ");
			}
			if(no/5==10 || no/5==11&&no!=55) {
				System.out.print(no+" ");
			}
		}
		
	}

	private void printing_no() {
		int no=1;
		while(no<=121) {
			System.out.print(no+" ");
			 no=no*11;
		}
		
	}

	private void sum_until_singledigit(int no) {
		int sum=0;
		while(no>0) {
			sum=sum+(no%10);
			no=no/10;
		}
		if(sum<10) {
			System.out.println(sum);
		}
		if(sum>9) {
			sum_until_singledigit(sum);
		}
	}

	private void oddposition_evenposition() {
		int no=1;
		for(no=1;no<=5;no++) {
			if(no%2==0) {
				System.out.println(no);
			}
			else {
				System.out.println(no*-1);
			}
		}
		
	}

	private void Fibanacci_series() {
		int first=0,second=1;
		while(first<=13) {
			System.out.print(first+" ");
//			int third=first+second;
//			first=second;
//			second=third;
			second=second+first;
			first=second-first;
		}
		
	}

	private void Factorial() {
		int no=5;
		int fact=1;
		while(no>0) {
			fact=fact*no;
			no--;
		}
		System.out.println(fact);
	}

	private void gcd() {
		int no1=100,no2=60;
		int gcd=0;
		int small=no1<no2?no1:no2;
		for(int div=2;div<=small;div++) {
			if(no1%div==0 && no2%div==0) {
				gcd=div;
			}
		}
		System.out.println("GCD IS:"+gcd);
	}

	private void swapping() {
		// TODO Auto-generated method stub
		int no1=10,no2=20;
		no2=no2+no1;
		no1=no2-no1;
		no2=no2-no1;
		System.out.println(no1);
		System.out.println(no2);
		
	}

	private void least_common_divisors() {
		// TODO Auto-generated method stub
		int no1=10;
		int no2=30;
		//int count=0;
		int big=no1>no2?no1:no2;
		while(true) {
			if(big%no1==0 && big%no2==0)
				//if(count<3)
			{
				System.out.println(big);
				break;
				//count++;
			}
			big++;
		}
	}

	private void spy_number() {
		int no=1124;
		int add=0,mul=1;
		while(no>0) {
			int rem=no%10;
			add+=rem;
			mul=mul*rem;
			no=no/10;
		}
		if(add==mul) {
			System.out.println("Spy Number");
		}
		else {
			System.out.println("Not a Spy Number");
		}
	}

	private void Reverse_the_number() {
		int no=12345;
		int result=0;
		while(no>0) {
			int rem=no%10;
			result=(result*10)+rem;
			no=no/10;
		}
		System.out.println(result);
	}

	private void multiples_of_3and5() {
		int no=1;
		while(no<=100) {
			if(no%3==0&&no%5==0) {
				System.out.print(no+" ");
				
			}
			no++;
		}
		
	}

	private void perfect_number() {
		int no=496;
		int div=1;
		int perfect=0;
		while(div<=no/2) {
			if(no%div==0) {
				perfect=perfect+div;//1//3//6
				
			}
			//System.out.println(perfect);
			div++;//2//3//4
		}
		if(no==perfect) {
			System.out.println("Perfect Number");
		}
		else {
			System.out.println("Not a Perfect Number");
		}
	}

	private void Neon_Number() {
		int no=6;
		int squre=no*no;
		int sum=0;
		while(squre>0) {
			int rem=squre%10;
			sum=sum+rem;
			squre=squre/10;
		}
		if(sum==no) {
			System.out.println("neon number");
		}
		else {
			System.out.println("not neon number");
		}
	}

	private void sum_of_digits() {
		int no=1234;
		int sum=0;
		for(no=1234;no>0;no=no/10) {
			int rem=no%10;
			sum=sum+rem;
		}
		System.out.println(sum);
	}
}
