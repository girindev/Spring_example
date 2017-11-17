package repository.mapper;

import java.util.List;

import vo.BookVO;


//repository.mapper.BookMapper
public interface BookMapper {
	public int insert(BookVO book);
	public List<BookVO> selectAll();
	public BookVO selectBook(int bookNum);
	public int update(BookVO book);
	public int delete(int bookNum);
}