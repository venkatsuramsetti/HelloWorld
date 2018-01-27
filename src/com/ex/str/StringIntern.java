package com.ex.str;

public class StringIntern {

	public static void main(String[] args) {
		String strPool = "Hello";
		String strObj = new String("Hello");
		String strIntern = strObj.intern();
		System.out.println("strPool == strObj::" +(strPool==strObj));
		System.out.println("strPool == strIntern::" +(strPool==strIntern));
		System.out.println("strIntern == strObj::" +(strIntern==strObj));
	}

}
