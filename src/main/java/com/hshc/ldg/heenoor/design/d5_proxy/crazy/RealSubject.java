package com.hshc.ldg.heenoor.design.d5_proxy.crazy;

public class RealSubject implements Subject{

	private String name;
	
	
	
	public RealSubject(String name) {
		this.name = name;
	}



	@Override
	public void request() {
		System.out.println(name + "真正的实现");
	}

}
