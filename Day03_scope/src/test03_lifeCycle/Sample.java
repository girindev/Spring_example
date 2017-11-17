package test03_lifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component("sss")
public class Sample {
	public Sample() {
		System.out.println("test03_Sample ������ ȣ��");
	}
	public void sampleFunc() {
		System.out.println("test03_Sample ��ü �����~");
	}
	@PostConstruct
	public void myStart() {
		System.out.println("test03_myStart() �޼ҵ� ȣ��");
	}
	@PreDestroy
	public void myFinish() {
		System.out.println("test03_myFinish() �޼ҵ� ȣ��");
	}
}
