package test04_lifeCycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("test04_lifeCycle/applicationContext.xml");
		Sample s1 = context.getBean("sample", Sample.class);
		s1.sampleFunc();
		context.close();
		context.registerShutdownHook();
		s1.sampleFunc();
	}
}
