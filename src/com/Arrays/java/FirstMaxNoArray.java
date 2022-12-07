package com.Arrays.java;

public class FirstMaxNoArray {

	public static void main(String[] args) {
		int[] a= {32,56,75,23,41};
		for(int i=0; i<a.length;i++) {
			for(int j=i+1;j<a.length; j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println(a[i]);
		}
	System.out.println("First maximum number "+a[0]);
	System.out.println("Second maximum number "+a[1]);
	}

}
