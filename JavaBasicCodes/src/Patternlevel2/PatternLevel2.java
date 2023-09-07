package Patternlevel2;

public class PatternLevel2 {

	public static void main(String[] args) {
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print("  ");
			}
			for(int no=1;no<=6-row;no++) {
				System.out.print(no+" ");
			}
			System.out.println();
		}
		
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print("  ");
			}
			for(int no=5;no>=row;no--) {
			System.out.print(no+" ");
			}
			System.out.println();
		}
		
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print("  ");
			}
			int num=0;
			for(int no=5;no>=row;no--) {
			System.out.print(num+1+" ");
			num++;
			}
			System.out.println();
		}
			}
		}

