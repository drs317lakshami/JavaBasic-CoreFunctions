package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class QuotientAndReminder {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter devident: ");
		int devident = scanner.nextInt();
		System.out.print("Enter divisor: ");
		int divisor = scanner.nextInt();
		QuotientAndReminder qr = new QuotientAndReminder();
		qr.computeQuotientAndReminder(devident, divisor);
	}

	public void computeQuotientAndReminder(int devident, int divisor) {
		int quotient = devident / divisor;
		System.out.println("Quotient = " + quotient);

		int remainder = devident % divisor;
		System.out.println("Remainder = " + remainder);
	}
}
