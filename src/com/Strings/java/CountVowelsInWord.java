package com.Strings.java;

public class CountVowelsInWord {

	public static void main(String[] args) {
		String s="Bahubali";
		String vowel=" ";
		int count=0;
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch=='a'|| ch=='e' || ch=='i'|| ch=='o'||ch=='u') {
				vowel=vowel+ch;
				count++;
				
			}
		}
		System.out.println(vowel+"==="+count);

	}

}
