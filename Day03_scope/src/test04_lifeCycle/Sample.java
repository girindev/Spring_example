package test04_lifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Sample implements InitializingBean, DisposableBean {
	public Sample() {
		System.out.println("test04_Sample 생성자 호출");
	}
	public void sampleFunc() {
		System.out.println("test04_Sample 객체 사용중~");
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("test04_destory");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("test04_start");

	}

}
