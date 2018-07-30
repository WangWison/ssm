package com.itheima.spring.demo4;

/**
 * 构造方法方式实现属性注入
 * @author 隔壁老王
 *
 */
public class Car {
	private String name;
	private int price;
	public Car(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", price=" + price + "]";
	}
	
	
}
