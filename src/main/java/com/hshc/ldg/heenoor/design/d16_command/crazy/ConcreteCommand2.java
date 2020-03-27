package com.hshc.ldg.heenoor.design.d16_command.crazy;

/**
 * 命令2
 * @author maojd
 * @version 创建时间： 2016年11月17日 下午2:12:09
 */
public class ConcreteCommand2 extends Command{
	

	public ConcreteCommand2(Receiver rec) {
		super(rec);
	}

	@Override
	public void execute() {
		super.rec.action2();
	}

}
