package com.collection;

import java.util.*;

public class ListtoMapValues {

	public static void main(String[] args) {
		LinkedList<Integer> li = new LinkedList<Integer>();
		li.add(5);
		li.add(6);
		li.add(2);
		li.add(4);
		li.add(10);
		System.out.println(li);

		LinkedHashMap<Integer, Integer> lhm = new LinkedHashMap<Integer, Integer>();

		for (int i = 0; i < li.size(); i++) {
			lhm.put(i, li.get(i));
		}

		System.out.println(lhm);
	}
}