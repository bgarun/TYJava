package com.Strings.java;

import java.util.LinkedHashSet;

public class OccuranceofCharactersInString {

	public static void main(String[] args) {
		String s="Kannada";
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
		}
		System.out.println(set);
					
		for(Character ch:set) {
			int count=0;
			for(int i=0;i<s.length();i++) {
				if(ch==s.charAt(i)) {
				count++;
			}
		}
		System.out.println(ch+" is Repeating "+count+" times");
	}

}
}

