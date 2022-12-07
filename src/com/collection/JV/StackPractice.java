package com.collection.JV;

import java.util.Stack;

public class StackPractice {

	public static void main(String[] args) {
		Stack<Object> s = new Stack<>();
		s.push(10);
		s.push(20);
		s.push("String");
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());

	}

}
