package com.hshc.ldg.heenoor.demo.design.d2_bridge.blog.testBri2Update;


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

/** 人在路上，开车(人有路，路上有车) **/
abstract class Person{
	AbstractRoad road;
	abstract void run();
}

class Man extends Person{
	void run(){
		System.out.println("男人");
		road.run();
	}
}

class Woman extends Person{
	void run(){
		System.out.println("女人");
		road.run();
	}
}

/**
 * 桥接模式（Bridge）来做(多维度变化); 
 * <br>结合上面的例子,增加一个维度"人",不同的人开着不同的汽车在不同的路上行驶(三个维度);
 * <br>结合上面增加一个类"人",并重新调用.
 * @author maojd
 * @version 创建时间： 2016年8月8日 下午3:07:05
 */
public class TestBridgeUpdate {

	public static void main(String[] args) {
//		女人
//		小汽车
//		街道上跑
		AbstractRoad street = new Street();
		street.car = new Car();
		Person woman = new Woman();
		woman.road = street;
		
		woman.run();
		
//		男人
//		公交车
//		高速上跑
		AbstractRoad speed = new SpeedWay();
		speed.car = new Bus();
		Person man = new Man();
		man.road = speed;
		man.run();
		
		
//		将抽象部分与实现部分分离，使它们都可以独立的变化。
//        ——《设计模式》GOF
		
//		效果及实现要点：
//		1．Bridge模式使用“对象间的组合关系”解耦了抽象和实现之间固有的绑定关系，使得抽象和实现可以沿着各自的维度来变化。
//		2．所谓抽象和实现沿着各自维度的变化，即“子类化”它们，得到各个子类之后，便可以任意它们，从而获得不同路上的不同汽车。
//		3．Bridge模式有时候类似于多继承方案，但是多继承方案往往违背了类的单一职责原则（即一个类只有一个变化的原因），复用性比较差。Bridge模式是比多继承方案更好的解决方法。
//		4．Bridge模式的应用一般在“两个非常强的变化维度”，有时候即使有两个变化的维度，但是某个方向的变化维度并不剧烈——换言之两个变化不会导致纵横交错的结果，并不一定要使用Bridge模式。
//
//		适用性：
//		   在以下的情况下应当使用桥梁模式：
//		1．如果一个系统需要在构件的抽象化角色和具体化角色之间增加更多的灵活性，避免在两个层次之间建立静态的联系。 
//		2．设计要求实现化角色的任何改变不应当影响客户端，或者说实现化角色的改变对客户端是完全透明的。
//		3．一个构件有多于一个的抽象化角色和实现化角色，系统需要它们之间进行动态耦合。 
//		4．虽然在系统中使用继承是没有问题的，但是由于抽象化角色和具体化角色需要独立变化，设计要求需要独立管理这两者。
//		总结：
//		      Bridge模式是一个非常有用的模式，也非常复杂，它很好的符合了开放-封闭原则和优先使用对象，而不是继承这两个面向对象原则。
//
//		 
//
//		作者：jason0539
//
//		微博：http://weibo.com/2553717707
//
//		博客：http://blog.csdn.net/jason0539（转载请说明出处）
		
//		http://blog.csdn.net/jason0539/article/details/22568865
	}
	
}
