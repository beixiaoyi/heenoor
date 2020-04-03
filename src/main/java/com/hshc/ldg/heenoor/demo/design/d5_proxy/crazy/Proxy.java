package com.hshc.ldg.heenoor.demo.design.d5_proxy.crazy;

public class Proxy {

	private Subject sub;
	
	
	public void request() {
		if(null != sub){
			sub.request();
		}
	}
	
	public Subject getSub() {
		return sub;
	}



	public void setSub(Subject sub) {
		this.sub = sub;
	}



	public static void main(String[] args) {
		Subject sub1 = new RealSubject("张三");
		Subject sub2 = new RealSubject("李四");
		
		Proxy p = new Proxy();
		
		p.setSub(sub1);//给张三做代理
		p.request();
		
		p.setSub(sub2);//给李四做代理
		p.request();
	}
}
