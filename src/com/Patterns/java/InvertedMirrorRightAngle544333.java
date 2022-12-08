package com.Patterns.java;

public class InvertedMirrorRightAngle544333 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1,k=5;i<=n;i++,k--) {
			for(int j=i;j<n;j++) {
				System.out.print("  ");
			}
			
			for(int j=1;j<=i;j++) {
				
				System.out.print(k+" ");
				
			}
			System.out.println();
		}
	}

}
