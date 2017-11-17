package test05;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {
	public Object myAround(ProceedingJoinPoint joinPoint) {
		Object param[] = joinPoint.getArgs();
		int n = (Integer) param[0];
		System.out.println("미리 받아보기 " + n);
		System.out.println("배가 고프다.");
		n++;

		Object result = null;
		try {
			// 핵심 관심사항 doSomething 실행
			// before가 수정한 값으로 들어가는 값 셋팅

			result = joinPoint.proceed(new Object[] { n });

			System.out.println("정상 종료됨. 결과 : " + result);
			System.out.println("음식을 먹는다.");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			System.out.println("핵심관심사항 도중 예외 종료");
			System.out.println("예외 메세지 : " + e.getMessage());
			e.printStackTrace();
		} finally {
			System.out.println("설거지...");
		}
		return result;
	}
}
