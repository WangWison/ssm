package com.itheima.spring.demo2;

public class CustomerDaoImpl implements CustomerDao{
	
	public void setup() {
		System.out.println("CustomerDao对象被初始化啦....");
	}
	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("CustomerDaoImpl被执行啦....");
	}
	public void destroyed() {
		System.out.println("CustomerDao对象被销毁啦");
	}
}
