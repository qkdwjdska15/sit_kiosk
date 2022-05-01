package com.project.sit_kiosk.admin.management.dao;

import java.util.List;

import com.project.sit_kiosk.branch.vo.BranchVO;
import com.project.sit_kiosk.paging.Criteria;

public interface BranchManagementDAO {
	public List<BranchVO> getAllBranchInfo();
	public List<BranchVO> getBranchInfoWithPaging(Criteria cri);
}
