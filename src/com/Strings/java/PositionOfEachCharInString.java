package com.Strings.java;

import java.util.LinkedHashSet;

public class PositionOfEachCharInString {

	public static void main(String[] args) {
		String k="KaNnada";
		String s = k.toLowerCase();
		
		char[] st = s.toCharArray();
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		for(int i=0;i<s.length();i++) {
			//System.out.println(st[i]+" is at index of "+i);
			System.out.println(st[i]+" is at position "+(i+1));
			
		}
		System.out.println("<<********************>>");
		for(int i=0;i<st.length;i++) {
			set.add(st[i]);
		}
		for(Character ch:set) {
			for(int i=0;i<s.length();i++) {
				if(ch==s.charAt(i)) {
				System.out.println(ch+" is at position "+(i+1));
				break;
			}
			}
		}
	}

}
