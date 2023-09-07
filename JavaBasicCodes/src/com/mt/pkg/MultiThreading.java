package com.mt.pkg;

class A extends Thread {

	public void run() {
		// print prime number b/w 100and300
		for (int i = 9000; i <= 9100; i++) {
			int count = 0;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					count++;
				}
			}
				if (count == 0) {
					System.out.println("prime numer is:" + i);
				}

			}
		}
	}

class B extends Thread {

	public void run() {
		// print given string palindrome or not
		String original = "malayalam";
		String reverse = "";
		char c[] = original.toCharArray();
		for (int i = c.length - 1; i >= 0; i--) {
			reverse = reverse + c[i];
		}
		if (original.equals(reverse)) {
			System.out.println("given string is palindrome");
		} else {
			System.out.println("given string is not palindrome");
		}
	}
}

class C extends Thread {

	public void run() {
		// tables program for number 987654321
		int num = 987654321;
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + "*" + i + "=" + (num * i));
		}
	}
}

public class MultiThreading {

	public static void main(String[] args) {
		A a = new A();
		a.start();
		B b = new B();
		b.start();
		C c = new C();
		c.start();
	}
}
