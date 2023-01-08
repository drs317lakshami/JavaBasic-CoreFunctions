package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {
		System.out.println("Enter Alphabet: ");
		Scanner scanner = new Scanner(System.in);
		char ch = scanner.next().charAt(0);
		VowelOrConsonant vc = new VowelOrConsonant();
		vc.alphabet(ch);
	}

	public void alphabet (char ch) {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println("Vowel is: " + ch);
		} else {
			System.out.println( ch + " is Consonant: " );
		}
	}
}