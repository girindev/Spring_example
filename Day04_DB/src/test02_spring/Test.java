package test02_spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import vo.BookVO;

public class Test {
	public static void main(String[] args) {
		//객체 아래처럼 new 하면 안됨;
//		BookDaoSpring dao = new BookDaoSpring(); 의존하는 객체를 받지 못함
		ClassPathXmlApplicationContext applicationContext =
				new ClassPathXmlApplicationContext("test02_spring/applicationContext.xml");
		BookDaoSpring bookDaoSpring = applicationContext.getBean("bookDaoSpring", BookDaoSpring.class);
//		BookVO vo = new BookVO();
//		vo.setTitle("제목1");
//		vo.setPublisher("삼성");
//		vo.setPrice(25000);
//		vo.setWriter("후니");
//		bookDaoSpring.insert(vo);
		
		System.out.println(bookDaoSpring.selectBookList());
	}
}
