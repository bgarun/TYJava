package com.Strings.java;

public class ChangingOrderOfWordsInString {

	public static void main(String[] args) {
		String s="I am from Karnataka";
		//o/p= Karnataka am from I
		
		String[] st = s.split(" ");
		//String f=st[0];
		//String l=st[3];
		String temp=st[0];
		st[0]=st[st.length-1];
		st[st.length-1]=temp;
		for(int i=0;i<st.length;i++) {
			System.out.print(st[i]+" ");
		}
		
		

	}

}
