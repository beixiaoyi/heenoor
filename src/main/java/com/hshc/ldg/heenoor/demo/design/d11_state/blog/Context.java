package com.hshc.ldg.heenoor.demo.design.d11_state.blog;

public class Context {

	private Color color;
	
	Context(Color color){
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public String getColorMsg(){
		if(null != color){
			return color.getMsg();
		}else{
			return null;
		}
	}
	
	public void pushCol(){
		if(null != color){
			color.push(this);
		}
	}
	
	public void pullCol(){
		if(null != color){
			color.pull(this);
		}
	}
}
