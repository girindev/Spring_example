package test02_transaction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("test02_transaction/applicationContext.xml");
		Person p = ctx.getBean("girl", Person.class);
		p.doSomething();
	}
}
