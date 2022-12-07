package com.Strings.java;

public class PositionOfEachWord {

	public static void main(String[] args) {
		String k="I am am from i Karnataka";
		String s = k.toLowerCase();
		String[] st = s.split(" ");
		for(int i=0;i<st.length;i++) {
			System.out.println(st[i]+" = "+(i+1));
		}

	}

}
