package com.hshc.ldg.heenoor.demo.design.d6_simfact_factmethod.blog.simple;

public class BMWFactory {

	public static BMW getCar(int mode){
		BMW bmw = null;
		switch (mode) {
		case 118:
			bmw = new BMW118();
			break;

		case 320:
			bmw = new BMW320();
			break;
		default:
			break;
		}
		return bmw;
	}
	
	public static void main(String[] args) {
		//父类static，子类 static。  父类变量 父类构造器，  子类变量，子类构造器。
		//java默认的在调用子类构造方法前先调用父类的构造方法，如果你没有指定调用父类的哪个构造方法，那么java默认调用父类无参数的构造方法
		BMWFactory.getCar(118);
//		BMW b = null;
	}
}
