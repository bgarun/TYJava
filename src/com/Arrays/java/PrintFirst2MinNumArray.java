package com.Arrays.java;

public class PrintFirst2MinNumArray {

	public static void main(String[] args) {
		//Print First and Second Min. Number without BB sort
				int[]a= {8,1,3,2};
				int fmin=a[0];
				int smin=a[0];
				for(int i=1;i<a.length;i++) {
					if(fmin>a[i]) {
						fmin=smin;
						fmin=a[i];
						
					}
					else if(smin>a[i]) {
						smin=a[i];
					}
				}
				System.out.println("First minimum number "+fmin);
				System.out.println("Second minimum number "+smin);
			}

	}


