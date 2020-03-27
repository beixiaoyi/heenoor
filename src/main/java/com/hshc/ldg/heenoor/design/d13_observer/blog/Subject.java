package com.hshc.ldg.heenoor.design.d13_observer.blog;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

	protected List<Observer> observers = new ArrayList<Observer>();
	private String subState = null;
	
	/**
	 * 发送通知
	 */
	public abstract void sendState();
	
	/**
	 * 增加观察者
	 * @param observer
	 */
    public void attach(Observer observer){
        observers.add(observer);
    }
	/**
	 * 删除观察者
	 * @param observer
	 */
    public void detach(Observer observer){
        observers.remove(observer);
    }
    
	public List<Observer> getObservers() {
		return observers;
	}
	public void setObservers(List<Observer> observers) {
		this.observers = observers;
	}
	public String getSubState() {
		return subState;
	}
	public void setSubState(String subState) {
		this.subState = subState;
	}
	
	
	
}
