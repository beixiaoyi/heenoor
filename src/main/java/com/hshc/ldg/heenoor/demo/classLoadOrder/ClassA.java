package com.hshc.ldg.heenoor.demo.classLoadOrder;

public class ClassA {

    public static  ClassA classa = new ClassA();

    static{
        System.out.println("ClassA的静态代码块");
    }

    public ClassA(){
        System.out.println("ClassA的构造方法");
    }

    {
        System.out.println("ClassA的构造代码块");
    }

}