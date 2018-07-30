package com.itheima.spring.demo3;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * spring测试类
 * @author 隔壁老王
 *
 */
public class SpringDemo3 {
	@Test
	public void demo() {
		//创建spring工厂
		ApplicationContext applicatonContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Bean1 bean = (Bean1) applicatonContext.getBean("bean1");
		
		Bean2 bean2 = (Bean2) applicatonContext.getBean("bean2");
		
		Bean3 bean3 = (Bean3) applicatonContext.getBean("bean3");
	}
}
