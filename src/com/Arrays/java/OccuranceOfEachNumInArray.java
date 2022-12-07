package com.Arrays.java;

import java.util.LinkedHashSet;

public class OccuranceOfEachNumInArray {

	public static void main(String[] args) {
		int[]a= {9,8,7,8,1,1,2};
		LinkedHashSet<Integer> list = new LinkedHashSet<>();
		for (int i = 0; i < a.length; i++) {
			list.add(a[i]);
		}
		for(Integer b:list) {
			int count=0;
			for(int i=0;i<a.length;i++) {
				if(b==a[i]) {
					count++;
				}
			}
			System.out.println(b+" is Repeating "+count+" times");
		}
	}

}
