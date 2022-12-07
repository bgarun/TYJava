package com.Strings.java;

import java.util.LinkedHashSet;

public class PositionOfUniqueWordInString {

	public static void main(String[] args) {
		String k="I am am from i Karnataka";
		String s = k.toLowerCase();
		String[] st = s.split(" ");
		LinkedHashSet<String> list = new LinkedHashSet<>();
		for(int i=0;i<st.length;i++) {
			list.add(st[i]);
		}
		for(String str:list) {
			for(int i=0;i<st.length;i++) {
				if(str==st[i]) {
					System.out.println(st[i]+" is at Position "+(i+1));
				}
			}
		}

	}

}
