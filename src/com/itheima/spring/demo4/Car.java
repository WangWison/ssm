package com.itheima.spring.demo4;

/**
 * ���췽����ʽʵ������ע��
 * @author ��������
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
