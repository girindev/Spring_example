package test03_xml_interface;

import java.util.List;

import vo.BookVO;

public interface BookMapper {
	public int insert(BookVO book);

	public BookVO selectBook(int jBookNum);

	public List<BookVO> selectList();
}