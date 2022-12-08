package com.Arrays.java;

import java.util.LinkedHashSet;

public class CountUniqueNumInArray {

	public static void main(String[] args) {
		int[]a= {5,2,6,2,5,4,8};
          LinkedHashSet<Integer> list = new LinkedHashSet<>();
          for (int i = 0; i < a.length; i++) {
			list.add(a[i]);
		}
          for (Integer t : list) {
			int count=0;
			for (int i = 0; i < a.length; i++) {
				if(t==a[i]) {
					count++;
				}
			}
			if(count==1) {
				System.out.println(t+" Is Unique"+count);
			}
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
