package com.road.lesson3;

public class TestMan {
	
	public static void main(String[] args) {
		Man mike = new Man();
		mike.setName("Mike");
		mike.setAge(18);
		mike.testThis();
		System.out.println(mike);
		
		System.out.println("------------------------------------");
		
		Man peter = new Man();
		peter.setName("Peter");
		peter.testThis();
		System.out.println(peter);
		
		Woman rose = new Woman();
		rose.setName("Rose");
		
		mike.marry(rose);
		System.out.println("------------------------------------");
		peter.marry(rose);
	}

}

class Man {
	
	private String name;
	private int age;
	
	public void work(){
		System.out.println("man's work");
	}
	
	public void testThis() {
		int a;
		Man man = new Man();
		man.name = "John";
		System.out.println(this);
	}

	public void marry(Woman woman){
		System.out.println(this.name + "向" + woman.getName() + "求婚");
//		woman.sayOk();
		woman.sayOk(this);
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Man [name=" + name + ", age=" + age + "]";
	}
	
}

class Woman {
	
	private String name;
	
	public void shopping() {
		System.out.println("woman's shopping");
	}
	
	public void sayOk(Man man){
		System.out.println(this.name + "答应" + man.getName() + "的求婚");
	}

	public void sayOk(){
		System.out.println(this.name + "答应了");
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}