package com.Strings.java;

public class SegregateCharactersWord {

	public static void main(String[] args) {
		String st="a1/b&d+3";
		char[] s = st.toCharArray();
		char[] t = new char[s.length];
		
		int m=0;
		int n=t.length-1;
		
		for (int i = 0; i < s.length; i++) {
			
			if(s[i]>='a'&& s[i]<='z') {
				t[m]=s[i];
				m++;
			}
			else {
				t[n]=s[i];
				n--;
			}
	}
		for(int i=0;i<t.length;i++)
		System.out.print(t[i]+" ");
	}
	
}
