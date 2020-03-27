package com.hshc.ldg.heenoor.design.d14_iterator.blog;

public class Client {

	public static void main(String[] args) {
		
		Aggregate ag = new AggregateImpl();
		ag.add("a");
		ag.add("b");
		ag.add("c");
		ag.add("小明");
		
		//ag.remove("b");
		
		Iterator it = ag.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		//原blog地址		 23种设计模式（13）：迭代器模式 		http://blog.csdn.net/zhengzhb/article/details/7610745
		
//		上面的代码中，Aggregate是容器类接口，大家可以想象一下Collection，List，Set等，Aggregate就是他们的简化版，
//		容器类接口中主要有三个方法：添加对象方法add、删除对象方法remove、取得迭代器方法iterator。
//		Iterator是迭代器接口，主要有两个方法：取得迭代对象方法next，判断是否迭代完成方法hasNext，
//		大家可以对比java.util.List和java.util.Iterator两个接口自行思考。
	}
	
}
