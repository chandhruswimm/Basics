package com.basic.pkg;

public class FizzBuzz {

	public static void main(String[] args) {

		int no = 1;
		while (no <= 50) {
			if (no % 3 == 0&&no % 5 == 0) {
				System.out.println("FizzBuzz");
			}
			 if (no % 5 == 0) {
				System.out.println("Buzz");
			}
			 if (no % 3 == 0) {
				System.out.println("Fizz");
			} else {
				System.out.println(no);
			}
			no++;
		
		}
	}
}
	

