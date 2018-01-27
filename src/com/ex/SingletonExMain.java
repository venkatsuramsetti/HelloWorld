package com.ex;

import java.lang.reflect.Constructor;

public class SingletonExMain {

	public static void main(String[] args) throws Exception {
		SingletonEx singletonEx = SingletonEx.getInstance();
		SingletonEx singletonEx1 = SingletonEx.getInstance();
		
		System.out.println(singletonEx);
		System.out.println(singletonEx1);
		
		
		Constructor<SingletonEx> constructor = SingletonEx.class.getDeclaredConstructor();
		constructor.setAccessible(true);
		SingletonEx s = constructor.newInstance();
		SingletonEx s1 = constructor.newInstance();
		System.out.println(s);
		System.out.println(s1);

	}

}
