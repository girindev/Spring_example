package test01_jdbc;

import java.sql.SQLException;

import vo.BookVO;

public class BookService {
	private BookDao dao = new BookDao();
	
	public boolean addBookSet() {
		dao.makeConnection();
		try {
			dao.startTX(); //Ʈ����� ����
			BookVO b = new BookVO();
			b.setTitle("Ʈ�����");
			b.setPrice(10000);
			b.setWriter("DBA");
			b.setPublisher("Mysql");
			
			BookVO b2 = new BookVO("[�η�]Ʈ�����","dba",1000,"Mysql");
			dao.insert(b);
			dao.insert(b2);
			dao.commitTX(); //������ ������ commit
			return true;
		} catch (SQLException e) {
			//b , b2�� �ϳ��� ������ ������ ������ �߻��ؼ� �ش� �Լ� ����
			dao.rollbackTX();
			e.printStackTrace();
			return false;
		} finally {
			dao.closeConnection();
		}
	}
}
