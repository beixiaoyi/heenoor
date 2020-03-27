package com.hshc.ldg.heenoor.design.d8_singleton.blog;

public class SingletonHungry {
	private static SingletonHungry instance = new SingletonHungry();
	private SingletonHungry(){}
	
	public static SingletonHungry getInstance(){
		return instance;
	}
}
