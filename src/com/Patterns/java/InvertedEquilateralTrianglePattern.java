package com.Patterns.java;

public class InvertedEquilateralTrianglePattern {

	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<=n;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++) {
				System.out.print((n-i)+" ");
			}
			System.out.println();
		}

	}

}
