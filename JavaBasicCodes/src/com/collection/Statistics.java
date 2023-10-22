package com.collection;

import java.util.ArrayList;
import java.util.HashMap;

public class Statistics {

	public static void main(String[] args) {
		Statistics st=new Statistics();
		//st.find_sum_of_element();
		//st.find_mid_element();
		st.find_mode();//data which occurs most frequently
	}

	private void find_mode() {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(5);
		al.add(7);
		al.add(9);
		al.add(1);
		al.add(5);
		al.add(3);
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		for(int i=0;i<al.size();i++) {
			int count=1;
			for(int j=i+1;j<al.size();j++) {
				if(al.get(i)==al.get(j)) {
					count=count+1;
					al.set(j,0);
				}
			}
			hm.put(al.get(i),count);
		}
		System.out.println(hm);
	}

	private void find_mid_element() {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(5);
		al.add(7);
		al.add(9);
		al.add(1);
		al.add(5);
		al.add(3);
		System.out.println(al);
			if(al.size()%2==0) {
				System.out.println(al.get(al.size()/2));//even
				System.out.println(al.get(al.size()/2-1));
			}
			else {
				System.out.println(al.get(al.size()/2));
			}
		}

	private void find_sum_of_element() {
		int sum=0;
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(5);
		al.add(7);
		al.add(9);
		al.add(1);
		al.add(5);
		al.add(3);
		System.out.println(al);
		for(int i=0;i<al.size();i++) {
			sum=sum+al.get(i);
		}
System.out.println(sum/al.size());
	}

}
