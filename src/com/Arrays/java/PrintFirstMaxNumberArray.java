package com.Arrays.java;

public class PrintFirstMaxNumberArray {

	public static void main(String[] args) {
		//Print First Max. Number without BB sort
				int[]a= {5,1,4,9};
				int fmax=a[0];
				for(int i=1;i<a.length;i++) {
					if(fmax<a[i]) {
						fmax=a[i];
					}
				}
				System.out.println("First Maximun number "+fmax);
			}

	

}
