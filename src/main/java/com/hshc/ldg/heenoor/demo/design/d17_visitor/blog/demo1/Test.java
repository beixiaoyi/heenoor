package com.hshc.ldg.heenoor.demo.design.d17_visitor.blog.demo1;

class A{
	public void method1(){
		System.out.println("我是A");
	}
	
	public void method2(B b){
		b.showA(this);
	}
}

class B{
	public void showA(A a){
		a.method1();
	}
}

public class Test {

	public static void main(String[] args) {
		A a = new A();
		a.method1();
		a.method2(new B());
//		我是A
//		我是A
		
		
		
//		看一下在类A中，方法method1和方法method2的区别在哪里，
//		方法method1很简单，就是打印出一句“我是A”；
//		方法method2稍微复杂一点，使用类B作为参数，并调用类B的showA方法。
//		再来看一下类B的showA方法，showA方法使用类A作为参数，然后调用类A的method1方法，
//		可以看到，method2方法绕来绕去，无非就是调用了一下自己的method1方法而已，它的运行结果应该也是“我是A”
		
		
//		角色
//		在例子中，对于类A来说，类B就是一个访问者。
//		抽象访问者：抽象类或者接口，声明访问者可以访问哪些元素，具体到程序中就是visit方法中的参数定义哪些对象是可以被访问的。
//		访问者：实现抽象访问者所声明的方法，它影响到访问者访问到一个类后该干什么，要做什么事情。
//		抽象元素类：接口或者抽象类，声明接受哪一类访问者访问，程序上是通过accept方法中的参数来定义的。抽象元素一般有两类方法，一部分是本身的业务逻辑，另外就是允许接收哪类访问者来访问。
//		元素类：实现抽象元素类所声明的accept方法，通常都是visitor.visit(this)，基本上已经形成一种定式了。
//		结构对象：一个元素的容器，一般包含一个容纳多个不同类、不同接口的容器，如List、Set、Map等，在项目中一般很少抽象出这个角色。
		//看demo2
	}
	
}

