package com.Strings.java;

public class UpperCaseLoweCaseSegregationWord {

	public static void main(String[] args) {
		String s="KaNnADa078";
		int upper=0;
		int lower=0;
		int num=0;
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(ch>='A'&& ch<='Z') {
				upper++;
			}
			else if(ch>='a'&& ch<='z'){
				lower++;
			}else {
				num++;
			}
		}
		System.out.println("UpperCase Letters in String "+upper);
		System.out.println("LowerCase Letters in String "+lower);
		System.out.println("Numbers present in String "+num);

	}

}
