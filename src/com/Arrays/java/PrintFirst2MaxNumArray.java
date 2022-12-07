package com.Arrays.java;

public class PrintFirst2MaxNumArray {

	public static void main(String[] args) {
		//Print First and Second Max. Number without BB sort
		int[]a= {0,1,9,2,8};
		int fmax=a[0];
		int smax=a[0];
		for(int i=0;i<a.length;i++) {
			if(fmax<a[i]) {
				fmax=smax;
				fmax=a[i];
				
			}
			else if(smax<a[i]) {
				smax=a[i];
			}
		}
		System.out.println("First maximum number "+fmax);
		System.out.println("Second maximum number "+smax);

	}

}
