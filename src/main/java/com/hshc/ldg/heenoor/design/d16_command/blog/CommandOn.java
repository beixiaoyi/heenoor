package com.hshc.ldg.heenoor.design.d16_command.blog;

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
