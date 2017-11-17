package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import repository.BookDao;
import vo.BookVO;

@Component
public class BookService {
	
	@Autowired
	private BookDao dao;
	public void setDao(BookDao dao) {
		this.dao = dao;
	}
	/////////////////////////////////
	public int addBook(BookVO book) {
		if (dao.insert(book) > 0) {
			return book.getjBookNum();
		} else {
			return -1;
		}
	}
	public List<BookVO> selectAll() {
		return dao.selectAll();
	}
	public BookVO selectBook(int bookNum) {
		return dao.selectBook(bookNum);
	}
	public int updateBook(BookVO book) {
		return dao.update(book);
	}
	public int deleteBook(int bookNum) {
		return dao.delete(bookNum);
	}
}
