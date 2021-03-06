package com.project.sit_kiosk.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.sit_kiosk.admin.dao.AdminDAO;
import com.project.sit_kiosk.admin.vo.AdminVO;

import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@ToString
public class AdminServiceImple implements AdminService {
	
	@Autowired
	private AdminDAO aDao;
	
	@Override
	public AdminVO adminLogin(AdminVO avo) {
		log.info("adminLogin..." + avo);
		return aDao.adminLogin(avo);
	}

	@Override
	public boolean adminLoginInfoUpdate(AdminVO avo) {
		log.info("adminLoginInfoUpdate..." + avo);
		return aDao.adminLoginInfoUpdate(avo) == 1;
	}

}
