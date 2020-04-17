package com.road.lesson3;

/**
 * 1.创建程序,在其中定义两个类，Person和 TestPerson类的定义如下。
 * 用setAge()设置人的合法年龄(0~130)，用getAge()返回人的年龄。
 * 在Test类中实例化Person类的对象b，调用setAge()和getAge()方法，体会Java的封装性。
 *
 */
public class Person {

	private int age;
	private String name;
	private static Person p = new Person();

	private Person(){
		wash();
		System.out.println("Person's constrator");
	}
	
	public static Person instance(){
		return p;
	}

//	public Person(int age){
//		wash();
//		setAge(age);
//		System.out.println("Person's constrator2");
//	}
//
//	public Person(int age, String name){
//		wash();
//		setAge(age);
//		setName(name);
//		System.out.println("Person's constrator3");
//	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 130) {
			this.age = 130;
		} else if (age < 0) {
			this.age = 0;
		} else {
			this.age = age;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void wash(){
		System.out.println("washing");
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}

}
