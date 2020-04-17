package com.road.lesson3;

public class TestRef {
	
	public static void main(String[] args) {
		
		TestRef t = new TestRef();
		
		Person2 p = new Person2();
		p.setName("张三");
		int a = 3;
		
		System.out.println(a);
		System.out.println(p);
		
		t.fun1(a);
		t.fun2(p);
		
		System.out.println(a);
		System.out.println(p);
		
		
	}
	
	
	public void fun1(int a) {
		a = a - 1;
	}
	
	public void fun2(Person2 p) {
		p.setName("xxx");
	}

}

class Person2 {
	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person2 [name=" + name + "]";
	}
}