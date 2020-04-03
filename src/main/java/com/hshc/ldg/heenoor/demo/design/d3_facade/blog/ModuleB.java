package com.hshc.ldg.heenoor.demo.design.d3_facade.blog;

public class ModuleB {

	public void testB(){
		System.out.println("B模块的方法");
	}
	
	/** 其他子模块之间相互调用的方法 **/
	private void a2(){}
	private void a3(){}
}
