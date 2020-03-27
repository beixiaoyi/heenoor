访问者模式：
http://blog.csdn.net/jason0539/article/details/45146271
http://blog.csdn.net/zhengzhb/article/details/7489639

一个对象中存在着一些与本对象不相干（或者关系较弱）的操作，为了避免这些操作污染这个对象，
则可以使用访问者模式来把这些操作封装到访问者中去。



abstract class Element{
	public abstract void accept(IVisitor visitor);
	public abstract void doSomething();
}

interface IVisitor {
    public void visit(ConcreteElement1 el1);    
    public void visit(ConcreteElement2 el2);    
}
//maojd	
元素类可以接收访问者(accept方法 调用访问者指定的方法), 
访问者可以调用元素类做事,也可以自己做事(visit方法的实现).