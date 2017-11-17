package repository.mapper;

import java.util.HashMap;
import java.util.List;

import vo.BoardVO;

public interface BoardMapper {
	public int insert(BoardVO vo);
	public List<BoardVO> selectAll(HashMap<String, Integer> hashmap);
	public BoardVO selectBoard(int write_num);
	public int updateBoard(BoardVO vo, int write_num);
	public int deleteBoard(int write_num);
	public String checkPassword(int write_num);
	public int updateReviewCnt(HashMap<String, Integer> hashmap);
	public int replayInsert(BoardVO vo);
	public List<BoardVO> selectReply(int write_num);
}
