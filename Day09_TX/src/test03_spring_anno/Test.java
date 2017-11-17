package test03_spring_anno;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("test03_spring_anno/applicationContext.xml");
		BookService service = context.getBean("service", BookService.class);
		service.addBookSet();
	}
}
