package practice_spring;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import vo.BookVO;

public class Main {
	private static BookDaoOracle dao;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean flag = true;
		String title , writer, publisher;
		int book_num, price;
		BookVO book;
		
		ClassPathXmlApplicationContext cxt = 
				new ClassPathXmlApplicationContext("practice_spring/applicationContext.xml");
		
		dao = cxt.getBean("bookDaoOracle", BookDaoOracle.class);
		while (flag) {
			init();
			int order = in.nextInt();
			switch (order) {
			case 1:
				System.out.println("*****å �߰� ����*****");
				System.out.print("���� : ");
				title = in.next();
				System.out.print("�۰� : ");
				writer = in.next();
				System.out.print("���ǻ� : ");
				publisher = in.next();
				System.out.print("���� : ");
				price = in.nextInt();
				book = new BookVO(title, writer, price, publisher);
				addBook(book);
				break;
			case 2:
				System.out.println("*****å ���� ����*****");
				System.out.print("å ��ȣ : ");
				book_num = in.nextInt();
				System.out.print("���� : ");
				title = in.next();
				System.out.print("�۰� : ");
				writer = in.next();
				System.out.print("���ǻ� : ");
				publisher = in.next();
				System.out.print("���� : ");
				price = in.nextInt();
				book = new BookVO(title, writer, price, publisher);
				updateBook(book, book_num);
				break;
			case 3:
				System.out.println("*****å ���� ����*****");
				System.out.print("å ��ȣ : ");
				book_num = in.nextInt();
				deleteBook(book_num);
				break;
			case 4:
				System.out.println("*****å �˻� ����*****");
				System.out.print("å ��ȣ : ");
				book_num = in.nextInt();
				selectBook(book_num);
				break;
			case 5:
				System.out.println("*****å ��� ����*****");
				selectBookList();
				break;
			case 6:
				flag = false;
				System.out.println("*****���α׷� ����*****");
				break;
			}
		}
	}

	// �߰�
	public static void addBook(BookVO book) {
		int result = dao.insert(book);
		if (result == 1) {
			System.out.println("�Ϸ�");	
		} else {
			System.out.println("����");
		}
	}

	// ����
	public static void updateBook(BookVO book, int book_num) {
		int result = dao.updateBook(book, book_num);
		if (result == 1) {
			System.out.println("�Ϸ�");	
		} else {
			System.out.println("����");
		}
	}

	// ����
	public static void deleteBook(int book_num) {
		int result = dao.deleteBook(book_num);
		if (result == 1) {
			System.out.println("�Ϸ�");	
		} else {
			System.out.println("����");
		}
	}

	// �˻�
	public static void selectBook(int book_num) {
		BookVO bookVo = dao.selectBook(book_num);
		System.out.println(bookVo);
	}

	// ���
	public static void selectBookList() {
		List<BookVO> bookList = dao.selectBookList();
		for (BookVO v : bookList) {
			System.out.println(v);
		}
	}

	public static void init() {
		System.out.println("*********************");
		System.out.println("******* 1. �߰� *******");
		System.out.println("******* 2. ���� *******");
		System.out.println("******* 3. ���� *******");
		System.out.println("******* 4. �˻� *******");
		System.out.println("******* 5. ��� *******");
		System.out.println("******* 6. ���� *******");
		System.out.println("*********************");
		System.out.print("���� : ");
	}
}
