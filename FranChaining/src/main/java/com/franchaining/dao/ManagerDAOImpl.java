package com.franchaining.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import com.franchaining.vo.RegVO;

@Repository
public class ManagerDAOImpl implements ManagerDAO {

	@Inject
	private SqlSession sqlSession;
	   
	@Override
	public void register(RegVO regVO) throws Exception {

		sqlSession.insert("managerMapper.register", regVO);
	}
	

}
