package com.hshc.ldg.heenoor.design.d16_command.blog;

public class CommandChange implements Command{

	private TV tv;
	int channel = 0;
	
	public CommandChange(TV tv, int channel){
		this.tv = tv;
		this.channel = channel;
	}
	
	@Override
	public void execute() {
		if(null != tv){
			tv.changeChannel(channel);
		}
	}

}
