package practice_xml_interface;

import java.util.List;

import vo.MartVO;

public interface MartMapper {
	public int insert(MartVO mart);

	public List<MartVO> selectList();

	public MartVO selectMart(int mart_num);
}
