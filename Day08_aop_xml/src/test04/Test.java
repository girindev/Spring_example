package test04;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("test04/applicationContext.xml");
		Person p = ctx.getBean("girl", Person.class);
		System.out.println(p.doSomething(1));
	}
}
