package com.collection.JV;

import java.util.TreeSet;

public class TreeSetprgm {

	public static void main(String[] args) {
		TreeSet<Object> set = new TreeSet<>();
		set.add(63);
		set.add(26);
		set.add(86);
		set.add(12);
		System.out.println(set);
		System.out.println(set.descendingSet());
		if(set.contains(0)) {
			System.out.println("Object present");
		}else {
			System.err.println("Object not present");
		}
		System.out.println(set.first());
		System.out.println(set.last());
		System.out.println(set.isEmpty());
		System.err.println(set.hashCode());
		System.out.println(set.pollFirst());
		System.out.println(set.pollLast());
		System.out.println(set);
		
		
		
		
		
		
		
		
		
		
	}

}
