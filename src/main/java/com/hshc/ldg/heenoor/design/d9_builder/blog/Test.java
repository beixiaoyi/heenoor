package com.hshc.ldg.heenoor.design.d9_builder.blog;

import d9_builder.blog.entity.Person;

public class Test {

	public static void main(String[] args) {
		PersonBuildDirector pbManager = new PersonBuildDirector();
		Person man = pbManager.conPersion(new ManBuilder());
		Person woman = pbManager.conPersion(new WomanBuilder());
		
		System.out.println(man.getBody());
		System.out.println(man.getHead());
		
		System.out.println(woman.getBody());
		
		
	}
}
