package com.project.sit_kiosk.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.project.sit_kiosk.admin.dao.AdminDAO;
import com.project.sit_kiosk.admin.vo.AdminVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
@Log4j
public class AdminDAOTests {
	@Setter(onMethod_ = @Autowired )
	private AdminDAO dao;
	
	@Test
	public void testAdminLogin() {
		AdminVO avo = new AdminVO("adminID" , "adminPWD");
		System.out.println(dao.adminLogin(avo));
	}
}
