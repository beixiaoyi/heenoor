package com.hshc.ldg.heenoor.design.d9_builder.blog;

import d9_builder.blog.entity.Person;
import d9_builder.blog.entity.Woman;

/**
 * @author maojd
 * @version 创建时间： 2016年10月14日 上午10:19:15
 */
public class WomanBuilder implements IPersonBuilder{

	Person woman;
	
	WomanBuilder(){
		woman = new Woman();
	}
	
	@Override
	public void buildBody() {
		woman.setBody("建造女人身体");
	}

	@Override
	public void buildHead() {
		woman.setHead("建造男人头");
	}

	@Override
	public void buildFoot() {
		woman.setFoot("建造男人脚");
	}

	@Override
	public Person conPerson() {
		return woman;
	}

	
	
}
