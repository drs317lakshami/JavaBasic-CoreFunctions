package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class EvenOddNumber {

    public static void main(String[] args) {
        System.out.println("Enter Number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        EvenOddNumber evenOddNumber = new EvenOddNumber();
        evenOddNumber.print(n);
    }
        public void print(int n) {
            if (n % 2 == 0) {
                System.out.println("Number is even");
            } else {
                System.out.println("Number is odd");
            }
        }
}
