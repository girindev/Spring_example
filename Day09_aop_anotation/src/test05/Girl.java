package test05;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class Girl implements Person {
	public void doSomething() throws Exception {
		//// �ٽ� ���ɻ��� (���� ���� ���� �߻��� �� ����)
		System.out.println("���뱹�� �����.");
		if (new Random().nextBoolean()) {
			System.out.println("���� ����!!!");
			throw new Exception("�ҳ���!!");
		}
	}
}
