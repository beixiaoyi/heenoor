package com.hshc.ldg.heenoor.design.d18_mediator.demo2;

public abstract class AbstractMediator {

	protected AbstractColleague a;
	protected AbstractColleague b;
	
	public AbstractMediator(AbstractColleague a, AbstractColleague b) {
		this.a = a;
		this.b = b;
	}

	public abstract void affectB();  
    
    public abstract void affectA();  
	
	
}
