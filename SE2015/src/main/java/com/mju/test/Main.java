package com.mju.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	private static ApplicationContext factory = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});

	public static void main(String[] args) {
		
		CGwamokManager gwamokManager = (CGwamokManager)factory.getBean("gwamokManager");
		EGwamok gwamok = (EGwamok)factory.getBean("gwamok");
		
		gwamokManager.gaeseol(gwamok);
	}

}
