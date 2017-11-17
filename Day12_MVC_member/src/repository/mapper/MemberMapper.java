package repository.mapper;

import java.util.HashMap;

import vo.MemberVO;

public interface MemberMapper {
	public int joinMember(MemberVO member);
	public MemberVO loginMember(HashMap<String, String> map);
	public MemberVO selectMember(String id);
	public int updateMyInfo(HashMap<String, String> map);
}
