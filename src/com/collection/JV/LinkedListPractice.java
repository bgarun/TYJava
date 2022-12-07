package com.collection.JV;

import java.util.LinkedList;

public class LinkedListPractice {

	public static void main(String[] args) {
		LinkedList<Object> link = new LinkedList<>();
		link.addFirst("Hello");
		link.add("Java");
		link.addLast("Bye");
		link.removeFirst();
		link.removeLast();
		System.out.println(link.get(0));

	}

}
