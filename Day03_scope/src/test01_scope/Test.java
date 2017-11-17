package test01_scope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"test01_scope/applicationContext.xml");
		Sample s1 = context.getBean("sample01", Sample.class);
		Sample s2 = context.getBean("sample01", Sample.class);
		Sample s3 = context.getBean("sample01", Sample.class);

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println("----------------------------------");
		/////////////////////////////////////////////////
		Sample ss1 = context.getBean("sample02", Sample.class);
		Sample ss2 = context.getBean("sample02", Sample.class);
		Sample ss3 = context.getBean("sample02", Sample.class);

		System.out.println(ss1);
		System.out.println(ss2);
		System.out.println(ss3);
		System.out.println("----------------------------------");
		
		///////////////////////////////////////////////
		Sample sss1 = context.getBean("sss", Sample.class);
		Sample sss2 = context.getBean("sss", Sample.class);
		System.out.println(sss1);
		System.out.println(sss2);

	}
}
