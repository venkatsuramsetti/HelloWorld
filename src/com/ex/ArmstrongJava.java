package com.ex;

public class ArmstrongJava {

	public static void main(String[] args) {
		int number = 153;
		int n = number;
		int sum = 0;
		
		while(number>0) {
			int rem = number%10;
			sum = sum+rem*rem*rem;
			number = number/10;
			}
System.out.println(sum);
	}

}
