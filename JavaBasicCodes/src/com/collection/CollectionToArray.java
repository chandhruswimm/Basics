package com.collection;

import java.util.LinkedHashSet;

public class CollectionToArray {

	public static void main(String[] args) {
		 LinkedHashSet lhs = new LinkedHashSet();
		  lhs.add("Abc");
		  lhs.add(5);
		  lhs.add(75.75);
		  lhs.add("ijk");
		  lhs.add(true);
		  lhs.add('Q');
		  System.out.println(lhs);
		  Object o[] = lhs.toArray();//hetrogeneous array->object[]
		  for(Object i:o) {
		   System.out.println(i);
	}
	}
}
