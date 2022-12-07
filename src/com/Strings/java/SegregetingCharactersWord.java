package com.Strings.java;

public class SegregetingCharactersWord {

	public static void main(String[] args) {
		String s="a/1b&+3c";
		String alpha=" ";
		String num=" ";
		String spl=" ";
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch>='A'&& ch<='Z' || ch>='a'&& ch<='z') {
				alpha=alpha+ch;
			}else if(ch>='0'&& ch<='9') {
				num=num+ch;
			}else {
				spl=spl+ch;
			}
		}
		System.out.println(alpha+num+spl);

	}

}
