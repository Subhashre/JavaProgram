package org.subha.concept.concurrent;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class HashmapDemo {

	public static void main(String[] args) {

		System.out.println("Started.........");
		Map<Integer, String> m = new ConcurrentHashMap();
		String s= "no";
		for(int i=1; i<=10 ;i++) {
			m.put(i, s+i);	
		}
		System.out.println(m);
		for(Integer j : m.keySet()) {
			System.out.println("Elements are :"+m.get(j));
			if(j==1)
				m.remove(j);
		}
		System.out.println(m);
		
		Map<Integer, String> m1 = new ConcurrentHashMap();
		String s1= "no";
		for(int i=1; i<=10 ;i++) {
			m1.put(i, s+i);	
		}
		System.out.println(m1);
		Set<Integer> set = m1.keySet();
		
		Iterator i = set.iterator();
		while(i.hasNext()) {
			
			int k=(int) i.next();
			System.out.println("The Entry are :"+k);
			
			System.out.println("The value are :"+m1.get(k));
			
			if(k == 1) {
				m1.remove(k);
			}
		}
		System.out.println(m1);
		
		Map<Integer, String> m2 = new HashMap();
		String s3= "no";
		for(int ii=1; ii<=10 ;ii++) {
			m2.put(ii, s+ii);	
		}
		System.out.println(m2);
		Set<Integer> set1 = m2.keySet();
		
		Iterator i1 = set1.iterator();
		while(i1.hasNext()) {
			
			int k=(int) i1.next();
			System.out.println("The Entry are :"+k);
			
			System.out.println("The value are :"+m2.get(k));
			
			if(k == 1) {
				m2.remove(k);
			}
		}
		System.out.println(m1);
		
	}

}
