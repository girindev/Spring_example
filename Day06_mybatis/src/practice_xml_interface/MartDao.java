package practice_xml_interface;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import vo.MartVO;

public class MartDao {
	private SqlSessionFactory factory;
	public MartDao() {
		String resource = "practice_xml_interface/conf.xml";
		InputStream is = null;
		
		try {
			is = Resources.getResourceAsStream(resource);
			factory = new SqlSessionFactoryBuilder().build(is);
		} catch (IOException ex) {
			System.out.println("마이바티스 설정파일 에러");
			ex.printStackTrace();
		} finally {
			try {
				is.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
	public int insert(MartVO mart) {
		SqlSession session = factory.openSession(true);
//		session.insert("psh.insert", mart);
		MartMapper mapper = session.getMapper(MartMapper.class);
		return mapper.insert(mart);
	}
	public List<MartVO> selectList() {
		SqlSession session = factory.openSession();
		MartMapper mapper = session.getMapper(MartMapper.class);
		return mapper.selectList();
	}
}
