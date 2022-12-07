package com.Arrays.java;

public class ProductofFirst3minArray {

	public static void main(String[] args) {
int[] a= {26,87,21,12,56};
		
		for(int i=0; i<a.length;i++) {
			for(int j=i+1;j<a.length; j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println(a[i]);
		}
		int prd=1;
		for(int i=0;i<3;i++) {
			prd=prd*a[i];
		}
		
	System.out.println("Product of first 3 minimum numbers "+prd);

	}

	

}
