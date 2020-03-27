package com.hshc.ldg.heenoor.design.d9_builder.blog;

import d9_builder.blog.entity.Person;

/**
 * @author maojd
 * @version 创建时间： 2016年10月14日 上午10:10:09
 */
public interface IPersonBuilder {

	void buildBody();
	void buildHead();
	void buildFoot();
	Person conPerson();
}
