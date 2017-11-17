package test03;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("test03/applicationContext.xml");
		Person p = ctx.getBean("ggg", Person.class);
		p.doSomething();
	}
}
