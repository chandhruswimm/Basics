package com.collection;

import java.util.LinkedList;

public class MyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList ll=new LinkedList();
ll.add(6);
ll.add(7);
ll.add("chandhru");
ll.add("banana");
ll.add("blue");
ll.add(0.5);
ll.remove(2);
System.out.println(ll.size());
System.out.println(ll);
System.out.println(ll.get(1));
System.out.println(ll.indexOf(7));
	}

}
