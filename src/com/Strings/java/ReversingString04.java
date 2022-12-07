package com.Strings.java;

public class ReversingString04 {

	public static void main(String[] args) {
		String st="Software";
		char[]s=st.toCharArray();
		int count=0;
		for(char ch:s) {
			count++;
		}
		for(int i=count-1;i>=0;i--) {
			System.out.println(s[i]);
		}

	}

}
