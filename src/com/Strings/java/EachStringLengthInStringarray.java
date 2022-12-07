package com.Strings.java;

public class EachStringLengthInStringarray {

	public static void main(String[] args) {
		String[]s= {"ab","abcd","abcde","ij","ijklm"};
		int max = s[0].length();
		int min = s[3].length();
		for(int i=0;i<s.length;i++) {
			int n = s[i].length();
			int temp=0;
			if(max<n) {
				temp=max;
				max=n;
				n=temp;
			}
			if(min>n) {
				temp=min;
				min=n;
				n=temp;
			}
		}
		System.out.println("Maximum length of string is "+max);
		System.out.println("Minimum Length String in Array "+min);
	}

}
