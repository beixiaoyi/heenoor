package com.hshc.ldg.heenoor.demo.design.d15_cor.blog.demo2;

/**
 * 项目经理，可以处理500以下的报销请求。
 * @author maojd
 * @version 创建时间： 2016年11月14日 下午3:07:51
 */
public class ProjectManager extends Handler{

	@Override
	public void handlerRequest(String name, Double moneyNum) {
		if("张三".equalsIgnoreCase(name)){
			if(moneyNum <= 500  ){
				System.out.println( name + "报销" + moneyNum + ",  项目经理直接通过。");
			}else{
				System.out.println( name + "报销" + moneyNum + ",  项目经理管不了了， 提交上级部门");
				if(null != getSuccessor()){
					getSuccessor().handlerRequest(name, moneyNum);
				}
			}
		}else{
			System.out.println(name + "不是项目负责人， 不给批报销。");
		}
	}

}
