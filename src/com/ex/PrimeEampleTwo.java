/**
 * 
 */
package com.ex;


/**
 * @author vsuramsetti
 *
 */
public class PrimeEampleTwo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num = 10;
		int m = 0, i;
		for (i = 2; i <= num; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					m = 1;
					break;
				} else {
					m = 0;
				}
			}
			if (m == 0) {
				System.out.println(i);
			}
		}
	}
}