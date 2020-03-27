package com.hshc.ldg.heenoor.design.d18_mediator.demo1;

/**
 * A类的数字修改, B类 aNum/100 随时变化,  B类如果数字被修改,A类数字=bNum*100
 * @author maojd
 * @version 创建时间： 2016年11月18日 下午6:04:11
 */
public class ColleagueA extends AbstractColleague{

	@Override
	public void changeNum(int num, AbstractColleague col) {
		this.setNum(num);
		col.setNum(num/100);
	}

}
