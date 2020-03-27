package com.hshc.ldg.heenoor.design.d17_visitor.blog.demo2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 抽象元素
 * @author maojd
 * @version 创建时间： 2016年11月17日 下午7:09:57
 */
abstract class Element{
	public abstract void accept(IVisitor visitor);
	public abstract void doSomething();
}

class ConcreteElement1 extends Element{
	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);//B类通过visit方法，调用A类的doSomething
	}

	@Override
	public void doSomething() {
		System.out.println("这是元素1");   
	}
}
class ConcreteElement2 extends Element{
	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);//B类通过visit方法，调用A类的doSomething
	}

	@Override
	public void doSomething() {
		System.out.println("这是元素2");
	}
}

/**
 * B类 访问者 接口
 * @author maojd
 * @version 创建时间： 2016年11月17日 下午7:16:39
 */
interface IVisitor {
    public void visit(ConcreteElement1 el1);    
    public void visit(ConcreteElement2 el2);    
}
/**
 * 访问者， 通过visit调用A类的 这是A方法
 * @author maojd
 * @version 创建时间： 2016年11月17日 下午7:17:28
 */
class Visitor implements IVisitor{
	@Override
	public void visit(ConcreteElement1 el1) {
		el1.doSomething();
	}
	@Override
	public void visit(ConcreteElement2 el2) {
		el2.doSomething();
	}
}

/**
 * 一个元素的容器，一般包含一个容纳多个不同类、不同接口的容器，如List、Set、Map等，在项目中一般很少抽象出这个角色。
 * structure	英[ˈstrʌktʃə(r)]   结构; 构造; 建筑物; 体系;
 * @author maojd
 * @version 创建时间： 2016年11月17日 下午7:18:45
 */
class ObjectStructure{
	public static List<Element> getList(){
		List<Element> list = new ArrayList<Element>();
		Random ran = new Random();
		for(int i =0; i < 10; i++){
			int a = ran.nextInt(100);
			if(a > 50){
				list.add(new ConcreteElement1());
			}else{
				list.add(new ConcreteElement2());
			}
		}
		return list;
	}
}

public class Client {

	public static void main(String[] args) {
		List<Element> list = ObjectStructure.getList();
		for(Element e:list){
			e.accept(new Visitor());
		}
		
//		这是元素1
//		这是元素2
//		这是元素2
//		这是元素1
//		这是元素2
//		这是元素1
//		这是元素2
//		这是元素2
//		这是元素1
//		这是元素2
		
		
//		访问者模式的优点
//		符合单一职责原则：凡是适用访问者模式的场景中，元素类中需要封装在访问者中的操作必定是与元素类本身关系不大且是易变的操作，
//				使用访问者模式一方面符合单一职责原则，另一方面，因为被封装的操作通常来说都是易变的，
//				所以当发生变化时，就可以在不改变元素类本身的前提下，实现对变化部分的扩展。
//		扩展性良好：元素类可以通过接受不同的访问者来实现对不同操作的扩展。
		
//		 访问者模式的适用场景
//	       假如一个对象中存在着一些与本对象不相干（或者关系较弱）的操作，为了避免这些操作污染这个对象，则可以使用访问者模式来把这些操作封装到访问者中去。
//	       假如一组对象中，存在着相似的操作，为了避免出现大量重复的代码，也可以将这些重复的操作封装到访问者中去。
//	       但是，访问者模式并不是那么完美，它也有着致命的缺陷：增加新的元素类比较困难。通过访问者模式的代码可以看到，在访问者类中，每一个元素类都有它对应的处理方法，也就是说，每增加一个元素类都需要修改访问者类（也包括访问者类的子类或者实现类），修改起来相当麻烦。也就是说，在元素类数目不确定的情况下，应该慎用访问者模式。所以，访问者模式比较适用于对已有功能的重构，比如说，一个项目的基本功能已经确定下来，元素类的数据已经基本确定下来不会变了，会变的只是这些元素内的相关操作，这时候，我们可以使用访问者模式对原有的代码进行重构一遍，这样一来，就可以在不修改各个元素类的情况下，对原有功能进行修改。
//	 
//	总结
//	       正如《设计模式》的作者GoF对访问者模式的描述：大多数情况下，你并需要使用访问者模式，但是当你一旦需要使用它时，那你就是真的需要它了。当然这只是针对真正的大牛而言。在现实情况下（至少是我所处的环境当中），很多人往往沉迷于设计模式，他们使用一种设计模式时，从来不去认真考虑所使用的模式是否适合这种场景，而往往只是想展示一下自己对面向对象设计的驾驭能力。编程时有这种心理，往往会发生滥用设计模式的情况。所以，在学习设计模式时，一定要理解模式的适用性。必须做到使用一种模式是因为了解它的优点，不使用一种模式是因为了解它的弊端；而不是使用一种模式是因为不了解它的弊端，不使用一种模式是因为不了解它的优点。
		
	}
}
