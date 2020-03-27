package com.hshc.ldg.heenoor.design.d4_flyweight.crazy;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

	private static Map<String, Flyweight> fctMap = new HashMap<String, Flyweight>();
	
	public static Flyweight getFlyweight(String name){
		if(fctMap.get(name) == null){
			Flyweight fly = new ConcreteFlyweight(name);
			fctMap.put(name, fly);
			return fly;
		}else{
			return fctMap.get(name);
		}
	}
	public static int getFlyTotal(){
		return fctMap.size();
	}
}
