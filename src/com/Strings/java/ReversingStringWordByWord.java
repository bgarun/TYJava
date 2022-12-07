package com.Strings.java;

public class ReversingStringWordByWord {

	public static void main(String[] args) {
		String name="I am from Gadag";
		String [] s=name.split(" ");
		
		for(int i=s.length-1; i>=0;i--) {
			System.out.print(s[i]+" ");
		}

	}

}
