package com.hshc.ldg.heenoor.design.d16_command.blog;
/**
 * Receiver 接收者
 * @author maojd
 * @version 创建时间： 2016年11月17日 下午2:33:19
 */
public class TV {

	public void turnOn(){
		System.out.println("打开电视");
	}
	public void trunOff(){
		System.out.println("关闭电视");
	}
	public void changeChannel(int num){
		System.out.println("换台" + num);
	}
	
}
