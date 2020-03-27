package com.hshc.ldg.heenoor.design.d13_observer.blog;

public class TestObs {

	public static void main(String[] args) {
		/**
		 * blog原文地址： http://www.cnblogs.com/wangjq/archive/2012/07/12/2587966.html
		 */
		Observer obs1 = new ConcreteObserver();
		
		Subject sub = new ConcreteSubject();
		sub.attach(obs1);
		
		sub.setSubState("ready");
		//发送通知 ready
		sub.sendState();
		
		sub.setSubState("go");
		//发送通知 go
		sub.sendState();
		
		//移除观察者，发送通知。 常规一般不止一个观察者
		sub.detach(obs1);
		sub.sendState();
	}
}
