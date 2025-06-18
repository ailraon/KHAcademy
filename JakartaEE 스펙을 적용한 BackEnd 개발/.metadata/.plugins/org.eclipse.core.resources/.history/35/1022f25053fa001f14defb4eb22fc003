package com.kh.mybatis.member.model.dao;

import org.apache.ibatis.session.SqlSession;

import com.kh.mybatis.member.model.vo.Member;

public class MemberDao {
	public Member loginMember(SqlSession sqlSession, Member m) {
		//select -> ResultSet -> Member
		
		Member loginMember = sqlSession.selectOne("MemberMapper.loginMember", m);
		return loginMember;
	}
}
