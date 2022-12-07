package com.Strings.java;

import java.util.LinkedHashSet;

public class PrintUniqueVowelsWord {

	public static void main(String[] args) {
		String st="Bahubali";
		char[] s = st.toCharArray();
		LinkedHashSet<Character> list = new LinkedHashSet<>();
		for(int i=0;i<s.length;i++) {
			list.add(s[i]);
		}
		int count=0;
		for (char c : list) {
			for(int i=0;i<s.length;i++) {
			if(c=='a'|| c=='e' || c=='i'|| c=='o'||c=='u') {
				count++;
				System.out.println(c);
				break;
			}
			}
		}
		System.out.println(count);
	}
}



