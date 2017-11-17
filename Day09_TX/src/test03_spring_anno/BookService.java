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
		BookVO b = new BookVO("Ʈ�����", "DBA", 10000 , "Mysql");
		BookVO b2 = new BookVO("[�η�]Ʈ�����", "dba", 1000, "Mysql");
		int result1 = dao.insert(b);
		System.out.println("ù ��° insert : " + result1);
		
		int n = 1/0; //�ǵ��� �����߻�
		
		int result2 = dao.insert(b2);
		System.out.println("ù ��° insert : " + result1);
		if (result1 == 1 && result2 == 1) {
			result = true;
		}
		return result;
	}
}
