package com.Strings.java;

public class CheckStringIsBalancedOrNot {

	public static void main(String[] args) {
		String s="{[()]}";
		int count=0;
		char[] st = s.toCharArray();
		for(int i=1;i<st.length;i++) {
		if(st[i]==(st[st.length-i])) {
			count++;
			
		}
		}
		if(count==(st.length/2)) {
			System.out.println("Balanced");
		}else {
			System.out.println("Not Balanced");
		}
		
	}

}
