package com.Arrays.java;

public class ProductofFirst3MaxArray {

	public static void main(String[] args) {
int[] a= {5,7,1,2,6};
		
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
		int prd=1;
		for(int i=0;i<3;i++) {
			prd=prd*a[i];
		}
		
	System.out.println("Product of first 3 maximum numbers "+prd);

	}


	}


