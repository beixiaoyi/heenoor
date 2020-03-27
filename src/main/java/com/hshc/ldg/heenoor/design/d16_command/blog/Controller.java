package com.hshc.ldg.heenoor.design.d16_command.blog;

/**
 * invoker 请求者
 * @author maojd
 * @version 创建时间： 2016年11月17日 下午2:44:47
 */
public class Controller {

	private Command comOn,comOff,comChange;
	
	public Controller(Command comOn, Command comOff, Command comChange){
		this.comOn = comOn;
		this.comOff = comOff;
		this.comChange = comChange;
	}
	
	public void turnOn(){
		comOn.execute();
	}
	public void trunOff(){
		comOff.execute();
	}
	public void changeChannel(){
		comChange.execute();
	}
	
}
