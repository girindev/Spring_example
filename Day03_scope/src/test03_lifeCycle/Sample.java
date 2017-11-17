package test03_lifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component("sss")
public class Sample {
	public Sample() {
		System.out.println("test03_Sample 생성자 호출");
	}
	public void sampleFunc() {
		System.out.println("test03_Sample 객체 사용중~");
	}
	@PostConstruct
	public void myStart() {
		System.out.println("test03_myStart() 메소드 호출");
	}
	@PreDestroy
	public void myFinish() {
		System.out.println("test03_myFinish() 메소드 호출");
	}
}
