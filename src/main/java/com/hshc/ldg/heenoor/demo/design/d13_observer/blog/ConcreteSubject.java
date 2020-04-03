package com.hshc.ldg.heenoor.demo.design.d13_observer.blog;

public class ConcreteSubject extends Subject{

	@Override
	public void sendState() {
		if(null != super.observers && observers.size() > 0){
			for(Observer obs:observers){
				obs.update(this);
			}
		}
	}

}
