package com.lingdu.common.util;


import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class SpringUtil implements ApplicationContextAware{

	private static ApplicationContext ctx;
	
	public static void init(String path){
		ctx=new ClassPathXmlApplicationContext(path);
	}
	
	public static <T> T getBean(Class<T> type){
		return ctx.getBean(type);
	}
	
	public static Object getBean(String id){
		return ctx.getBean(id);
	}

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		ctx=applicationContext;
	}
}
