package com.hshc.ldg.heenoor.design.d7_prototype.blog;

import java.util.ArrayList;
import java.util.List;

public class Prototype implements Cloneable{

	private int age;
	private String name;
	
	private ArrayList<String> list;
	
	public Prototype(){
		System.out.println("constructmethod no params");
	}
	
	public Prototype(int age, String name) {
		super();
		System.out.println("constructmethod");
		this.age = age;
		this.name = name;
	}
	
	public Prototype(int age, String name, ArrayList<String> list) {
		super();
		System.out.println("constructmethod2");
		this.age = age;
		this.name = name;
		this.list = list;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public List<String> getList() {
		return list;
	}

	public void setList(ArrayList<String> list) {
		this.list = list;
	}

	public Prototype clone(){
		Prototype tc = null;
		try {
			tc = (Prototype) super.clone();
			tc.list = (ArrayList<String>) this.list.clone();//this.list
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tc;
	}
	
}
