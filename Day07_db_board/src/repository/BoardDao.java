package repository;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import repository.mapper.BoardMapper;
import vo.BoardVO;

public class BoardDao {
	private SqlSessionTemplate session;
	public void setSession(SqlSessionTemplate session) {
		this.session = session;
	}
	
	public int insert(BoardVO vo) {
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		return mapper.insert(vo);
	}
	public List<BoardVO> selectAll(HashMap<String, Integer> hashmap) {
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		return mapper.selectAll(hashmap);
	}
	public BoardVO selectBoard(int board_num) {
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		return mapper.selectBoard(board_num);
	}
	public int updateBoard(BoardVO vo, int write_num) {
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		return mapper.updateBoard(vo, write_num);
	}
	public int deleteBoard(int write_num) {
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		return mapper.deleteBoard(write_num);
	}
	public String checkPassword(int write_num) {
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		return mapper.checkPassword(write_num);
	}
	public int updateReviewCnt(HashMap<String, Integer> hashmap) {
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		return mapper.updateReviewCnt(hashmap);
	}
	public int replyInsert(BoardVO vo) {
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		return mapper.replayInsert(vo);
	}
	public List<BoardVO> selectReply(int write_num) {
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		return mapper.selectReply(write_num);
	}
}
