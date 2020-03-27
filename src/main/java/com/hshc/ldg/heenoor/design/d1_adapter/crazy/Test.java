package com.hshc.ldg.heenoor.design.d1_adapter.crazy;

public class Test {

	public static void main(String[] args) {
		Target target = new Adapter(new Adaptee());
//		适配器调用特殊类
//		Adaptee adapteeMethod, 特殊方法
		target.adapteeMethod();
		
//		Adapter adapterMethod,  适配器的方法
		target.adapterMethod();
	}
}
