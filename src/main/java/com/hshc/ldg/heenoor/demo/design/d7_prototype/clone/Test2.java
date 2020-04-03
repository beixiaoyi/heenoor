package com.hshc.ldg.heenoor.demo.design.d7_prototype.clone;

public class Test2 {

	public static void main(String[] args) {
		CloObjTest t = new CloObjTest(1);
		System.out.println(t.getI());
		//如果不实现Cloneable接口，克隆对象则报错
		//Exception in thread "main" java.lang.CloneNotSupportedException: d7_prototype.clone.CloObjTest

		//调用不了clone方法
//		CloObjTest t2 = (CloObjTest) t.clone();
//		System.out.println(t2.getI());
	}
}
