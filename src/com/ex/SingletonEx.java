package com.ex;

public class SingletonEx {
	static SingletonEx instance = null;

	private SingletonEx() {

	}
	
	public static synchronized SingletonEx getInstance() {
		if (instance == null)
			instance= new SingletonEx();
		
			return instance;
	}

}
