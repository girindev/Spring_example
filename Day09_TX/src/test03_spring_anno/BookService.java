package test03_spring_anno;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import vo.BookVO;

@Component("service")
public class BookService {
	@Autowired
	private BookDao dao;
	public void setDao(BookDao dao) {
		this.dao = dao;
	}
	/////////////////////////////////
	@Transactional
	public boolean addBookSet() {
		boolean result = false;
		BookVO b = new BookVO("트랜잭션", "DBA", 10000 , "Mysql");
		BookVO b2 = new BookVO("[부록]트랜잭션", "dba", 1000, "Mysql");
		int result1 = dao.insert(b);
		System.out.println("첫 번째 insert : " + result1);
		
		int n = 1/0; //의도적 에러발생
		
		int result2 = dao.insert(b2);
		System.out.println("첫 번째 insert : " + result1);
		if (result1 == 1 && result2 == 1) {
			result = true;
		}
		return result;
	}
}
