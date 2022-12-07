package com.Strings.java;

import java.util.Scanner;

public class UppercaseLowerCaseSegregation {

	public static void main(String[] args) {
		for( ; ; ) {
		Scanner sc=new Scanner(System.in);
		String s = sc.next();
		
		int upper=0;
		int lower=0;
		int num=0;
		
		for (int i = 0; i < s.length(); i++) {
			if(Character.isUpperCase(s.charAt(i))) {
				upper++;
			}else if(Character.isLowerCase(s.charAt(i))) {
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

}
