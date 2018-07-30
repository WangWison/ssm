package com.itheima.spring.demo3;

public class Bean3Factory {
	public Bean3 createBean3() {
		System.out.println("实例工厂方式进行实例化------Bean3Factory中的方法被执行啦...");
		return new Bean3();
	}
}
