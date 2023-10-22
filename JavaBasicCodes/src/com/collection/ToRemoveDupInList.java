package com.collection;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class ToRemoveDupInList {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(7);
		al.add(7);
		al.add("chandhru");
		al.add("banana");
		al.add("blue");
		al.add(0.5);
		System.out.println(al);
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.addAll(al);
		System.out.println(lhs);

	}

}
