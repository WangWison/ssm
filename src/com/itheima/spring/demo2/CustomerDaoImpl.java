package com.itheima.spring.demo2;

public class CustomerDaoImpl implements CustomerDao{
	
	public void setup() {
		System.out.println("CustomerDao���󱻳�ʼ����....");
	}
	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("CustomerDaoImpl��ִ����....");
	}
	public void destroyed() {
		System.out.println("CustomerDao����������");
	}
}
