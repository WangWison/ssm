package com.itheima.spring.demo2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.itheima.spring.demo1.UserDao;
import com.itheima.spring.demo1.UserDaoImpl;

public class SpringDemo2 {
	@Test
	public void demo1() {
		/**
		 * 传统方式的调用
		 */
		// 如果UserDaoImpl修改成UserDaoHiberbateImpl那么service层的实现也需要修改，代码耦合性高
		UserDao userDao = new UserDaoImpl();
		userDao.save();
	}
	@Test
	public void demo2() {
		/**
		 * spring方式的调用
		 */
		//创建spring工厂
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CustomerDao customerDao= (CustomerDao) applicationContext.getBean("CustomerDao");
		
		customerDao.save();
		
		((AbstractApplicationContext) applicationContext).close();
	}
	
	@Test
	public void demo3() {
		/**
		 * 加载磁盘下的配置文件
		 */
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext("c:\\applicationContext.xml");
		
		UserDao userDao = (UserDao) applicationContext.getBean("userDao");
		
		userDao.save();
	}
	@Test
	public void demo4() {
		/**
		 * spring方式的调用
		 */
		//创建spring工厂
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CustomerDao customerDao1 = (CustomerDao) applicationContext.getBean("CustomerDao");
		System.out.println(customerDao1);
		customerDao1.save();
		
		CustomerDao customerDao2 = (CustomerDao) applicationContext.getBean("CustomerDao");
		System.out.println(customerDao2);
		customerDao1.save();
		System.out.println(customerDao1 == customerDao2);
		
	}
	
}
