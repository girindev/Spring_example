package test02_spring_xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("test02_spring_xml/applicationContext.xml");
		BookService service = context.getBean("service", BookService.class);
		service.addBookSet();
	}
}
