package com.hshc.ldg.heenoor.demo.design.d4_flyweight.crazy;

public class TestFlyweight {

	public static void main(String[] args) {
		Flyweight f1 = FlyweightFactory.getFlyweight("baidu");
		Flyweight f2 = FlyweightFactory.getFlyweight("baidu");
		System.out.println(f1 == f2);
		
		Flyweight f3 = FlyweightFactory.getFlyweight("google");
		Flyweight f4 = FlyweightFactory.getFlyweight("baidu");
		
		f1.action();
		f2.action();
		f3.action();
		f4.action();
		
		System.out.println(FlyweightFactory.getFlyTotal());
		
	}
}
