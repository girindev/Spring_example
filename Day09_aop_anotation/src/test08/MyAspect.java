package test08;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {
	@Around("execution(String doSomething(int))")
	public Object myAround(ProceedingJoinPoint joinPoint) {
		Object param[] = joinPoint.getArgs();
		int n = (Integer) param[0];
		System.out.println("�̸� �޾ƺ��� " + n);
		System.out.println("�谡 ������.");
		n++;

		Object result = null;
		try {
			// �ٽ� ���ɻ��� doSomething ����
			// before�� ������ ������ ���� �� ����
			
			result = joinPoint.proceed(new Object[] { n });

			System.out.println("���� �����. ��� : " + result);
			System.out.println("������ �Դ´�.");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			System.out.println("�ٽɰ��ɻ��� ���� ���� ����");
			System.out.println("���� �޼��� : " + e.getMessage());
			e.printStackTrace();
		} finally {
			System.out.println("������...");
		}
		return result;
	}
}
