package com.hshc.ldg.heenoor.demo.design.d3_facade.blog;

public class Client {

	public static void main(String[] args) {
		Facade fac = new Facade();
		fac.testA();
		fac.testB();
		
//		Facade类其实相当于A、B、C模块的外观界面，有了这个Facade类，
//		那么客户端就不需要亲自调用子系统中的A、B、C模块了，也不需要知道系统内部的实现细节，
//		甚至都不需要知道A、B、C模块的存在，客户端只需要跟Facade类交互就好了，
//		从而更好地实现了客户端和子系统中A、B、C模块的解耦，让客户端更容易地使用系统。
		
		//例如 moduleA B的私有方法 a1() a2()
//		使用门面模式还有一个附带的好处，就是能够有选择性地暴露方法。
//		一个模块中定义的方法可以分成两部分，一部分是给子系统外部使用的，一部分是子系统内部模块之间相互调用时使用的。
//		有了Facade类，那么用于子系统内部模块之间相互调用的方法就不用暴露给子系统外部了。
		
		
//		门面模式的优点
//
//		　　门面模式的优点：
//
//		　　●　　松散耦合
//
//		　　门面模式松散了客户端与子系统的耦合关系，让子系统内部的模块能更容易扩展和维护。
//
//		　　●　　简单易用
//
//		　　门面模式让子系统更加易用，客户端不再需要了解子系统内部的实现，也不需要跟众多子系统内部的模块进行交互，只需要跟门面类交互就可以了。
//
//		　　●　　更好的划分访问层次
//
//		　　通过合理使用Facade，可以帮助我们更好地划分访问的层次。有些方法是对系统外的，有些方法是系统内部使用的。把需要暴露给外部的功能集中到门面中，这样既方便客户端使用，也很好地隐藏了内部的细节。
//
//
//		 
//
//		作者：jason0539
//
//		微博：http://weibo.com/2553717707
//
//		博客：http://blog.csdn.net/jason0539（转载请说明出处）
	}
	
}
