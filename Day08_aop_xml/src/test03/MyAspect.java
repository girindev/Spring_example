package test03;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {
	public void myAround(ProceedingJoinPoint joinPoint) {
		System.out.println("�谡 ������."); //before
		try {
			joinPoint.proceed(); //�ٽɰ��ɻ��� ȣ�����
			System.out.println("������ �Դ´�."); //after-returning
		} catch (Throwable e) {
			System.out.println("�ҳ���!!!!"); //after-throwing
			e.printStackTrace();
		} finally {
			System.out.println("�������� �Ѵ�."); //after
		}
	}
}
