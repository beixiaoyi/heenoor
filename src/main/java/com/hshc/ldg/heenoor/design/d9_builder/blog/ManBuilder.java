package com.hshc.ldg.heenoor.design.d9_builder.blog;

import d9_builder.blog.entity.Man;
import d9_builder.blog.entity.Person;

/**
 * @author maojd
 * @version 创建时间： 2016年10月14日 上午10:19:15
 */
public class ManBuilder implements IPersonBuilder{

	Person man;
	
	ManBuilder(){
		man = new Man();
	}
	
	@Override
	public void buildBody() {
		man.setBody("建造男人身体");
	}

	@Override
	public void buildHead() {
		man.setHead("建造男人头");
	}

	@Override
	public void buildFoot() {
		man.setFoot("建造男人脚");
	}

	@Override
	public Person conPerson() {
		return man;
	}

	
	
}
