package com.hshc.ldg.heenoor.design.d6_simfact_factmethod.blog.factmethod;

public class FactoryBMW320 implements FactoryBMW{

	@Override
	public BMW createCar() {
		return new BMW320();
	}

}
