package com.ex;


class SuperClass {
	
	public void disp() {
		System.out.println("Super Class");
	}
	
	public void display() {
		disp();
		System.out.println("Super Class Display");
	}
	
}

class SubClassOne extends SuperClass {
	
	public void disp() {
		super.display();
		System.out.println("Sub Class");
	}
	
}

class SubClassTwo extends SuperClass {
	
	public void disp() {
		System.out.println("SUb Class");
	}
	
}
public class InheritanceOne {

	public static void main(String[] args) {
		SuperClass superClass = new SubClassOne();
		superClass.disp();

	}

}
