package test01_not_aop;

import java.util.Random;

public class Boy {
	public void doSomething() {
		System.out.println("�谡 ������.");

		try {
			////�ٽ� ���ɻ��� (���� ���� ���� �߻��� �� ����)
			System.out.println("�������� �����.");
			if (new Random().nextBoolean()) {
				System.out.println("���� ����!!!");
				throw new Exception("�ҳ���!!");
			}
			/////////////////////////////////
			System.out.println("������ �Դ´�.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("������ �θ���.");
			e.printStackTrace();
		} finally {
			System.out.println("�������� �Ѵ�.");
		}
	}
}
