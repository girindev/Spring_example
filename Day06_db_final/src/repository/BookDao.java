package repository;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import repository.mapper.BookMapper;
import vo.BookVO;

public class BookDao {
	private SqlSessionTemplate session;
	public void setSession(SqlSessionTemplate session) {
		this.session = session;
	}	
	public int insert(BookVO book) {
		BookMapper mapper =
				session.getMapper(BookMapper.class);
		return mapper.insert(book);
	}
	public List<BookVO> selectAll(){
		BookMapper mapper = session.getMapper(BookMapper.class);
		return mapper.selectAll();
	}
}
