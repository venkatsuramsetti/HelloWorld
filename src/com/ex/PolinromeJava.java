package com.ex;

public class PolinromeJava {

	public static void main(String[] args) {
		int number = 454;
		int n = number;
		int sum = 0;
		
		while(number>0) {
			int rem = number%10;
			sum = sum*10+rem;
			number = number/10;
			}
System.out.println(sum);
	}

}
