package com.itheima.spring.demo4;

/**
 * setter方式实现属性的注入
 * @author 隔壁老王
 *
 */
public class Car2 {
	private String name;
	private int price;
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car2 [name=" + name + ", price=" + price + "]";
	}
	
	
}
