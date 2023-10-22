package String;

public class Stringdemo {

	public static void main(String[] args) {
		Stringdemo sd=new Stringdemo();
		//sd.learning_1();
		//sd.learning_2();
		//sd.touppercase();
	    //sd.tolowercase();
	    //sd.toupperFML();
	    //sd.learning_6();
	    //sd.learning_7();//stripleading()
	    //sd.learning_8();//striptrailing
	    //sd.learning_9();//trim
		//sd.learning_10();//contains
		//sd.learning_11();//remove unwanted space
		//sd.learning_12();//assigning un order array to order array(assending)
		//sd.learning_13();//
		//sd.learning_14();
		int result=sd.fact(4);
		System.out.println(result);
	}
	
	private int fact(int no) {
		if(no==1)
		return no;
		else
			return no*fact(no-1);
	}


	private void learning_14() {
		// TODO Auto-generated method stub
		String s="A5";
		char letter=s.charAt(0);
		char num=s.charAt(1);
		for(char i='1';i<=num;i++) {
			System.out.println(letter);
		}
	}

	private void learning_13() {
		// TODO Auto-generated method stub
		int no=5;
		String total="";
		while(no>=1) {
			int rem=no%2;
			total=total+rem;
			no=no/2;
		}
		System.out.println(total);
	}

	private void learning_12() {
		int no[]= {18,10,3,19,7,22,14,23};
		for(int i=0,j=0;i<no.length;i++) {
			if(no[i]<=15) {
				int temp=no[i];
				no[i]=no[j];
				no[j]=temp;
				j++;
			}
		}
			for(int i=0;i<no.length;i++) {
				System.out.print(no[i]+" ");
			}
		}

	private void learning_11() {
				String s="how      are        you";
				for(int i=0;i<s.length();i++) {
					if(s.charAt(i)!=' ')
						System.out.print(s.charAt(i));
					else {
						System.out.print(s.charAt(i));
						for(int j=i;j<s.length();j++) {
							if(s.charAt(j)==' ') {
								continue;
							}
							else {
								i=j-1;
								break;
							}
						}
					}
				}
	}

	private void learning_10() {
		// TODO Auto-generated method stub
		String s1="today is thursday";
		String s2="tay";
		for(int i=0;i<s1.length();i++) {
			if(s2.charAt(0)==s1.charAt(i)) {
				int count=0;
				for(int j=0;j<s2.length();j++) {
					if(s2.charAt(j)==s1.charAt(i)) {
						count++;
						i++;
					}
				}
				System.out.println(count);
				if(count==s2.length()) {
					System.out.println("yes contains");
					break;
				}
				else {
					System.out.println("not contains");
					break;
				}
			}
			
		}
			
	}

	private void learning_9() {
		String s="  how are you     ";
		boolean first=false, last=false;
		int start=0,end=s.length()-1;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' '&&first==false) {
				continue;
			}
			else if(first==false){
				first=true;
				start=i;
			}
			if(s.charAt(end)==' '&&last==false) {
				end--;
			}
			else {
				last=true;
			}
			if(first==true&&last==true) {
				for(int j=start;j<=end;j++) {
					System.out.print(s.charAt(j));
				}
				break;
			}
		}
		
	}

	private void learning_8() {
		String s="how are you   ";
		int last=0;
		for(int i=s.length()-1;i>=0;i--) {
			if(s.charAt(i)!=' ') {
				last=i;
				break;
			}
		}
		for(int i=0;i<=last;i++) {
			System.out.print(s.charAt(i));
	}
	}


	private void learning_7() {
		// TODO Auto-generated method stub
		String s="   how are you";
		boolean first=false;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' '&&first==false) {
				continue;
			}
			else {
				first=true;
				System.out.print(s.charAt(i));
		}
	}
	}
	private void learning_6() {
		String s="chandhru saravanan";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(i==0||i==s.length()-1) {
			if(ch>='a'&&ch<='z')
				System.out.print((char)(ch-32));
			}
		else if(ch==' ') {
			System.out.print(ch);
			i++;
			ch=s.charAt(i);
			if(ch>='a'&&ch<='z')
	System.out.print((char)(ch-32));
			}
			else {
				int j=i+1;
				if(j<s.length()&&s.charAt(j)==' ') {
					if(ch>='a'&&ch<='z')
						System.out.print((char)(ch-32));
				}
			else 
				System.out.print(ch);
		}
		}
	}

	private void toupperFML() {
		// TODO Auto-generated method stub
		String s="chandhru";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(i==0||i==s.length()-1||i==s.length()/2) {
			if(ch>='a'&&ch<='z') {
				System.out.println((char)(ch-32));
			}
			}
			else {
				System.out.println(ch);
			}
	}
	}

	private void tolowercase() {
		// TODO Auto-generated method stub
		String s="ABCD1234";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='A'&&ch<='Z') {
				System.out.println((char)(ch+32));
			}
			else {
				System.out.println(ch);
			}
	}
	}

	private void touppercase() {
		// TODO Auto-generated method stub
		String s="abcd1234";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='a'&&ch<='z') {
				System.out.println((char)(ch-32));
			}
			else {
				System.out.println(ch);
			}
		}
	}

	private void learning_2() {
		// TODO Auto-generated method stub
//		String str="hi how are you";
//		//System.out.println(str);
//		str.split(" ");
//		str=str.stripLeading();
//		System.out.println(str);
//		String str1="hi how are you    ";
//		str=str.stripTrailing();
//		System.out.println(str.length());
//		System.out.println(str1.length());
		String st=String.valueOf(false);
		System.out.println(st);
		}

	private void learning_1() {
		// TODO Auto-generated method stub
		String name="chandhru";
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());

	}

}
