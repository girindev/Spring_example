package test04;

import org.aspectj.lang.JoinPoint;

public class MyAspect {
	public void myBefore(JoinPoint joinPoint) {
		Object[] params = joinPoint.getArgs();
		int n = (Integer)params[0];
		System.out.println("미리 받은 숫자 : "+n);
		System.out.println("배가 고프다.");
	}
	public void afterReturning(Object result) {
		System.out.println("음식을 먹는다 냠냠");
		System.out.println("핵심사항 결과:" + result);
	}
	public void afterThrowing(Throwable ex) {
		System.out.println("핵심관심사항 도중 에러났내");
		System.out.println("");
	}
	public void myAfter() {
		System.out.println("설거지 해야지");
	}
}
