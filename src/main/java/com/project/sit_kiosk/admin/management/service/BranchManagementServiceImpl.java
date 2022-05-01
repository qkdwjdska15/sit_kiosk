package com.project.sit_kiosk.admin.management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.sit_kiosk.admin.management.dao.BranchManagementDAO;
import com.project.sit_kiosk.branch.vo.BranchVO;
import com.project.sit_kiosk.paging.Criteria;

import lombok.ToString;

@Service
@ToString
public class BranchManagementServiceImpl implements BranchManagementService {
	
	@Autowired
	private BranchManagementDAO dao;

	@Override
	public List<BranchVO> getAllBranchInfo(Criteria cri) {
		return dao.getBranchInfoWithPaging(cri);
	}
	
	/*
	 * @Override public List<BranchVO> getAllBranchInfo() { return
	 * dao.getAllBranchInfo(); }
	 */

}
