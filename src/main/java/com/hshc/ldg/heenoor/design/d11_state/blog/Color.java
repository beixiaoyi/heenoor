package com.hshc.ldg.heenoor.design.d11_state.blog;

public abstract class Color {

	private String msg;

	Color(String msg){
		this.msg = msg;
	}
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public abstract Context push(Context con);
	
	public abstract Context pull(Context con);
	
}
