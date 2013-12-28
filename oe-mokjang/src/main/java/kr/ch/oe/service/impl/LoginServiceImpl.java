/**
 * 
 */
package kr.ch.oe.service.impl;

import kr.ch.oe.dao.LoginMapper;
import kr.ch.oe.dao.MemberMapper;
import kr.ch.oe.model.Member;
import kr.ch.oe.service.LoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author gusfot
 *
 */
@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginMapper loginMapper;
	
	@Autowired
	MemberMapper memberMapper;

	@Override
	public void regist(Member member) {
		loginMapper.regist(member);
	}

	@Override
	public Member login(Member member) {
		
		return memberMapper.selectMemberByEmailAndPassword(member);
		
	}

	@Override
	public void edit(Member member) {
		loginMapper.edit(member);
		
	}

	@Override
	public void delete(Member person) {
		loginMapper.delete(person);
		
	}
	
}
