package com.project.sit_kiosk.admin.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.sit_kiosk.admin.vo.AdminVO;

@Repository
public class AdminDAOImpl implements AdminDAO {
	
	@Autowired
	private SqlSession session;
	
	@Override
	public AdminVO adminLogin(AdminVO avo) {
		return session.selectOne("adminLogin" , avo);
	}

	@Override
	public int adminLoginInfoUpdate(AdminVO avo) {
		return session.update("adminLoginInfoUpdate" , avo);
	}

}
