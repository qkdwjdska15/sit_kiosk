package com.project.sit_kiosk.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.project.sit_kiosk.admin.service.AdminService;
import com.project.sit_kiosk.admin.vo.AdminVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
@Log4j
public class AdminServiceTests {
	
	@Setter(onMethod_ = @Autowired )
	private AdminService service;
	
	@Test
	public void testAdminLogin() {
		AdminVO avo = new AdminVO();
		avo.setAdmin_id("adminID");
		avo.setAdmin_pwd("adminPWD");
		log.info(service.adminLogin(avo));
	}
}
