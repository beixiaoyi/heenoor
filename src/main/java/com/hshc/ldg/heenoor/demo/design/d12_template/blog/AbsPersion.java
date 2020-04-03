package com.hshc.ldg.heenoor.demo.design.d12_template.blog;

/**
 * 抽象类（学生、教师）
 * @author maojd
 * @version 创建时间： 2016年10月17日 下午4:48:02
 */
public abstract class AbsPersion {

	public void goToSchool(){
		this.preDress();	
		this.preEat();
		this.takeThings();
	}
	
	public abstract void preEat();
	public abstract void preDress();
	public abstract void takeThings();
}
