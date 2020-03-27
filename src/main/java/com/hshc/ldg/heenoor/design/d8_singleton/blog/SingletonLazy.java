package com.hshc.ldg.heenoor.design.d8_singleton.blog;

public class SingletonLazy {

	private static SingletonLazy sin = null;
	
	private SingletonLazy(){}
	
	public static SingletonLazy getInstance(){
		if(null == sin){
			sin = new SingletonLazy();
		}
		return sin;
	}
	
	//但是以上懒汉式单例的实现没有考虑线程安全问题，它是线程不安全的，并发环境下很可能出现多个Singleton实例，要实现线程安全，有以下三种方式，都是对getInstance这个方法改造，保证了懒汉式单例的线程安全，如果你第一次接触单例模式，对线程安全不是很了解，可以先跳过下面这三小条，去看饿汉式单例，等看完后面再回头考虑线程安全的问题：
	//解决1 在getInstance方法上加同步
	//public static synchronized Singleton getInstance() 
	
	//解决2 双重检查锁定 getInstance方法中
//	 if (singleton == null) {    
//         synchronized (Singleton.class) {    
//            if (singleton == null) {    
//               singleton = new Singleton();   
//            }    
//         }    
//     }    
//     return singleton; 
	
	
	//解决3 静态内部类  这种比上面1、2都好一些，既实现了线程安全，又避免了同步带来的性能影响。
//	public class Singleton {
//	    private static class LazyHolder {
//	       private static final Singleton INSTANCE = new Singleton();    
//	    }
//	    private Singleton (){}
//	    public static final Singleton getInstance() {
//	       return LazyHolder.INSTANCE;
//	    }
//	}

}
