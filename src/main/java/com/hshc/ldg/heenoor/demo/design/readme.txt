crazy	http://www.crazyjava.org/
		http://www.crazyit.org/index.php
blog	http://blog.csdn.net/jason0539/article/list/2


maojd总结：
1.适配器模式 adapter
	现有类不满足需求，新增一个类继承（类适配器）、持有（对象适配器）现有类， 进行方法的调用，修改，来满足需求。
2.桥接模式 bridge
	对象之间的关系，不依赖与具体实现，使用抽先类或者接口。来应对不同对象的变化。
	eg： 男人开公交在街道行驶，女人开轿车在高速行驶。人，路，车进行抽先类或者接口，可以更加灵活。
3.门面模式 facade
	客户端使用系统的不同功能，持有不同的子系统对象，调用不同的方法。使用门面类，持有所有的子系统对象，封装子系
	统的功能（一个方法可以调用一个子系统的方法也可以调用多个子系统的方法）。客户端只拥有门面类就可以了。
	eg：医院有挂号，缴费，就医，拿药等等，患者需要来回跑找不同的部门。如果患者可以找接待员一个人干所有事，那太好了...
4.享元模式

5.代理模式

6.工厂模式 简单工厂， 工厂方法， 抽象工厂

7.原型模式 附带clone克隆的简单demo
	