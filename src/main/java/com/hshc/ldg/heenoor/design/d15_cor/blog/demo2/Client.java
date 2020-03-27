package com.hshc.ldg.heenoor.design.d15_cor.blog.demo2;

public class Client {

	public static void main(String[] args) {
		Handler hp = new ProjectManager();
		Handler hd = new DeptManager();
		Handler hCEO = new GeneralManager();
		
		hp.setSuccessor(hd);
		hd.setSuccessor(hCEO);
		
		hp.handlerRequest("张三", 20D);
		System.out.println("-----------------------------------------------------");

		hp.handlerRequest("张三", 2000D);
		System.out.println("-----------------------------------------------------");
		
		hp.handlerRequest("李四", 200D);
//		张三报销20.0,  项目经理直接通过。
//		-----------------------------------------------------
//		张三报销2000.0,  项目经理管不了了， 提交上级部门
//		张三报销2000.0,  部门经理管不了了， 提交上级部门
//		张三报销2000.0,  CEO直接通过。
//		-----------------------------------------------------
//		李四不是项目负责人， 不给批报销。
	}
}
