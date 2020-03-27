package com.hshc.ldg.heenoor.design.d14_iterator.blog;

import java.util.ArrayList;
import java.util.List;

public class IteratorImpl implements Iterator{

	private List list = new ArrayList();
	int num = 0;
	public IteratorImpl(List list){
		this.list = list;
	}
	
	@Override
	public Object next() {
		if(this.hasNext()){
			return list.get(num++);
		}else{
			return null;
		}
	}

	@Override
	public boolean hasNext() {
		return num < list.size();
	}

	
	
}
