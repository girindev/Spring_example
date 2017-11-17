package test02_spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import vo.BookVO;

public class Test {
	public static void main(String[] args) {
		//��ü �Ʒ�ó�� new �ϸ� �ȵ�;
//		BookDaoSpring dao = new BookDaoSpring(); �����ϴ� ��ü�� ���� ����
		ClassPathXmlApplicationContext applicationContext =
				new ClassPathXmlApplicationContext("test02_spring/applicationContext.xml");
		BookDaoSpring bookDaoSpring = applicationContext.getBean("bookDaoSpring", BookDaoSpring.class);
//		BookVO vo = new BookVO();
//		vo.setTitle("����1");
//		vo.setPublisher("�Ｚ");
//		vo.setPrice(25000);
//		vo.setWriter("�Ĵ�");
//		bookDaoSpring.insert(vo);
		
		System.out.println(bookDaoSpring.selectBookList());
	}
}
