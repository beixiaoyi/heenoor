package com.hshc.ldg.heenoor.design.d16_command.crazy;

/**
 * 命令抽象类。 持有接收者（执行者）对象
 * @author maojd
 * @version 创建时间： 2016年11月17日 下午2:11:34
 */
public abstract class Command {

	protected Receiver rec;
	
	public abstract void execute();
	
	public Command(Receiver rec) {
		this.rec = rec;
	}
	
}
