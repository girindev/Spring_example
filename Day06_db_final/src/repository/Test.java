package repository;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import vo.BookVO;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context 
				= new ClassPathXmlApplicationContext("applicationContext.xml");
		BookDao dao = context.getBean("bookDao", BookDao.class);
		
		for (BookVO b : dao.selectAll()) {
			System.out.println(b);
		}
		
		BookVO book = new BookVO();
		book.setjPrice(10000);
		book.setjPublisher("후니");
		book.setjTitle("여행가자");
		book.setjWriter("후니훈");
	}
}
