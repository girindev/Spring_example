package test03;

import java.util.Random;

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
