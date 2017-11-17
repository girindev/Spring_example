package test01_xml;

import vo.BookVO;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookDao dao = new BookDao();
		
		for (BookVO b : dao.selectBookList()) {
			System.out.println(b.toString());
		}
	}
}
