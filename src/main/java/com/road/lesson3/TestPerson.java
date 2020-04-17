package com.road.lesson3;

import java.lang.reflect.Method;

public class TestPerson {

	public static void main(String[] args) {
//		Person p1 = new Person(-1);
//		Person p2 = new Person(-1, "zhangsan");
//		Person p2 = new Person();
//		Person p3 = new Person();
//		p.setAge(-1);
//		p1.setName("lisi");
//		System.out.println(p1);
//		System.out.println(p2);
		Person p1 = Person.instance();
		Person p2 = Person.instance();
		p1.setAge(18);
		p2.setAge(18);
		
		//com.road.lesson3.Person
//		try {
//			Class<?> instance = Class.forName("com.road.lesson3.Person");
//			Object p = instance.newInstance();
//			Method method = instance.getDeclaredMethod("wash");
//			method.invoke(p, args);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}

}
