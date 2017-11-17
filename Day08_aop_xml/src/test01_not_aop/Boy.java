package test01_not_aop;

import java.util.Random;

public class Boy {
	public void doSomething() {
		System.out.println("배가 고프다.");

		try {
			////핵심 관심사항 (수행 도중 예외 발생할 수 있음)
			System.out.println("감자탕을 만든다.");
			if (new Random().nextBoolean()) {
				System.out.println("불이 났다!!!");
				throw new Exception("불났어!!");
			}
			/////////////////////////////////
			System.out.println("음식을 먹는다.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("엄마를 부른다.");
			e.printStackTrace();
		} finally {
			System.out.println("설거지를 한다.");
		}
	}
}
