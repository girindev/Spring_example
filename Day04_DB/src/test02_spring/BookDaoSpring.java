package test02_spring;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import vo.BookVO;

public class BookDaoSpring {
	// dao가 의존하는 객체
	private JdbcTemplate jdbcTemplate;
	//의존객체 주입을 위한 생성자, 설정자
	public BookDaoSpring() {
		// TODO Auto-generated constructor stub
	}
	public BookDaoSpring(JdbcTemplate jdbcTemplate) {
		// TODO Auto-generated constructor stub
		this.jdbcTemplate = jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	///////////////////////////////////////////////////////
	public int insert(BookVO book) {
		String sql =
				"INSERT into book(TITLE, PUBLISHER, PRICE, WRITER)"
				+ " Values(?,?,?,?)";
		return jdbcTemplate.update(sql,
				book.getTitle(),
				book.getPublisher(),
				book.getPrice(),
				book.getWriter());
	}
	
	public BookVO selectBook(int bookNum) {
		String sql = "Select * FROM book where book_num =?";
		return jdbcTemplate.queryForObject(sql, new BookMapper(), bookNum);
	}
	public List<BookVO> selectBookList() {
		String sql = "Select * FROM book";
		return jdbcTemplate.query(sql, new BookMapper());
	}
	
	class BookMapper implements RowMapper<BookVO> {
		@Override
		public BookVO mapRow(ResultSet rs, int arg1) throws SQLException {
			BookVO book = new BookVO();
			book.setBookNum(rs.getInt("book_num"));
			book.setPrice(rs.getInt("price"));
			book.setPublisher(rs.getString("publisher"));
			book.setWriter(rs.getString("writer"));
			return book;
		}
		
	}
}
