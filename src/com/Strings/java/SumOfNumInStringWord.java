package com.Strings.java;

public class SumOfNumInStringWord {

	public static void main(String[] args) {
		String s="1a41b21c14H";
		char[] s1 = s.toCharArray();
		int sum=0;
		int c=0;
		for(int i=0;i<s1.length;i++) {
			if(s1[i]>='0'&& s1[i]<='9') {
			int n=s.charAt(i)-48;
			c=c*10+n;
			}
			else {
				sum=sum+c;
				c=0;
			}
		}
		sum=sum+c;
		System.out.println(sum);
	}

}
