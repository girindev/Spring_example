package test02_transaction;

public class CommonPerspectiveAspect {
	//임의의 메소드
	public void myBefore() {
		System.out.println("배가 고프다.");
	}

	public void myAfterReturning() {
		System.out.println("음식을 먹는다.");
	}

	public void myAfterThrowing() {
		System.out.println("엄를 부른다~!!");
	}

	public void myAfter() {
		System.out.println("설거지를 한다.");
	}
}
