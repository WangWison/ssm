package com.itheima.spring.demo4;

/**
 * setter��ʽʵ�����Ե�ע��
 * @author ��������
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
