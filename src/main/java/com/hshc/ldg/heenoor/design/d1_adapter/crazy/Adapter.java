package com.hshc.ldg.heenoor.design.d1_adapter.crazy;

/**
 * 适配器。实现标准接口
 * @author maojd
 * @version 创建时间： 2016年8月4日 下午4:45:11
 */
public class Adapter implements Target{

	/**
	 * 受改造者。具有特殊功能的类
	 */
	private Adaptee adaptee;
	
	public Adapter(Adaptee adaptee){
		this.adaptee = adaptee;
	}
	
	/**
	 * 特殊方法
	 */
	@Override
	public void adapteeMethod() {
		System.out.println("适配器调用特殊类");
		adaptee.adapteeMethod();
	}

	/**
	 * 适配器的方法
	 */
	@Override
	public void adapterMethod() {
		System.out.println("Adapter adapterMethod,  适配器的方法");
	}

}
