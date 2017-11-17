package test01_xml;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import vo.BookVO;

public class BookDao {
	private SqlSessionFactory factory;
	
	public BookDao() {
		// ���̹�Ƽ�� �������� �о���̱� 
		String resource = "test01_xml/conf.xml";
		InputStream is = null;
		
		try {
			is = Resources.getResourceAsStream(resource);
			factory = new SqlSessionFactoryBuilder().build(is);
		} catch (IOException ex) {
			System.out.println("���̹�Ƽ�� �������� ����");
			ex.printStackTrace();
		} finally {
			try {
				is.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
	
	public int insertBook(BookVO book) {
		SqlSession session = factory.openSession();
		return session.insert("psh.insert", book);
	}
	public List<BookVO> selectBookList() {
		SqlSession session = factory.openSession();
		return session.selectList("psh.selectList");
	}
}
