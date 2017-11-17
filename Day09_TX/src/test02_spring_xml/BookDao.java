package test02_spring_xml;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import vo.BookVO;

@Component
public class BookDao {
	@Autowired
	private SqlSessionTemplate session;
	public void setSession(SqlSessionTemplate session) {
		this.session = session;
	}
	public int insert(BookVO b) {
		BookMapper mapper = session.getMapper(BookMapper.class);
		return mapper.insert(b);
	}
}
