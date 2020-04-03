package com.hshc.ldg.heenoor.demo.design.d3_facade.crazy;

public class Facade {

	private IServiceA serA;
	private IServiceB serB;
	
	public Facade() {
		serA = new ServiceA();
		serB = new ServiceB();
	}
	
	public void test1(){
		serA.testA();
	}
	public void test2(){
		System.out.println("test2----------------挂号并缴费");
		serA.testA();
		serB.testB();
	}
}
