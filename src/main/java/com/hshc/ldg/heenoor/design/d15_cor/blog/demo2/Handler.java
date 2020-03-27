package com.hshc.ldg.heenoor.design.d15_cor.blog.demo2;

/**
 * 抽象处理类
 * @author maojd
 * @version 创建时间： 2016年11月14日 下午2:08:36
 */
public abstract class Handler {

	/**
	 * 英[səkˈsesə(r)]   接替的人或事物; 继承人，继任者;
	 */
	private Handler successor;

	public abstract void handlerRequest(String name, Double moneyNum);
	
	public Handler getSuccessor() {
		return successor;
	}

	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}
	
	
}
