package LoopingPrograms;

public class Gcd_Lcd_singleloop {

	public static void main(String[] args) {
		int no1=100,no2=120;
		boolean first=true;
		int gcd=0;
		int lcd=0;
		int small=no1<no2?no1:no2;
		for(int div=2;div<=small;div++) {
			if(no1%div==0 && no2%div==0) {
				if(first==true) {
					lcd=div;
					first=false;
				}
				gcd=div;
			}
		}
		System.out.println("GCD IS:"+gcd);
		System.out.println("LCD is:"+lcd);

	}

}
