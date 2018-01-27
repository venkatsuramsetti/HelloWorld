package cpm.ex.jdk8;

public class OneImpl  implements One {

	public boolean isNull(String str) {
		System.out.println("Impl Null Check");

		return str == null ? true : false;
	}
	
	public static void main(String args[]){
		OneImpl obj = new OneImpl();
		obj.print("");
		obj.isNull("abc");
	}

}
