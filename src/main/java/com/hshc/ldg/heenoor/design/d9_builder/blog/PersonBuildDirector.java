package com.hshc.ldg.heenoor.design.d9_builder.blog;

import d9_builder.blog.entity.Person;

/**
 * PersonBuild管理类,根据不同的PersonBuilder 返回不同的人类
 * @author maojd
 * @version 创建时间： 2016年10月14日 上午10:28:34
 */
public class PersonBuildDirector {

	public Person conPersion(IPersonBuilder pb){
		pb.buildBody();
		pb.buildHead();
		pb.buildFoot();
		return pb.conPerson();
	}
	
}
