package com.hshc.ldg.heenoor.demo.design.d15_cor.blog.demo2;

/**
 * CEO 
 * general	英[ˈdʒenrəl] 普遍的; 大致的; 综合的; 总的，全体的;
 * @author maojd
 * @version 创建时间： 2016年11月14日 下午4:09:44
 */
public class GeneralManager extends Handler{

	@Override
	public void handlerRequest(String name, Double moneyNum) {
		if("张三".equalsIgnoreCase(name)){
			if(moneyNum <= 10000  ){
				System.out.println( name + "报销" + moneyNum + ",  CEO直接通过。");
			}else{
				System.out.println( name + "报销" + moneyNum + ",  CEO管不了了， 提交上级部门？？");
				if(null != getSuccessor()){
					getSuccessor().handlerRequest(name, moneyNum);
				}
			}
		}else{
			System.out.println(name + "不是项目负责人， 不给批报销。");
		}
	}

}
