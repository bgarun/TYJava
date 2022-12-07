package com.Arrays.java;

import java.util.Arrays;

public class AscendingOrderUsingSort {

	public static void main(String[] args) {
		//Arranging the elements in ascending order using sort method
		int[]a= {7,6,1,8};
		Arrays.sort(a);
		
		
		for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
		}

	}

}
