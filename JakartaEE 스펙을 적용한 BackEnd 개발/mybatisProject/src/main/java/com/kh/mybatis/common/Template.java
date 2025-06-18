package com.kh.mybatis.common;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Template {
	public static SqlSession getSqlSession() {
		//mybatis-config.xml파일 읽어들이기
		String resource = "/mybatis-config.xml";
		
		SqlSession sqlSession = null;

		try {
			InputStream inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			
			sqlSession = sqlSessionFactory.openSession(false); // false -> 수동커밋
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return sqlSession;
	}
}
