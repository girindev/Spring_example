package test05;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("test05/applicationContext.xml");
		Person p = ctx.getBean("boy", Person.class);
		System.out.println(p.doSomething(1));
	}
}
