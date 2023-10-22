package com.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class MyLinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet hs=new LinkedHashSet();
		hs.add("mango");
		hs.add("apple");
		hs.add(5);
		hs.add(75.75);
		hs.add("mango");
		System.out.println(hs);
	}

}
