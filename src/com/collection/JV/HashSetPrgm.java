package com.collection.JV;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;


public class HashSetPrgm {

	public static void main(String[] args) {
		HashSet<Object> has = new HashSet<>();
		has.add("hi");
		has.add('A');
		has.add(75);
		has.add("Selenium");
		has.add(null);
		has.add(null);
		System.out.println(has);
		System.out.println(has.size());
		System.out.println(has.contains("hi"));
		System.out.println(has.isEmpty());
		System.out.println(has.remove('A'));
		
		ArrayList<Object> ar = new ArrayList<>(has); //binding elements of set into ArrayList
		ar.get(2);
		ar.indexOf(null);
		
		Iterator<Object> it = ar.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	
	}

}
