package com.Arrays.java;


import java.util.LinkedHashSet;

public class CountNumDuplicatesInArray {

	public static void main(String[] args) {
		int[]a= {9,8,7,8,1,2,7};
		LinkedHashSet<Integer> list = new LinkedHashSet<>();
		for (int i = 0; i < a.length; i++) {
			list.add(a[i]);
		}
		for (Integer b : list) {
			int count=0;
			for (int i = 0; i < a.length; i++) {
				if(b==a[i]) {
					count++;
				}
			}
			if(count>1) {
				System.out.println(b+" repeated "+count+" times");
			}
		}

	}

}
