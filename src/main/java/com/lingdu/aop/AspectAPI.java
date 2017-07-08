package com.lingdu.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class AspectAPI {
	
	@Pointcut("execution(* com.lingdu.service..*.*(..))")
	private void pointCutMethod(){
		
	}
	
	//声明前置通知
	@Before("pointCutMethod()")
	public void doBefore(){
		System.out.println("前置通知");
	}
	
	//后置通知，包括异常
	@After("pointCutMethod()")
	public void doAfter(){
		System.out.println("后置通知，包括异常");
	}
	
	//声明例外通知
	@AfterThrowing(pointcut="pointCutMethod()",throwing = "e")
	public void doAfterThrowing(Exception e){
		System.out.println("例外通知(异常)");
	}
	
	//声明后置通知
	@AfterReturning(pointcut="pointCutMethod()",returning="result")
	public void daAfterReturning(String result){
		System.out.println("后置通知，连接点完成，不包括异常： " + result);
	}
	
	//声明环绕通知  
    @Around("pointCutMethod()")  
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {  
        System.out.println("进入方法---环绕通知");  
        //System.out.println(pjp.getTarget().getClass().getName());
        Object o = pjp.proceed();  
        System.out.println("退出方法---环绕通知");  
        return o;  
    } 
}
