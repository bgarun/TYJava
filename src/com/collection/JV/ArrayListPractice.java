package com.collection.JV;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListPractice {

	public static void main(String[] args) {
		ArrayList<Object> ar = new ArrayList<>();
		ar.add("Java");
		ar.add(1);
		ar.add(5);
		ar.add(6);
		ar.add("Selenium");
		ar.add(null);
		ar.add(5);
		System.out.println(ar);
		ArrayList<Integer> inte=new ArrayList<>();
		inte.add(16);
		inte.add(28);
		inte.add(46);
		inte.add(52);
		inte.add(63);
		Collections.sort(inte);//Sort the elements in ascending order
		System.out.println(inte);
		ar.add(inte); //add all the elements inte to ar
		for(Object ob:ar) {
			System.out.println(ob);
		}
		System.out.println(ar.contains("Java")); //checks the element present in the list
		System.out.println(ar.get(1));//fetch the first index
		System.out.println(ar.indexOf('a')); //fetch the index of element 'a'
		System.out.println(ar.set(2, "PyThon")); //replace the index 2 with PyThon
		System.out.println(ar.size()); // returns the size of arraylist
		Iterator<Object>it=ar.iterator(); //used to fetch the elements
		ar.remove(2); //Removes the element of index 2
		
		while(it.hasNext()) {
			Object data = it.next();
			System.out.println(data);
		}
		

	}

}
