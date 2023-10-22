package com.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Occuranceofchar {

	public static void main(String[] args) {
		String s="CHANDHRU";
		char c[]=s.toCharArray();
		LinkedHashMap<Character,Integer> hm=new LinkedHashMap<Character,Integer>();
		for(int i=0;i<c.length;i++) {
			if(c[i]=='*') {
				continue;
			}
			int count=1;
			for(int j=i+1;j<c.length;j++) {
				if(c[i]==c[j]) {
					count=count+1;
					c[j]='*';
				}
			}
			hm.put(c[i],count);
		}
		System.out.println(hm);
	}

}
