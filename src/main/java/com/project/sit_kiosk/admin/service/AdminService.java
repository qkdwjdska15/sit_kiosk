package com.project.sit_kiosk.admin.service;

import com.project.sit_kiosk.admin.vo.AdminVO;

public interface AdminService {
	public AdminVO adminLogin(AdminVO avo);

	public boolean adminLoginInfoUpdate(AdminVO avo);
}
