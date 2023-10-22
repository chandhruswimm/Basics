package com.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class CollectionProgram {

	public static void main(String[] args) {
		CollectionProgram cp=new CollectionProgram();
		//cp.assending();//list program
//cp.setprogram();
//cp.mapprogram();
cp.linkedlist_iterator();
	}

	private void linkedlist_iterator() {
		LinkedList<String> cities=new LinkedList<String> ();
		cities.add("chennai");
		cities.add("delhi");
		cities.add("mumbai");
		cities.add("hyderabad");
		cities.add("Kolkata");
		System.out.println(cities);
		Iterator<String> itr=cities.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

	private void mapprogram() {
		HashMap<String,String> hm=new HashMap<String,String>();
		hm.put("java","is a pi oo pl");
		hm.put("c","is a pl");
		hm.put("c++","is a legacy pi oopl");
		hm.put("python","is a dynomic pi oo pl");
		hm.put("js","is a ft sl as well pl");
		for(Map.Entry<String,String>m:hm.entrySet()) {
			System.out.println(m.getKey()+"->"+m.getValue());
		}
	}

	private void setprogram() {
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(70);
		hs.add(5);
		hs.add(96);
		hs.add(2);
		hs.add(111);
		hs.add(6);
		Iterator<Integer> value=hs.iterator();
		while(value.hasNext()) {
//			int x=value.next();
//			if(x>=0) {
//				System.out.println(x);
//			}
			System.out.println(value.next());
		}
	}

	private void assending() {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(2);
		al.add(7);
		al.add(5);
		al.add(3);
		al.add(7);
		for(int i=0;i<al.size();i++) {
			for(int j=i+1;j<al.size();j++) {
				if(al.get(i)<al.get(j)) {
					int temp=al.get(i);
					al.set(i, al.get(j));
					al.set(j,temp);
				}
			}
		}
		for(int i=0;i<al.size();i++) {
			if(al.get(i)!=0) {
				System.out.println(al.get(i));
			}
		}
	}

}
