package com.hshc.ldg.heenoor.design.d11_state.blog;

public class TestState {

	public static void main(String[] args) {
		/**
		 * 如果是一般状态的，可以使用这种。因为which和state没有关系。
		 */
		int which = 1;
		String state = null;
		if(which == 1){
			state = "hello";
		}else if(which == 2){
			state = "hi";
		}else if(which == 3){
			state = "bye";
		}

		/**
		 * 下面这种就是“开关切换状态”,
		 * 如果单纯有上面一种将"hello"-->"hi"-->"bye"-->"hello"这一个方向切换,也不一定需要使用State模式，
		 * 因为State模式会建立很多子类，复杂化，但是如果又发生另外一个行为：将上面的切换方向反过来切换，或者需要任意切换，就需要State了。
		 */
		if("bye".equals(state)){
			state = "hello";
		}else if("hello".equals(state)){
			state = "hi";
		}else if("hi".equals(state)){
			state = "bye";
		}
		
		/**
		 * 下买状态模式的demo。 Color颜色之间的状态变化 
		 *  push 	green --> red --> black --> white
		 *  pull 	white --> black --> red --> green
		 *  
		 */
		Context con = new Context(new ColRed("红色"));
		
		System.out.println(con.getColorMsg());
		con.pushCol();
		System.out.println(con.getColorMsg());
		
		System.out.println("----------------------------------------------");
		con.pushCol();
		System.out.println(con.getColorMsg());
		
		System.out.println("----------------------------------------------2 绿色开始");
		con.setColor(new ColGreen("绿色"));
		System.out.println(con.getColorMsg());
		con.pullCol();
		System.out.println(con.getColorMsg());
	
		
		/**
		 * 
 状态模式在工作流或游戏等各种系统中有大量使用，甚至是这些系统的核心功能设计，
 例如ERP系统中，一个批文的状态有多种：未办；正在办理；正在批示；.
 正在审核；已经完成等各种状态，使用状态机可以封装这个状态的变化规则，从而达到扩充状态时，不必涉及到状态的使用者。

总结
使用状态模式前，客户端外界需要介入改变状态，而状态改变的实现是琐碎或复杂的。
使用状态模式后，客户端外界可以直接使用事件Event实现，根本不必关心该事件导致如何状态变化，这些是由状态机等内部实现。
这是一种Event-condition-State，状态模式封装了condition-State部分。
每个状态形成一个子类，每个状态只关心它的下一个可能状态，从而无形中形成了状态转换的规则。如果新的状态加入，只涉及它的前一个状态修改和定义。

状态模式的主要优点在于封装了转换规则，并枚举可能的状态，
它将所有与某个状态有关的行为放到一个类中，并且可以方便地增加新的状态，
只需要改变对象状态即可改变对象的行为，还可以让多个环境对象共享一个状态对象，从而减少系统中对象的个数；
其缺点在于使用状态模式会增加系统类和对象的个数，且状态模式的结构与实现都较为复杂，
如果使用不当将导致程序结构和代码的混乱，对于可以切换状态的状态模式不满足“开闭原则”的要求。
		 */
		
	}
	
}
