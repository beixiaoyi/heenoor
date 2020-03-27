package com.hshc.ldg.heenoor.design.d7_prototype.blog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProTest {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>(Arrays.asList(new String[]{"xxx","xx2"}));
		//切忌不可以使用 list2 = Arrays.asList(arr); asList返回的不是ArrayList调用add remove均报错
		
		Prototype p1 = new Prototype(20, "maojd", list);
		System.out.println(p1.toString());
		System.out.println("p1.age=" + p1.getAge());
		System.out.println("p1.list=" + p1.getList());
		
		
		//注意： clone不调用构造方法，所以 原型模式与单例模式冲突
		
		System.out.println("-----------------------");
		Prototype p2 = p1.clone();
		System.out.println(p2.toString());
		System.out.println("p2.age=" + p2.getAge());
		System.out.println("p2.list=" + p2.getList());
		
		//注意2， 如果在Prototype.clone的方法中，不手动克隆list，则为浅克隆，即只是克隆对象内存地址。 修改p1的list p2的list会被一起修改。
		System.out.println("--------------------删除list一个元素");
		p1.getList().remove(0);
		System.out.println("p1.list=" + p1.getList());
		System.out.println("p2.list=" + p2.getList());

		//注意3, 基础数据类型和基础类的封装类都为深复制。 String 和 数组、容器对象、引用对象等都是复制地址，这就是浅拷贝。
		//但是String给的假象为深复制。  http://www.cnblogs.com/carbs/archive/2012/06/26/2564373.html
		
		System.out.println("-------------修改p1的name");
		p1.setName("maojdupdate");
		System.out.println(p1.getName());
		System.out.println(p2.getName());

//		克隆总结
//
//		1、基本数据类型能自动实现深度clone。
//		2、String是一个例外。
//		   但对于我们编程来说可以和操作基本数据类型一样做，基本没影响。大大方便了我们的编程。
//
//		   String类型的变量clone后的表现好象也实现了深度clone，但其实只是一个假象。
//		   因为执行 p1.name = "new";语句时，它作用相当于生成了一个新的string类型，然后又赋回给p1.name。
//		   这是因为string被sun公司的工程师写成了一个不可更改的类（immutable class），在所有string类中的函数都不能更改自身的值。
//
//		==> 这告诉我们支持更方便实现克隆的一种途径：将自己定义的类编写为不可更改。
//
//		3、StringBuffer需要做特殊处理
//		   String和StringBuffer有区别。
//		   可以借鉴类似技巧对StringBuffer型的变量实现克隆效果：sb=new StringBuffer(sb.toString());
		
		
//		结果：
//		constructmethod
//		20
//		20
	}
}
