package com.road.java.ex;

/**
 * 编写一个圆类Circle，该类拥有：    ------- 20分
	①一个成员变量     ---2分
	Radius（私有，浮点型）；  // 存放圆的半径；
	②两个构造方法       ------4分
	Circle( )                 // 将半径设为0
	Circle(double  r )         //创建Circle对象时将半径初始化为r
	③ 三个成员方法：     ------4分
	getArea( )    //获取圆的面积
	getPerimeter( )   //获取圆的周长
	show( )          //将圆的半径、周长、面积输出到屏幕

 * @author Administrator
 *
 */
public class Circle {
	
	private double radius;
	private double area;
	private double perimeter;
	
	public static void main(String[] args) {
		Circle c = new Circle(1);
		c.setRadius(2);
		c.show();
	}
	
	public Circle() {
	}

	public Circle(double r) {
		radius = r;
	}
	
	public double getArea(){
		area = Math.PI * radius * radius;
		return area;
	}
	
	public double getPerimeter(){
		perimeter = Math.PI * 2 * radius;
		return perimeter;
	}

	public void show() {
		getArea();
		getPerimeter();
		System.out.println("Circle [radius=" + radius + ", area=" + area + ", perimeter=" + perimeter + "]");
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
}
