package com.lingdu.aop;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 日志切面
 * @author LingDu
 */
public class LogAspect {
	public Object log(ProceedingJoinPoint point) throws Throwable{
		System.out.println("业务处理之前LogAspect：" + point.getSignature().getName());
		for(Object obj : point.getArgs()){
			System.out.println("参数LogAspect：" + obj);
		}
		Object result = point.proceed();
		System.out.println("LogAspect result：" + result);
		return result;
	}
}
