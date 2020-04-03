package com.hshc.ldg.heenoor.demo.design.d6_simfact_factmethod.blog.factmethod;

public class Test {

	public static void main(String[] args) {
		
		FactoryBMW fb118 = new FactoryBMW118();
		fb118.createCar();
		
		
		FactoryBMW320 fb320 = new FactoryBMW320();
		fb320.createCar();
		//这个对比简单工厂，虽然开放、封闭原则遵守了，但是 如果需要其他宝马车型就需要更新客户端代码。
		//当产品种类非常多时，会出现大量的与之对应的工厂对象，这不是我们所希望的。
		
		
//抽象工厂模式是工厂方法模式的升级版本，他用来创建一组相关或者相互依赖的对象。 
//对比 工厂方法模式： 如果一个宝马车需要不同的空调，引擎。 那么宝马320工厂不仅仅生产320车就可以了，需要生产320空调，320引擎等一系列的产品。

		//一句话：
//		简单工厂，一个工厂生产多种产品。只有一个工厂 	switch case Fact --> ProA,ProB,ProC
//		工厂方法，一个工厂只生产一种产品。存在多个工厂	FactA -->FactB, ProductA --> ProB
//		抽象工厂，一个工厂生产多种产品。一个存在多个工厂	Fact1 --> （ProA1 ProB1）, Fact2 --> (ProA2 ProB2)
		
		
//        //生产宝马320系列配件  
//        FactoryBMW factoryBMW320 = new FactoryBMW320();    
//        factoryBMW320.createEngine();  
//        factoryBMW320.createAircondition();  
//            
//        //生产宝马523系列配件    
//        FactoryBMW factoryBMW523 = new FactoryBMW523();    
//        factoryBMW523.createEngine();  
//        factoryBMW523.createAircondition();  
	}
}
