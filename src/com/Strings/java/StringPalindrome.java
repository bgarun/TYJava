package com.Strings.java;

public class StringPalindrome {

	public static void main(String[] args) {
		String s="Software";
		char ch;
		String rev="";
		for(int i=0;i<s.length();i++) {
			ch=s.charAt(i);
			rev=ch+rev;
		}
		System.out.println(rev);

	if(rev.equals(s)) {
		System.out.println("Given String is Palidrome");
	}else {
		System.err.println("Given String is not Palindrome");
	}

	}
}


