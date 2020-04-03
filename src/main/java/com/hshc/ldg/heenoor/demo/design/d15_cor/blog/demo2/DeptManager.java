package com.hshc.ldg.heenoor.demo.design.d15_cor.blog.demo2;

/**
 * 部门经理，可以处理1000以下的报销请求。
 * @author maojd
 * @version 创建时间： 2016年11月14日 下午4:05:31
 */
public class DeptManager extends Handler{

	@Override
	public void handlerRequest(String name, Double moneyNum) {
		if("张三".equalsIgnoreCase(name)){
			if(moneyNum <= 1000  ){
				System.out.println( name + "报销" + moneyNum + ",  部门经理直接通过。");
			}else{
				System.out.println( name + "报销" + moneyNum + ",  部门经理管不了了， 提交上级部门");
				if(null != getSuccessor()){
					getSuccessor().handlerRequest(name, moneyNum);
				}
			}
		}else{
			System.out.println(name + "不是项目负责人， 不给批报销。");
		}
	}

}
