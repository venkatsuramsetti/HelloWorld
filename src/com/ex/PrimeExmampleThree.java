package com.ex;

import java.util.Scanner;

public class PrimeExmampleThree {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number to be calculated: ");
		int input = scanner.nextInt();
		scanner.close();
		int n = input;
		int count = 0;
		for (int i = 1; i <= input; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println(n + " Is Prime");
		} else {
			System.out.println(n+ " Not Prime");
		}
	}

}
