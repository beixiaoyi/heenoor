package com.hshc.ldg.heenoor.design.d14_iterator.blog;

public interface Aggregate {

	void add(Object obj);
	void remove(Object obj);
	Iterator iterator();
}
