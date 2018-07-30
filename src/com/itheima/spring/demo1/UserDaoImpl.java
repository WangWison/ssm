package com.itheima.spring.demo1;

public class UserDaoImpl implements UserDao{
	
	private String userName;
	
	
	public void setUserName(String userName) {
		this.userName = userName;
	}


	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("UserDaoImpl÷¥––¿≤...."+userName);
	}

}
