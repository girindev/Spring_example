package test04_lifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Sample implements InitializingBean, DisposableBean {
	public Sample() {
		System.out.println("test04_Sample ������ ȣ��");
	}
	public void sampleFunc() {
		System.out.println("test04_Sample ��ü �����~");
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
