package com.Strings.java;

public class EachStringLengthInArray {

	public static void main(String[] args) {
		String[]a= {"12","456","8568","45", "742585"};
		 String max = a[0];
		int min = a[0].length();
		for(int i=0;i<a.length;i++) {
			int n=a[i].length();
			if(max.length()<n) {
				max=a[i];
			}
		}
		for(int i=0;i<a.length;i++) {
			if(max.length()==a[i].length()) {
				System.out.println("Maximum Length String "+a[i]);
			}
		}
	}

}
