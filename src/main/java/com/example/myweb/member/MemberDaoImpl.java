package com.example.myweb.member;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class MemberDaoImpl implements MemberDao {
	// 멤버 목록 구현하기
	public static final List<MemberDto> memberList;
	static {
		memberList = new ArrayList<MemberDto>();
		memberList.add(new MemberDto("user0", "1234", "관리자", "Admin"));
		memberList.add(new MemberDto("user1", "1234", "홍길동", "User"));
		memberList.add(new MemberDto("user2", "1234", "김길동", "User"));
		memberList.add(new MemberDto("user2", "1234", "이길동", "User"));
		memberList.add(new MemberDto("user4", "1234", "박길동", "User"));
	}
	
	@Override
	public List<MemberDto> selectAll() {
		System.out.println("selectAll() 실행");
		
		return memberList;
	}
	
	// 상세보기, 저장, 수정, 삭제 기능 구현하기
	@Override
	public MemberDto findById(MemberDto dto) {
		int idx = memberList.indexOf(dto);
		MemberDto member = null;
		if(idx != -1) {
			member = memberList.get(idx);
		}
		return member;
	}
	
	@Override
	public void insert(MemberDto dto) {
	    memberList.add(dto);
	}

	@Override
	public void update(MemberDto dto) {
	    int idx = memberList.indexOf(dto);
	    if (idx != -1) {
	        memberList.set(idx, dto);
	    }
	}

	@Override
	public void delete(MemberDto dto) {
	    memberList.remove(dto);
	}
}