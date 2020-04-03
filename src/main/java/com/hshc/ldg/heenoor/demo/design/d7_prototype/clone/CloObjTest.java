package com.hshc.ldg.heenoor.demo.design.d7_prototype.clone;

public class CloObjTest implements Cloneable{

	private int i;
	
	protected int i2;
	
	public int i3;
	
	public CloObjTest(int i){
		this.i = i;
	}
	
	
	public int getI() {
		return i;
	}


	public void setI(int i) {
		this.i = i;
	}


	public static void main(String[] args) throws CloneNotSupportedException {
		CloObjTest t = new CloObjTest(1);
		System.out.println(t.getI());
		//注意1：如果不实现Cloneable接口，克隆对象则报错. 注意2 
		//Exception in thread "main" java.lang.CloneNotSupportedException: d7_prototype.clone.CloObjTest
		//注意2：clone方法为protected在其他类中是无法调用的。想要调用需要重写clone方法
		CloObjTest t2 = (CloObjTest) t.clone();
		System.out.println(t2.getI());
	}
}
