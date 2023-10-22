package com.collection;

import java.util.HashSet;

public class MyHashSet {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add("mango");
		hs.add("apple");
		hs.add(5);
		hs.add(75.75);
		hs.add("mango");
		System.out.println(hs);
	}

}
