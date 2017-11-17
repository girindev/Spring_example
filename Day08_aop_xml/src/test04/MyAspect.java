package test04;

import org.aspectj.lang.JoinPoint;

public class MyAspect {
	public void myBefore(JoinPoint joinPoint) {
		Object[] params = joinPoint.getArgs();
		int n = (Integer)params[0];
		System.out.println("�̸� ���� ���� : "+n);
		System.out.println("�谡 ������.");
	}
	public void afterReturning(Object result) {
		System.out.println("������ �Դ´� �ȳ�");
		System.out.println("�ٽɻ��� ���:" + result);
	}
	public void afterThrowing(Throwable ex) {
		System.out.println("�ٽɰ��ɻ��� ���� ��������");
		System.out.println("");
	}
	public void myAfter() {
		System.out.println("������ �ؾ���");
	}
}
