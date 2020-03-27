package com.hshc.ldg.heenoor.design.d18_mediator.demo1;

/**
 * 抽象同事类
 * colleague	英[ˈkɒli:g] 同事; 同行; 同僚;
 * @author maojd
 * @version 创建时间： 2016年11月18日 下午5:59:10
 */
public abstract class AbstractColleague {

	private int num = 0;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public abstract void changeNum(int num, AbstractColleague col);
	
}
