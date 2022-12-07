package com.Arrays.java;

import java.util.LinkedHashSet;

public class PostionOfUniqueElementsInArray {

	public static void main(String[] args) {
		int[]a= {4,2,5,4,2,8,7,1};
		LinkedHashSet<Integer> list = new LinkedHashSet<>();
		for (int i = 0; i < a.length; i++) {
			list.add(a[i]);
		}
		for (Integer r : list) {
			
			for (int i = 0; i < a.length; i++) {
				if(r==a[i]) {
					System.out.println(a[i]+" is unique at position "+(i+1));
					break;
					
				}
			}
	
		
		
		
		}
		
	}

}
