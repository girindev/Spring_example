package test02_transaction;

import java.util.Random;

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
