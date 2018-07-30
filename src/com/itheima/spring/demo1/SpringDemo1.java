package com.itheima.spring.demo1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringDemo1 {
	@Test
	public void demo1() {
		/**
		 * ��ͳ��ʽ�ĵ���
		 */
		// ���UserDaoImpl�޸ĳ�UserDaoHiberbateImpl��ôservice���ʵ��Ҳ��Ҫ�޸ģ���������Ը�
		UserDao userDao = new UserDaoImpl();
		userDao.save();
	}
	@Test
	public void demo2() {
		/**
		 * spring��ʽ�ĵ���
		 */
		//����spring����
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		UserDao userDao = (UserDao) applicationContext.getBean("userDao");
		
		userDao.save();
	}
	
	@Test
	public void demo3() {
		/**
		 * ���ش����µ������ļ�
		 */
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext("c:\\applicationContext.xml");
		
		UserDao userDao = (UserDao) applicationContext.getBean("userDao");
		
		userDao.save();
	}
}
