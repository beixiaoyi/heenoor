package com.hshc.ldg.heenoor.design.d15_cor.blog.demo1;


public class Client {

	public static void main(String[] args) {
		
		//原blog地址：	http://blog.csdn.net/jason0539/article/details/45091639
		Handler h1 = new ConcreteHandler();
		Handler h2 = new ConcreteHandler();
		h1.setSuccessor(h2);
		
		h1.handlerRequest();
		
//		handlerRequest 处理请求
//		next
//		handlerRequest 处理请求
//		end
	}
}
