package com.Strings.java;

import java.util.Scanner;

public class VowelOrNotWord {

	public static void main(String[] args) {
		for( ; ; ) {
		Scanner sc=new Scanner(System.in);
		char c = sc.next().charAt(0);
		if(c=='a'|| c=='e' || c=='i'|| c=='o'||c=='u'|| c=='A'|| c=='E' || c=='I'|| c=='O'||c=='U') {
			System.out.println("Given character is Vowel");
		}else {
			System.err.println("Given Character is Consonant");
		}
		}
	}

}
