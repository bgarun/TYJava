package com.ClassWork.java;

import java.util.ArrayList;

public class PrintFirstMiniArray {

	public static void main(String[] args) {
		//Print First Min. Number without BB sort
		int[]a= {5,1,4,9};
		int fmin=a[0];
		for(int i=1;i<a.length;i++) {
			if(fmin>a[i]) {
				fmin=a[i];
			}
		}
		System.out.println();
	}

}
