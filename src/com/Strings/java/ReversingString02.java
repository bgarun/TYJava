package com.Strings.java;

public class ReversingString02 {

	public static void main(String[] args) {
		String st="Software";
		char[] s=st.toCharArray();
		for(int i=s.length-1;i>=0;i--) {
			System.out.print(s[i]);
		}

	}

}
