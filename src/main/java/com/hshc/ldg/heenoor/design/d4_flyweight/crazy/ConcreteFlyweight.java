package com.hshc.ldg.heenoor.design.d4_flyweight.crazy;

public class ConcreteFlyweight implements Flyweight{

	private String name;
	
	
	
	public ConcreteFlyweight(String name) {
		this.name = name;
	}



	@Override
	public void action() {
		System.out.println(name + ", 执行一些动作");
	}

}
