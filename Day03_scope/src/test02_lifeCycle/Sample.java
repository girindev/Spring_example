package test02_lifeCycle;

public class Sample {
	public Sample() {
		System.out.println("Sample 생성자 호출");
	}
	public void sampleFunc() {
		System.out.println("Sample 객체 사용중~");
	}
	public void myStart() {
		System.out.println("myStart() 메소드 호출");
	}
	public void myFinish() {
		System.out.println("myFinish() 메소드 호출");
	}
}
