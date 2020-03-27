package com.hshc.ldg.heenoor.design.d15_cor.blog.demo1;

public class ConcreteHandler extends Handler {

	@Override
	public void handlerRequest() {
		System.out.println("handlerRequest 处理请求");
		if(getSuccessor() != null){
			System.out.println("next");
			getSuccessor().handlerRequest();
		}else{
			System.out.println("end");
		}
	}

}
