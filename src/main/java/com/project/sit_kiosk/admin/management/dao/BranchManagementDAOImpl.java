package com.project.sit_kiosk.admin.management.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.sit_kiosk.branch.vo.BranchVO;

@Repository
public class BranchManagementDAOImpl implements BranchManagementDAO {
	
	@Autowired
	SqlSession session;
	
	@Override
	public List<BranchVO> getAllBranchInfo() {
		return session.selectList("getAllBranchInfo");
	}

}
