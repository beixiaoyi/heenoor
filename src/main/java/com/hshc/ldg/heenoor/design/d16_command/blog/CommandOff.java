package com.hshc.ldg.heenoor.design.d16_command.blog;


public class CommandOff implements Command {
	
	private TV tv;
	
	public CommandOff(TV tv){
		this.tv = tv;
	}
	
	@Override
	public void execute() {
		if(null != tv){
			tv.trunOff();
		}
	}

}
