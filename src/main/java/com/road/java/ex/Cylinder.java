package com.road.java.ex;

/**
 * 编写一个圆柱体类Cylinder，它继承于上面的Circle类。还拥有：
①一个成员变量：   ---------2
double hight（私有，浮点型）；  // 圆柱体的高；
②构造方法         ---------2
Cylinder (double r, double  h )           //创建Circle对象时将半径初始化为r
③ 成员方法      ----------4分
getVolume( )             //获取圆柱体的体积
showVolume( )             //将圆柱体的体积输出到屏幕
编写应用程序，创建类的对象，分别设置圆的半径、圆柱体的高，计算并分别显示圆半径、圆面积、圆周长，圆柱体的体积。

 * @author Administrator
 *
 */
public class Cylinder extends Circle {

	private double hight;
	private double volume;
	
	public static void main(String[] args) {
		Cylinder c = new Cylinder(1, 2);
		c.show();
//		c.showVolume();
	}

	public Cylinder(double r, double h) {
		super(r);
		this.hight = h;
	}
	
	public double getVolume(){
		volume = getArea() * hight;
		return volume;
	}
	
	public void show() {
		getArea();
		getPerimeter();
		getVolume();
		System.out.println(
				"Cylinder [radius=" + getRadius() 
				+ ", hight=" + getHight()
				+ ", area=" + getArea()
				+ ", perimeter=" + getPerimeter() 
				+ ", volume=" + getVolume() 
				+ "]");
	}
	
	public void showVolume(){
		getVolume();
		System.out.println("volume=" + getVolume());
	}


	public double getHight() {
		return hight;
	}

	public void setHight(double hight) {
		this.hight = hight;
	}
	
	

}
