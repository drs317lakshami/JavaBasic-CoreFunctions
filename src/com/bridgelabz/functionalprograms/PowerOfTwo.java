package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		int num = 2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Power: ");
		int N = sc.nextInt();
		PowerOfTwo p = new PowerOfTwo();
		p.power(num, N);
	}

	public void power(int num, int N) {
		for (int i = 1; i <= N; i++) {
			System.out.println("2^" + i + ": " + (int) Math.pow(num, i));
		}
		int powerValue = (int) Math.pow(num, N);
		System.out.println(num + " to the power of " + N + " is " + powerValue);
	}
}
