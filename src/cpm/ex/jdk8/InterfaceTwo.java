package cpm.ex.jdk8;

public interface InterfaceTwo {

	void method2();

	default void log(String str) {
		System.out.println("I2 logging::" + str);
	}

}
