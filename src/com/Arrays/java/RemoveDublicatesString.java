package com.Arrays.java;

import java.util.LinkedHashSet;

public class RemoveDublicatesString {

	public static void main(String[] args) {
		String s="Kannada";
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
			
		}
		System.out.println(set);
		for(Character ch:set) {
			System.out.println(ch);
		}
		
		
	}

}
