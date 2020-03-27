package com.hshc.ldg.heenoor.design.d1_adapter.crazy;

/**
 * 标准接口
 * @author maojd
 * @version 创建时间： 2016年8月4日 下午4:35:20
 */
public interface Target {

	/**
	 * 有特殊功能，但是需要适配的方法。 
	 */
	void adapteeMethod();
	
	/**
	 * 适配后的方法
	 */
	void adapterMethod();
}
