package com.hshc.ldg.heenoor.demo.design.d13_observer.blog;

public class ConcreteObserver extends Observer{

	@Override
	public void update(Subject sub) {
		if(null != sub){
			if("ready".equals(sub.getSubState())){
				System.out.println("主题状态发生变化了, ready , 准备行动");
			}else if("go".equals(sub.getSubState())){
				System.out.println("主题状态发生变化了, go, 抓贼");
			}
		}else{
			System.out.println("给我的主题为null，不行动");
		}
	}

}
