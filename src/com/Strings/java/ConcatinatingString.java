package com.Strings.java;

public class ConcatinatingString {

	public static void main(String[] args) {
		String s="Hi";
		String s1="Hello";
		String s2="Welcome";
		System.out.println(s+s1+s2);
		System.out.println(s.concat(s1).concat(s2));
		String join = s.join(" ",s,s1,s2);
		System.out.println(join);
		
		String st="Bengaluru";
		System.out.println(st.charAt(1));
		
		

	}

}
