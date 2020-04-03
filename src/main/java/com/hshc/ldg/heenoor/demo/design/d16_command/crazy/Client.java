package com.hshc.ldg.heenoor.demo.design.d16_command.crazy;

public class Client {

	public static void main(String[] args) {
		//请求者
		Invoker inv = new Invoker();
		//接收者
		Receiver rec = new Receiver();
		inv.setCom(new ConcreteCommand1(rec));
		inv.reqExeCom();
		
		inv.setCom(new ConcreteCommand2(rec));
		inv.reqExeCom();
//		接收者执行 action1
//		接收者执行 action2
		
		//maojd
//命令模式，  定义 接收者（receiver），具有执行不同行为的能力
//定义不同的命令（command），调用receiver的不同方法。
//	定义请求者（invoker），持有不同的命令对象。     invoker根据客户端的不同请求，command调用receiver的不同方法
	}
}
