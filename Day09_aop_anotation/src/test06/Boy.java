package test06;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class Boy implements Person {
	public void doSomething() throws Exception{
		//// �ٽ� ���ɻ��� (���� ���� ���� �߻��� �� ����)
		System.out.println("�������� �����.");
		if (new Random().nextBoolean()) {
			System.out.println("���� ����!!!");
			throw new Exception("�ҳ���!!");
		}
	}
}
