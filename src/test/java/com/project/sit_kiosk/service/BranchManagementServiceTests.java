package com.project.sit_kiosk.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.project.sit_kiosk.admin.management.service.BranchManagementService;
import com.project.sit_kiosk.branch.vo.BranchVO;
import com.project.sit_kiosk.paging.Criteria;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
@Log4j
public class BranchManagementServiceTests {
	@Setter(onMethod_ = @Autowired)
	private BranchManagementService service;
	
	
	@Test
	public void testGetBranchInfo() {
		service.getAllBranchInfo(new Criteria(2,10))
				.forEach(branchInfo -> log.info(branchInfo));	
	}
}
