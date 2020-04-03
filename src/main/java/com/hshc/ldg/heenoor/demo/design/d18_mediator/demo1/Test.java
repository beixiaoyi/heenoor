package com.hshc.ldg.heenoor.demo.design.d18_mediator.demo1;

public class Test {

	public static void main(String[] args) {
		AbstractColleague a = new ColleagueA();
		AbstractColleague b = new ColleagueB();
		
		int num = 2000;
		a.changeNum(num, b);
		System.out.println(a.getNum());
		System.out.println(b.getNum());
		
		System.out.println("----------------------------------------------------------");
		b.changeNum(b.getNum() + 1, a);
		System.out.println(b.getNum());
		System.out.println(a.getNum());
		//aNum /100 = bNum;		bNum * 100 = aNum
		//一个主动发生变化,则动态修改另外一个类.
		
//		类A类B通过直接的关联发生关系，假如我们要使用中介者模式，类A类B之间则不可以直接关联，
//		他们之间必须要通过一个中介者来达到关联的目的。
	}
}
