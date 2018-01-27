/**
 * 
 */
package cpm.ex.jdk8;

/**
 * @author vsuramsetti
 *
 */
public class Java8ImplInterface implements InterfaceOne, InterfaceTwo {

	@Override
	public void method2() {
		
	}

	@Override
	public void method1(String str) {
		
	}
	
	@Override
	public void log(String str){
		System.out.println("MyClass logging::"+str);
		// to cal the interface specific method
		//InterfaceOne.super.log(str);
	}
	
	public boolean isNull(String str) {
		System.out.println("Impl Null Check");

		return str == null ? true : false;
	}


}
