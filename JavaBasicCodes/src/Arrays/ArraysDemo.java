package Arrays;

import java.util.Scanner;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.out.println(args.length);
ArraysDemo ad=new ArraysDemo();
//ad.learning_1();
//ad.learning_2();
//ad.learning_3();
//ad.learning_4();
//ad.learning_5();
//ad.learning_6();//first letter repeated or not
//ad.learning_7();//First repeated letter 
//ad.learning_8();
//ad.learning_9();
//ad.learning_10();
//ad.learning_11();
//ad.learning_12();//addition of two arrays
//ad.learning_13();//
//ad.learning_14();//concatenation of 2 arrays
//ad.learning_15();//Numbers present between adjacent elements
//ad.learning_16();//
ad.learning_17();//highest secondhighest lowest secondlowest in single loop  

	}

	private void learning_17() {
		// TODO Auto-generated method stub
		int[] mark= {94,75,70,96,100};
		int highest=Integer.MIN_VALUE;
		int secondhighest=Integer.MIN_VALUE;
		int lowest=Integer.MAX_VALUE;
		int secondlowest=Integer.MAX_VALUE;
		for(int i=0;i<mark.length;i++) {
			if(mark[i]>highest){
				secondhighest=highest;
				highest=mark[i];
			}
			else if(mark[i]<secondhighest){
				secondhighest=mark[i];
			}	
				if(mark[i]<lowest){
				secondlowest=lowest;
				lowest=mark[i];
			}
				else if(mark[i]<secondlowest) {
				secondlowest=mark[i];
			}
		}
	//	System.out.println("highest mark is:"+highest);
		System.out.println("secondhighest mark is:"+secondhighest);
		//System.out.println("lowest mark is:"+lowest);
		System.out.println("secondlowest mark is:"+secondlowest);
	}

	private void learning_16() {
		// TODO Auto-generated method stub
		int[]ar= {5,10,8,20};
		for(int i=0;i<ar.length-1;i++) {
			int small=ar[i]<ar[i+1]?ar[i]:ar[i+1];
			int big=ar[i]>ar[i+1]?ar[i]:ar[i+1];
			int no1=small;
			int no2=big;
			for(int val=small;val<=big;val++) {
				System.out.print(val+" ");
			}
			System.out.println();
		}
	}

	private void learning_15() {
		// TODO Auto-generated method stub
		int[]ar= {5,10,15,20};
		for(int i=0;i<ar.length-1;i++) {
			int no1=ar[i];
			int no2=ar[i+1];
			for(int val=no1;val<=no2;val++) {
				System.out.print(val+" ");
			}
			System.out.println();
		}
	}

	private void learning_14() {
		// TODO Auto-generated method stub
		int[]a= {5,10,15,20};
		int[]b= {15,10,5};
		int[]result=new int[a.length+b.length];
		int j=0;
		for(int i=0;i<result.length;i++) {
			if(i<a.length) {
				result[i]=a[i];
			}
			else {
				result[i]=b[j];
				j++;
			}
			System.out.println(result[i]);
		}
		
	}

	private void learning_13() {
		// TODO Auto-generated method stub
		int[]a= {5,10,15,20};
		int[]b= {15,10,5};
		int big=a.length>b.length?a.length:b.length;
		int []c=new int[big];
		int small=a.length<b.length?a.length:b.length;
		for(int i=0;i<a.length;i++) {
			if(i<small) {
			c[i]=a[i]+b[i];
			}
			else 
				c[i]=a[i];
			System.out.println(c[i]);
		}
	}

	private void learning_12() {
		// TODO Auto-generated method stub
		int[]a= {5,10,15};
		int[]b= {15,10,5};
		int []c=new int[a.length];
		for(int i=0;i<a.length;i++) {
			c[i]=a[i]+b[i];
			System.out.println(c[i]);
		}
	}

	private void learning_11() {
		// most count of letter and how many times
char []name= {'s','h','e','i','k','m','o','h','a','m','m','e','d'};
		int big=0;
		char c=' ';
		for(int i=0;i<name.length;i++) {
			
			char ch=name[i];
			int count=1;
			if(ch=='*') {
				continue;
			}
			for(int j=i+1;j<name.length;j++)
			{ 
			     if(ch==name[j]) {
			    	 name[i]='*';
				  count ++;
			}
			}
	if(count>big) {
		big=count;
		c=ch;
	}
			}
		System.out.println("Most count of letter is "+c);
		System.out.println("it apprars for "+big+" times ");
	}

	private void learning_10() {
		// frequency/count of each letters
char []name= {'s','h','e','i','k','m','o','h','a','m','m','e','d'};
		
		for(int i=0;i<name.length;i++) {
			
			char ch=name[i];
			int count=1;
			for(int j=0;j<name.length;j++)
			{ 
			   if(i!=j) {
			     if(ch==name[j]) {
				  count ++;
			   }
			}
			}
	
				System.out.println("count of "+ch+" is "+ count);
			}
		}
	private void learning_9() {
		
	//non repeated letters
		char []name= {'A','N','A','N','D'};
		
		for(int i=0;i<name.length;i++) {
			boolean repeated=false;
			char ch=name[i];
			for(int j=0;j<name.length;j++)
			{ 
			   if(i!=j) {
			     if(ch==name[j]) {
				  repeated=true;
				break;
			   }
			}
			}
			if(repeated==false) {
				System.out.println("First Non repeated char is:"+ch);
			break;//without break all non repeated letters print
			}
		}
		}
	

	private void learning_8() {
		// non repeated letter present or not
		boolean repeated=false;
		char []name= {'s','n','e','k','a'};
		for(int j=0;j<name.length-1;j++) {
		char ch=name[j];
		for(int i=j+1;i<name.length;i++) {
			if(ch==name[i]) {
				System.out.println("First Reapeted is"+ch);
				repeated=true;
				break;
			}
		}
		if(repeated==true)
			break;
		}
		if(repeated==false)
			System.out.println("Non repeated name present");
	}

	private void learning_7() {
		// First repeated letter 
		boolean repeated=false;
		char []name= {'P','R','A','K','A','S','S'};
		for(int j=0;j<name.length-1;j++) {
		char ch=name[j];
		for(int i=j+1;i<name.length;i++) {
			if(ch==name[i]) {
				System.out.println("First Reapeted is"+ch);
				repeated=true;
				break;
			}
		}
		if(repeated==true)
			break;
		}
	}

	private void learning_6() {
		// first letter repeated or not
		char []name= {'A','N','A','N','D','H'};
		char ch=name[0];
		for(int i=1;i<name.length;i++) {
		
			if(ch==name[i]) {
				System.out.println("First Reapeted is"+ch);
				break;
			}
		}
	}

	private void learning_5() {
		// TODO Auto-generated method stub
		int [] ar= {5,-10,-20,30,-40,50};
		int count=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]<0) {
				System.out.println("Negative numbers"+ar[i]);
				count++;
			}
			if(ar[i]<0&&ar[i]%20==0) {
				System.out.println("Negative Numbers%20 is"+ar[i]);
			}
			if(ar[i]<0&&i%2==0) {
				System.out.println("Negative Numbers in even position is"+ar[i]);
			}
			
		}
		System.out.println("Negative Numbers"+count);
	}

	private void learning_4() {
		// TODO Auto-generated method stub
		//System.out.println(Integer.MIN_VALUE);
		//System.out.println(Integer.MAX_VALUE);
		int[]scores= {45,93,190,56,68};
		int lowest=Integer.MAX_VALUE, secondlowest=Integer.MAX_VALUE;
		for(int i=0;i<scores.length;i++) {
			if(scores[i]<lowest) {
				secondlowest=lowest;
				lowest=scores[i];
			}
			else if(scores[i]<secondlowest) {
				secondlowest=scores[i];
			}
			
		}System.out.println("LOWEST"+lowest);
		System.out.println("SECONG LOWEST"+secondlowest);
	}

	private void learning_3() {
		// TODO Auto-generated method stub
		int []mark= {96,96,100,98,99};
		int count=0;
		for(int i=0;i<mark.length;i++) {
			if(mark[i]>96) {
				count++;}
		}
		System.out.println(count);
	}

	private void learning_2() {
		// TODO Auto-generated method stub
		int[] mark= {94,75,70,94,100};
		int high=0;
		int low=100;
		for(int i=0;i<mark.length;i++) {
			if(mark[i]>high) {
				high=mark[i];
			}
			if (mark[i]<low) {
				low=mark[i];
			}
		}
		System.out.println("highest score is:"+high);
		System.out.println("lowest score is:"+low);
	}

	private void learning_1() {
		// TODO Auto-generated method stub
		int []mark=new int[5];
		Scanner scan=new Scanner(System.in);
		int total=0;
		for(int i=0;i<mark.length;i++) {
			System.out.println(" enter mark:");
			mark[i]=scan.nextInt();
			//System.out.println(mark[i]);
			total+=mark[i];
		}
		System.out.println(total);
		System.out.println(total/mark.length);
		//mark[0] = 96; 
		//mark[1] = 96; 
		//mark[2] = 96; 
		//mark[3] = 96; 
		//mark[4] = 96; 
		
		//System.out.println(mark[0]);
		//System.out.println(mark[1]);

		//System.out.println(mark[2]);
		//System.out.println(mark[3]);

		//System.out.println(mark[4]);
		//for(int i=0;i<mark.length;i++) {
			//System.out.println(mark[i]);
		
}

	}


