package com.hshc.ldg.heenoor.design.d11_state.crazy;

public class Context {

	private Weather wea;
	
	public Context(Weather wea){
		this.wea = wea;
	}
	
	public String getWeaMsg(){
		if(wea != null){
			return wea.getWeatherMessage();
		}else{
			return null;
		}
	}

	public Weather getWea() {
		return wea;
	}

	public void setWea(Weather wea) {
		this.wea = wea;
	}
	
	
	
}
