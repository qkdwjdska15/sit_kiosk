package com.project.sit_kiosk.admin.management.service;

import java.util.List;

import com.project.sit_kiosk.branch.vo.BranchVO;
import com.project.sit_kiosk.paging.Criteria;

public interface BranchManagementService {
	//public List<BranchVO> getAllBranchInfo();
	public List<BranchVO> getAllBranchInfo(Criteria cri);
}
