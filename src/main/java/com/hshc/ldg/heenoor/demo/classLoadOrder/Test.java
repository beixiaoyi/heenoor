package com.hshc.ldg.heenoor.demo.classLoadOrder;

public class Test {

    static {
        System.out.println("Test的静态代码块");
    }

    public static void main(String[] args) {
        System.out.println("执行main方法");
        ClassB b = new ClassB();
        b.excute();
    }


    /***
     *
     *
     * 执行结果：
     *
     * Test的静态代码块
     * 执行main方法
     * ClassA的构造代码块
     * ClassA的构造方法
     * ClassA的静态代码块
     * ClassB的静态代码块
     * ClassC的构造方法
     * ClassA的构造代码块
     * ClassA的构造方法
     * ClassB的构造代码块
     * ClassB的构造方法
     * 执行方法
     *
     *
     *
     *通过执行结果可以看出：
     *
     * 1.先执行Test类的静态代码块后执行Test类的main方法，说明要执行类的方法需要先加载这个类。
     *
     * 2.在创建ClassB的对象时，先去加载了父类ClassA。说明加载子类时如果没有加载父类，会先加载父类。
     *
     * 3.静态变量赋值和静态代码块都会在类加载的时候执行，执行顺序与静态变量和静态代码块出现的先后顺序一致。
     *
     * 4.如果在类的静态代码块执行之前创建该类的对象，则会先执行该类的构造代码块和构造方法。
     *
     * 5.构造代码块总是在构造函数之前执行。
     *
     * 6.创建子类对象，需要先初始化父类的对象。所以先执行父类的构造代码块和构造方法，再执行子类的构造代码块和构造方法。
     *
     */

}