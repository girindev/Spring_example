package test05;

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
	
	@Pointcut("execution(void doSomething())")
	public void myPoint() {}
	
	//������ �޼ҵ�
	@Before("myPoint()")
	public void myBefore() {
		System.out.println("�谡 ������.");
	}
	@AfterReturning("myPoint()")
	public void myAfterReturning() {
		System.out.println("������ �Դ´�.");
	}
	@AfterThrowing("myPoint()")
	public void myAfterThrowing() {
		System.out.println("���� �θ���~!!");
	}
	@After("myPoint()")
	public void myAfter() {
		System.out.println("�������� �Ѵ�.");
	}
}
