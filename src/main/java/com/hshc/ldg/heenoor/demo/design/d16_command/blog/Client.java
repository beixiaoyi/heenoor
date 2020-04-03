package com.hshc.ldg.heenoor.demo.design.d16_command.blog;

public class Client {

	public static void main(String[] args) {
		TV tv = new TV();
		Command comOn = new CommandOn(tv);
		Command comOff = new CommandOff(tv);
		Command comChannel = new CommandChange(tv, 12);
		
		Controller control = new Controller(comOn, comOff, comChannel);
		control.turnOn();
		control.changeChannel();
		control.trunOff();
//		关闭电视
//		换台12
//		关闭电视
		
	}
	
	
}
