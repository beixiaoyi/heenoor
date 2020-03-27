package com.hshc.ldg.heenoor.design.d2_bridge.blog.testBri1No;
/** 路上 **/
class road{
	void run(){
		System.out.println("路");
	}
	
	public static void main(String[] args) {
		CarOnStreet caTree = new CarOnStreet();
		caTree.run();
	}
}

/** 街道上跑 **/
class Street extends road{
	void run(){
		System.out.println("街道上跑");
	}
}
/** 高速 **/
class SpeedWay extends road{
	void run(){
		System.out.println("高速上跑");
	}
}

class CarOnStreet extends Street{
	void run(){
		System.out.println("小汽车街道上跑");
	}
}
class CarOnSpeedWay extends SpeedWay{
	void run(){
		System.out.println("小汽车高速上跑");
	}
}

class BusOnStreet extends Street{
	void run(){
		System.out.println("公交在街道上跑");
	}
}
class BusOnSpeedWay extends SpeedWay{
	void run(){
		System.out.println("公交在高速上跑");
	}
}

public class TestNoBridge {

	public static void main(String[] args) {
		CarOnStreet caTree = new CarOnStreet();
		caTree.run();
		
		BusOnStreet busOnStree = new BusOnStreet();
		busOnStree.run();
		
//		缺点:
//		     但是我们说这样的设计是脆弱的，仔细分析就可以发现，它还是存在很多问题，首先它在遵循开放-封闭原则的同时，违背了类的单一职责原则，即一个类只有一个引起它变化的原因，而这里引起变化的原因却有两个，即路类型的变化和汽车类型的变化；其次是重复代码会很多，不同的汽车在不同的路上行驶也会有一部分的代码是相同的；
//
//		再次是类的结构过于复杂，继承关系太多，难于维护，最后最致命的一点是扩展性太差。如果变化沿着汽车的类型和不同的道路两个方向变化，我们会看到这个类的结构会迅速的变庞大。
	}
}





