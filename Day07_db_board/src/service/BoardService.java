package service;

import java.util.HashMap;
import java.util.List;

import repository.BoardDao;
import vo.BoardVO;

public class BoardService {
	private BoardDao dao;
    public void setDao(BoardDao dao) {
        this.dao = dao;
    }
    public int insert(BoardVO vo) {
    	return dao.insert(vo);
	}
	public List<BoardVO> selectAll(HashMap<String, Integer> hashmap) {
		return dao.selectAll(hashmap);
	}
	public List<BoardVO> selectReply(int write_num) {
		return dao.selectReply(write_num);
	}
	public BoardVO selectBoard(int board_num) {
		return dao.selectBoard(board_num);
	}
	public int updateReviewCnt(HashMap<String, Integer> hashmap) {
		return dao.updateReviewCnt(hashmap);
	}
	public int updateBoard(BoardVO vo, int write_num) {
		return dao.updateBoard(vo, write_num);
	}
	public int deleteBoard(int write_num) {
		return dao.deleteBoard(write_num);
	}
	public String selectPassword(int write_num) {
		return dao.checkPassword(write_num);
	}
	public int replyInsert(BoardVO vo) {
		return dao.replyInsert(vo);
	}
}
