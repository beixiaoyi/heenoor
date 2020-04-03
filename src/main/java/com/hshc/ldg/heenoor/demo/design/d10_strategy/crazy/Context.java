package com.hshc.ldg.heenoor.demo.design.d10_strategy.crazy;
/**
 * 客户端要持用的数据内容
 * @author maojd
 * @version 创建时间： 2016年10月14日 下午3:36:16
 */
public class Context {
	Strategy strategy;
	public Context(Strategy strategy){
		this.strategy = strategy;
	}
	
	public void doMethod(){
		if(null != strategy){
			strategy.method();
		}else{
			System.out.println("策略对象为空，无法运算");
		}
	}

	public Strategy getStrategy() {
		return strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	
	
}
