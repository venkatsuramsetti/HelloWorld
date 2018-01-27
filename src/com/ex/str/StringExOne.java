package com.ex.str;

public class StringExOne {

	public static void main(String[] args) {
		String str = "Hello";
		char[] strArr = str.toCharArray();
		char[] newArr = new char[str.length()];
		for(int position=0; position<str.length(); position++) {
			newArr[position] = str.charAt(position);
		}
		System.out.println("charArray::" +strArr.length);
		System.out.println("newArray::" +newArr.length);
		for(int i=0;i<str.length();i++){
			System.out.println("charArray::" +strArr[i]);
			System.out.println("newArray::" +newArr[i]);
		}
	}
}
