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
				System.out.println("*****책 추가 정보*****");
				System.out.print("제목 : ");
				title = in.next();
				System.out.print("작가 : ");
				writer = in.next();
				System.out.print("출판사 : ");
				publisher = in.next();
				System.out.print("가격 : ");
				price = in.nextInt();
				book = new BookVO(title, writer, price, publisher);
				addBook(book);
				break;
			case 2:
				System.out.println("*****책 수정 정보*****");
				System.out.print("책 번호 : ");
				book_num = in.nextInt();
				System.out.print("제목 : ");
				title = in.next();
				System.out.print("작가 : ");
				writer = in.next();
				System.out.print("출판사 : ");
				publisher = in.next();
				System.out.print("가격 : ");
				price = in.nextInt();
				book = new BookVO(title, writer, price, publisher);
				updateBook(book, book_num);
				break;
			case 3:
				System.out.println("*****책 삭제 정보*****");
				System.out.print("책 번호 : ");
				book_num = in.nextInt();
				deleteBook(book_num);
				break;
			case 4:
				System.out.println("*****책 검색 정보*****");
				System.out.print("책 번호 : ");
				book_num = in.nextInt();
				selectBook(book_num);
				break;
			case 5:
				System.out.println("*****책 목록 정보*****");
				selectBookList();
				break;
			case 6:
				flag = false;
				System.out.println("*****프로그램 종료*****");
				break;
			}
		}
	}

	// 추가
	public static void addBook(BookVO book) {
		int result = dao.insert(book);
		if (result == 1) {
			System.out.println("완료");	
		} else {
			System.out.println("실패");
		}
	}

	// 수정
	public static void updateBook(BookVO book, int book_num) {
		int result = dao.updateBook(book, book_num);
		if (result == 1) {
			System.out.println("완료");	
		} else {
			System.out.println("실패");
		}
	}

	// 삭제
	public static void deleteBook(int book_num) {
		int result = dao.deleteBook(book_num);
		if (result == 1) {
			System.out.println("완료");	
		} else {
			System.out.println("실패");
		}
	}

	// 검색
	public static void selectBook(int book_num) {
		BookVO bookVo = dao.selectBook(book_num);
		System.out.println(bookVo);
	}

	// 목록
	public static void selectBookList() {
		List<BookVO> bookList = dao.selectBookList();
		for (BookVO v : bookList) {
			System.out.println(v);
		}
	}

	public static void init() {
		System.out.println("*********************");
		System.out.println("******* 1. 추가 *******");
		System.out.println("******* 2. 수정 *******");
		System.out.println("******* 3. 삭제 *******");
		System.out.println("******* 4. 검색 *******");
		System.out.println("******* 5. 목록 *******");
		System.out.println("******* 6. 종료 *******");
		System.out.println("*********************");
		System.out.print("선택 : ");
	}
}
