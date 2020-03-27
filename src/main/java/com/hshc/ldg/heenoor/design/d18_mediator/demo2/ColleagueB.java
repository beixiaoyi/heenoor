package com.hshc.ldg.heenoor.design.d18_mediator.demo2;

/**
 * A类的数字修改, B类 aNum/100 随时变化,  B类如果数字被修改,A类数字=bNum*100
 * @author maojd
 * @version 创建时间： 2016年11月18日 下午6:04:11
 */
public class ColleagueB extends AbstractColleague{

	@Override
	public void changeNum(int num, AbstractMediator med) {
		this.setNum(num);
		med.affectA();
	}

}
