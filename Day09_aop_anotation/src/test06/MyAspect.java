package test06;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

	@Around("execution(void doSomething())")
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
