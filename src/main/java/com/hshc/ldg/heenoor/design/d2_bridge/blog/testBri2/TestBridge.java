package com.hshc.ldg.heenoor.design.d2_bridge.blog.testBri2;

abstract class AbstractRoad{
	AbstractCar car;
	abstract void run();
}

abstract class AbstractCar{
	abstract void run();
}

class Street extends AbstractRoad{
	@Override
	void run() {
		car.run();
		System.out.println("街道上跑");
	}
}
class SpeedWay extends AbstractRoad{
	@Override
	void run() {
		car.run();
		System.out.println("高速上跑");
	}
}

class Car extends AbstractCar{
	@Override
	void run() {
		System.out.println("小汽车");
	}
}
class Bus extends AbstractCar{
	@Override
	void run() {
		System.out.println("公交车");
	}
}

public class TestBridge {

	public static void main(String[] args) {
//		小汽车
//		街道上跑
		AbstractRoad street = new Street();
		street.car = new Car();
		street.run();
		
//		公交车
//		高速上跑
		AbstractRoad speed = new SpeedWay();
		speed.car = new Bus();
		speed.run();
		
//		可以看到，通过对象组合的方式，Bridge 模式把两个角色之间的继承关系改为了耦合的关系，从而使这两者可以从容自若的各自独立的变化，这也是Bridge模式的本意。
//	      这样增加了客户程序与路与汽车的耦合。其实这样的担心是没有必要的，因为这种耦合性是由于对象的创建所带来的，完全可以用创建型模式去解决。在应用时结合创建型设计模式来处理具体的问题。
		//修改设计模式，增加人类。  男人、女人 开着 小汽车、公交车 在 高速、街道上跑
	}
}