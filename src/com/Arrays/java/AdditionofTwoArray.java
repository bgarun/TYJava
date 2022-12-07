package com.Arrays.java;

public class AdditionofTwoArray {

	public static void main(String[] args) {
		int[]a= {5,3,4,3,6};
		int[]b= {2,1,3,4};
		int c=0;
		int i;
		int length=a.length;
		if(a.length<b.length) {
			length=b.length;
		}
		
		for(i=0;i<length;i++) {
			
			try {
				c=a[i]+b[i];
			System.out.println(c);
		}
		
		catch(Exception e){
			if(a.length<b.length) {
				System.out.println(b[i]);
			}else {
				System.out.println(a[i]);
			}
		}

	}

	}
}
