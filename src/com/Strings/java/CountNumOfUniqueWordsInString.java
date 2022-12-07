package com.Strings.java;

import java.util.LinkedHashSet;

public class CountNumOfUniqueWordsInString {

	public static void main(String[] args) {
		String k="I am am from i Karnataka";
		String s = k.toLowerCase();
		String[] st = s.split(" ");
		LinkedHashSet<String> list = new LinkedHashSet<>();
		for(int i=0;i<st.length;i++) {
			list.add(st[i]);
		}
		for(String str:list) {
			int count=0;
			for(int i=0;i<st.length;i++) {
				if(str.equals(st[i])) {
					count++;
				}
			}
			if(count==1) {
				System.out.println(str+" is repeating "+count+" times");
			}
			
			
		}
	}

}
