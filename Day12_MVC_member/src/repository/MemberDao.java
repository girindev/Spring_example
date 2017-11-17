package repository;

import java.util.HashMap;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import repository.mapper.MemberMapper;
import vo.MemberVO;

@Component
public class MemberDao {
	
	@Autowired
	private SqlSessionTemplate session;
	/**
	 * ȸ�� ���� �޼ҵ�
	 * @param MemberVo member
	 * */
	public int insertMember(MemberVO member) {
		MemberMapper mapper = session.getMapper(MemberMapper.class);
		return mapper.joinMember(member);
	}
	/**
	 * �α��� �޼ҵ�
	 * @param HashMap map
	 * */
	public MemberVO loginMember(HashMap<String, String> map) {
		MemberMapper mapper = session.getMapper(MemberMapper.class);
		return mapper.loginMember(map);
	}
	/**
	 * ȸ�� ��ȸ
	 * @param String id
	 * */
	public MemberVO selectMember(String id) {
		MemberMapper mapper = session.getMapper(MemberMapper.class);
		return mapper.selectMember(id);
	}
	
	/**
	 * ȸ�� ���� ������Ʈ
	 * @param HashMap map
	 * */
	public int updateMyInfo(HashMap<String, String> map) {
		MemberMapper mapper = session.getMapper(MemberMapper.class);
		return mapper.updateMyInfo(map);
	}
}
