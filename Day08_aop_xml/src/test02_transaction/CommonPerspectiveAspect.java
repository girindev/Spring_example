package test02_transaction;

public class CommonPerspectiveAspect {
	//������ �޼ҵ�
	public void myBefore() {
		System.out.println("�谡 ������.");
	}

	public void myAfterReturning() {
		System.out.println("������ �Դ´�.");
	}

	public void myAfterThrowing() {
		System.out.println("���� �θ���~!!");
	}

	public void myAfter() {
		System.out.println("�������� �Ѵ�.");
	}
}
