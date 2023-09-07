package com.mt.pkg;

public class Cnfusionprograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.out.println(010);
//System.out.println(0X13);
//System.out.println(0XA);
//System.out.println(0b1000);
//System.out.println(0B100);
		for(int i=0;i<=100;i++) {
			System.out.print(i+"\t");
			System.out.print(Integer.toBinaryString(i)+"\t");
			System.out.print(Integer.toOctalString(i)+"\t");
			System.out.println(Integer.toHexString(i)+"\t");
		}

	}

}
