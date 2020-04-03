package com.hshc.ldg.heenoor.demo.design.d16_command.blog;

public class CommandOn implements Command{

	private TV tv;
	
	public CommandOn(TV tv){
		this.tv = tv;
	}
	
	@Override
	public void execute() {
		if(null != tv){
			tv.trunOff();
		}
	}

}
