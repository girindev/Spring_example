package test07;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {
	@Pointcut("execution (String doSomething(int))")
	public void myPoint() {};
	
	@Before("myPoint()")
	public void myBefore(JoinPoint joinPoint) {
		Object[] params = joinPoint.getArgs();
		int n = (Integer)params[0];
		System.out.println("�̸� ���� ���� : "+n);
		System.out.println("�谡 ������.");
	}
	@AfterReturning(value="myPoint()" , returning="result")
	public void afterReturning(Object result) {
		System.out.println("������ �Դ´� �ȳ�");
		System.out.println("�ٽɻ��� ���:" + result);
	}
	@AfterThrowing(value = "myPoint()", throwing="ex")
	public void afterThrowing(Throwable ex) {
		System.out.println("�ٽɰ��ɻ��� ���� ��������");
		System.out.println("");
	}
	@After("myPoint()")
	public void myAfter() {
		System.out.println("������ �ؾ���");
	}
}
