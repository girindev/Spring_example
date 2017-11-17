package service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import repository.MemberDao;
import repository.mapper.MemberMapper;
import vo.MemberVO;

@Component
public class MemberService {

	@Autowired
	private MemberDao dao;

	public void setDao(MemberDao dao) {
		this.dao = dao;
	}

	////////////////////////////////////////////////////////
	public boolean insertMember(MemberVO member) {
		if (dao.insertMember(member) > 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * �α��� �޼ҵ�
	 * 
	 * @param HashMap
	 *            map
	 */
	public boolean loginMember(HashMap<String, String> map) {
		MemberVO member = dao.loginMember(map);
		if (member != null) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * ȸ�� ��ȸ
	 * 
	 * @param String
	 *            id
	 */
	public MemberVO selectMember(String id) {
		MemberVO member = dao.selectMember(id);
		return member;
	}
	
	/**
	 * ȸ�� ���� ������Ʈ
	 * @param HashMap map
	 * */
	public boolean updateMyInfo(HashMap<String, String> map) {
		int result = dao.updateMyInfo(map);
		if (result > 0) {
			return true;
		} else {
			return false;
		}
	}
}
