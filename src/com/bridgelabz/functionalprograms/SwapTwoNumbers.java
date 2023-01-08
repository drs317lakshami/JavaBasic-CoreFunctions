package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		System.out.println("Enter the value of a & b: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		SwapTwoNumbers swapNo = new SwapTwoNumbers();
		swapNo.swapping(a, b);
	}

	public void swapping(int a, int b) {
		System.out.println("Before swapping of two numbers: " + a + " " + b);
		int swap = a;
		a = b;
		b = swap;
		System.out.println("After swapping of two number: " + a + " " + b);
	}
}