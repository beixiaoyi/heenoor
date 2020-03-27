package com.hshc.ldg.heenoor.design.d1_adapter.blog;

/**
 * 已存在的、具有特殊功能、但不符合我们既有的标准接口的类
 * @author maojd
 * @version 创建时间： 2016年8月4日 下午5:39:41
 */
public class Adaptee {

	void specificRequest(){
		System.out.println("被适配类具有  特殊功能。。。");
	}
}

/**
 * 目标接口，或称为标准接口  
 */
interface Target{
	public void request();
}

/**
 * 具体目标类，只提供普通功能. 可以忽略这个类，为了和适配器对比
 */
class ConcreteTarget implements Target{

	@Override
	public void request() {
		System.out.println("普通类具有 普通功能。。。");
	}
	
}

/**
 * 适配器。继承被适配类（叫做类适配器），或者持有被适配的对象（对象适配器）。 同时实现标准接口
 */
class Adapter extends Adaptee implements Target{

	@Override
	public void request() {
		super.specificRequest();
	}
	
}

