package com.collection.JV;

import java.util.PriorityQueue;

public class QueueCollection {

	public static void main(String[] args) {
		//Only Homogeneous types are allowed in Priority
		PriorityQueue<Character> q=new PriorityQueue<>();
		q.add('A');
		q.add('B');
		q.add('C');
		q.add('D');
		System.out.println(q.peek());
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);

	}

}
