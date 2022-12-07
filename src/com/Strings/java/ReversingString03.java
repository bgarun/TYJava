package com.Strings.java;

public class ReversingString03 {

	public static void main(String[] args) {
		String s="Software";
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
	}

}
