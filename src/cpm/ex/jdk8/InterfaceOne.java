/**
 * 
 */
package cpm.ex.jdk8;

/**
 * @author vsuramsetti
 *
 */
public interface InterfaceOne {
	
	void method1(String str);
	
	default void log(String str) {
		System.out.println("I1 logging::" + str);
	}
	
	static boolean isNull(String str) {
		System.out.println("Interface Null Check");

		return str == null ? true : "".equals(str) ? true : false;
	}
	
}
