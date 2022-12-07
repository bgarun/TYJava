package com.Strings.java;

public class SegregateNumAndAddInWord {

	public static void main(String[] args) {
		String s="a1c2d4";
		int num=0;

		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch>='0'&& ch<='9') {
				int n=ch-48;
				num=num+n;
			}
		}
		System.out.println("Sum of numbers in String "+num);
	}
}
