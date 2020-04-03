package com.hshc.ldg.heenoor.demo.design.d10_strategy.crazy;

public class Client {

	public static void main(String[] args) {
		Context con = new Context(new StrategyImplA());
		con.doMethod();
		
		con.setStrategy(new StrategyImplB());
		con.doMethod();
		
//		优点
//		1、可以动态的改变对象的行为
//		缺点
//		1、客户端必须知道所有的策略类，并自行决定使用哪一个策略类
//		2、策略模式将造成产生很多策略类
	}
}
