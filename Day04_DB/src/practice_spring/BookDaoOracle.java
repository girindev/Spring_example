package practice_spring;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import vo.BookVO;

public class BookDaoOracle {
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int insert(BookVO book) {
		String sql = "insert into book(book_num,title, publisher, price, writer)"
				+ " values(book_num_seq.nextval,?,?,?,?)";
		return jdbcTemplate.update(sql,
				book.getTitle(),
				book.getPublisher(),
				book.getPrice(),
				book.getWriter());
	}
	public BookVO selectBook(int book_num) {
		String sql = "Select * from book where book_num = ?";
		return jdbcTemplate.queryForObject(sql, new BookMapper(), book_num);
	}
	public List<BookVO> selectBookList() {
		String sql ="SELECT * FROM BOOK";
		return jdbcTemplate.query(sql, new BookMapper());
	}
	public int deleteBook(int book_num) {
		String sql = "Delete from book where book_num = ?";
		return jdbcTemplate.update(sql,book_num);
	}
	public int updateBook(BookVO book, int book_num) {
		String sql = "update book set publisher =?, price =?, writer=?, title =?"
				+ " where book_num = ?";
		return jdbcTemplate.update(sql,
				book.getPublisher(),
				book.getPrice(),
				book.getWriter(),
				book.getTitle(),
				book_num
				);
	}
	
	class BookMapper implements RowMapper<BookVO> {

		@Override
		public BookVO mapRow(ResultSet rs, int arg1) throws SQLException {
			BookVO bookVO = new BookVO(
					rs.getInt("book_num"),
					rs.getString("title"),
					rs.getString("writer"),
					rs.getInt("price"),
					rs.getString("publisher")
			);
			return bookVO;
		}
		
	}
}
