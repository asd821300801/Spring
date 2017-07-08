package com.lingdu.aop;

import org.aspectj.lang.JoinPoint;

/**
 * 时间切面
 * 
 * @author LingDu
 */
public class TimeAspect {
	private static long begin ;
	private static long end ;
	
	public void doBefore(JoinPoint jp){
		begin = System.currentTimeMillis();
		System.out.println("doBefore:前置通知");
	}
	
	public void doAfter(JoinPoint jp){
		end = System.currentTimeMillis();
		System.out.println("doAfter:后置通知，包括异常");
	}
	
	public void doThrowing(JoinPoint jp,Throwable ex){
		System.out.println("doThrowing:例外通知(异常)" + "--->" + ex);
	}
	
	public void doAfterReturn (JoinPoint jp){
		
		System.out.println("doAfterReturn:后置通知，连接点完成" + "----->" + (end-begin)/1000f);
	}
}
