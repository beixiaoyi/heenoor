package com.hshc.ldg.heenoor.demo.design.d3_facade.blog;

public class Facade {

	private ModuleA ma = new ModuleA();
	private ModuleB mb = new ModuleB();
	
	public void testA(){
		ma.testA();
	}

	public void testB(){
		mb.testB();
	}
	
	private void testC(){
		
	}
}
