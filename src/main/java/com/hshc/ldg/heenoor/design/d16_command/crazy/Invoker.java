package com.hshc.ldg.heenoor.design.d16_command.crazy;

/**
 * 请求者。 持有不同的命令
 * @author maojd
 * @version 创建时间： 2016年11月17日 下午2:12:26
 */
public class Invoker {

	private Command com;

	public Command getCom() {
		return com;
	}

	public void setCom(Command com) {
		this.com = com;
	}
	
	public void reqExeCom(){
		com.execute();
	}
	
}
