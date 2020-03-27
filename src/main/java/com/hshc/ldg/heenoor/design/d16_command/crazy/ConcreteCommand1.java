package com.hshc.ldg.heenoor.design.d16_command.crazy;
/**
 * 命令1
 * @author maojd
 * @version 创建时间： 2016年11月17日 下午2:12:00
 */
public class ConcreteCommand1 extends Command {

	public ConcreteCommand1(Receiver rec) {
		super(rec);
	}

	@Override
	public void execute() {
		super.rec.action1();
	}

}
