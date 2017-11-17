package test01_jdbc;

import java.sql.SQLException;

import vo.BookVO;

public class BookService {
	private BookDao dao = new BookDao();
	
	public boolean addBookSet() {
		dao.makeConnection();
		try {
			dao.startTX(); //트랜잭션 시작
			BookVO b = new BookVO();
			b.setTitle("트랜잭션");
			b.setPrice(10000);
			b.setWriter("DBA");
			b.setPublisher("Mysql");
			
			BookVO b2 = new BookVO("[부록]트랜잭션","dba",1000,"Mysql");
			dao.insert(b);
			dao.insert(b2);
			dao.commitTX(); //문제가 없으면 commit
			return true;
		} catch (SQLException e) {
			//b , b2에 하나라도 문제가 있으면 오류가 발생해서 해당 함수 실행
			dao.rollbackTX();
			e.printStackTrace();
			return false;
		} finally {
			dao.closeConnection();
		}
	}
}
