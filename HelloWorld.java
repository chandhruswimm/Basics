package com.basic.pkg;

public class HelloWorld {

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
	int num=5;
	for(int col=1;col<=row;col++) {
		System.out.print("  ");
	}
	
	for(int no=5;no>=row;no--) {
	System.out.print(num+" ");
	num--;
	}
	System.out.println();
}
	}
}
