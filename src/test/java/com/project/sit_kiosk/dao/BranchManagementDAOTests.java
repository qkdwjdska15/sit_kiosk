package com.project.sit_kiosk.dao;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.project.sit_kiosk.admin.management.dao.BranchManagementDAO;
import com.project.sit_kiosk.branch.vo.BranchVO;
import com.project.sit_kiosk.paging.Criteria;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
@Log4j
public class BranchManagementDAOTests {
	@Setter(onMethod_ = @Autowired)
	private BranchManagementDAO dao;
	
	
	@Test
	public void testGetAllBranchInfo() {
		for(BranchVO vo : dao.getAllBranchInfo()) {
			log.info(vo);
		}
	}
	
	@Test
	public void testPaging() {
		Criteria cri = new Criteria();
		cri.setPageNum(3);
		cri.setAmount(10);
		List<BranchVO> list = dao.getBranchInfoWithPaging(cri);
		list.forEach(branchInfo -> log.info(branchInfo));
	}
}
