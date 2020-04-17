package com.road.lesson5;

public class ComparableCircle extends Circle implements CompareObject{

	@Override
	public int compareTo(Object o) {
//		if (!(o instanceof Circle)) {
//			throw new MyException("参数必须为Circle对象");
//		}
		Circle c = null;
		try {
			c = (Circle) o;
		} catch (Exception e) {
			throw new MyException("参数必须为Circle对象");
		}
		if (this.getRadius() == c.getRadius()) {
			return 0;
		} else if(this.getRadius() > c.getRadius()) {
			return 1;
		} else {
			return -1;
		}
	}

}
