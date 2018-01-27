package com.ex;

 class A {
	static {
		System.out.println("A Static");
	}
	{
		System.out.println("A Instance");

	}
	A() {
		System.out.println("A Constructor");
	}
}
 class B extends A {
	static {
		System.out.println("B Static");
	}
	{
		System.out.println("B Instance");

	}
	B() {
		System.out.println("B Constructor");
	}
}


public class ConstructorDemo1 {
	public static void main(String[] args) {
	B b = new B();
	}

}
