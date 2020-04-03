package com.hshc.ldg.heenoor.demo.design.d18_mediator.demo2;

public class MediatorA extends AbstractMediator{

	public MediatorA(AbstractColleague a, AbstractColleague b) {
		super(a, b);
	}

	@Override
	public void affectB() {
		int number = a.getNum();  
		b.setNum(number / 100);
	}

	@Override
	public void affectA() {
		int number = b.getNum();
		a.setNum(number * 100);
	}

}
