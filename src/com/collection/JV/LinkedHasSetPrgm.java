package com.collection.JV;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHasSetPrgm {

	public static void main(String[] args) {
		LinkedHashSet<Object> set = new LinkedHashSet<>();
		set.add("Hi");
		set.add(26);
		set.add('A');
		set.add("Java");
		System.out.println(set);
		
		System.out.println(set.size());
		System.out.println(set.contains("hi"));
		System.out.println(set.isEmpty());
		System.out.println(set.remove('A'));
		
		ArrayList<Object> ar = new ArrayList<>(set); //binding elements of set into ArrayList
		ar.get(2);
		ar.indexOf(null);
		
		Iterator<Object> it = ar.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	
	}
	}


