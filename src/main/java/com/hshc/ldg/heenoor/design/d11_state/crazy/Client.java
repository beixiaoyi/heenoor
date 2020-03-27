package com.hshc.ldg.heenoor.design.d11_state.crazy;

public class Client {

	public static void main(String[] args) {
		Context con = new Context(new WeatherRain());
		
		System.out.println(con.getWeaMsg());
		
		con.setWea(new WeatherSun());
		System.out.println(con.getWeaMsg());
		
		/**
		 * 这个demo按照策略模式的实现。 
		 * 实际按照状态模式的理解， 修改Weather的状态应该集成在Context的其他方法中。
		 * 
		 */
	}
}
