适配器模式
 概述
    将一个类的接口转换成客户希望的另外一个接口。Adapter模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。
 适用性
    1.你想使用一个已经存在的类，而它的接口不符合你的需求。

    2.你想创建一个可以复用的类，该类可以与其他不相关的类或不可预见的类（即那些接口
      可能不一定兼容的类）协同工作。

    3.（仅适用于对象Adapter）你想使用一些已经存在的子类，但是不可能对每一个都进行
      子类化以匹配它们的接口。对象适配器可以适配它的父类接口。
 参与者
    1.Target
      定义Client使用的与特定领域相关的接口。

    2.Client
      与符合Target接口的对象协同。

    3.Adaptee
      定义一个已经存在的接口，这个接口需要适配。

    4.Adapter
      对Adaptee的接口与Target接口进行适配

允许自由传播，但请保留页脚版权信息
Copyright © 2008 Angus Young
疯狂Java联盟：http://www.crazyjava.org 


maojd
	适配器模式其实就是由于现有的类满足不了需求， 新建一个类， 继承或者持有现有类。对方法进行加工，满足需求就可以了。
	详细参看： adapter1.blog.Client.java
	博客：http://blog.csdn.net/mao1055229269
	