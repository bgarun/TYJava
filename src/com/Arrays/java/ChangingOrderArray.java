package com.Arrays.java;

public class ChangingOrderArray {

	public static void main(String[] args) {
		int[]a= {0,4,2,0};
		int[] b=new int[a.length];
		int m=0;
		int n=a.length-1;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				b[m]=a[i];
				m++;
			}else {
				b[n]=a[i];
				n--;
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(b[i]);
		}

	}

}
