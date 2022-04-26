package com.project.sit_kiosk.admin.dao;

import com.project.sit_kiosk.admin.vo.AdminVO;

public interface AdminDAO {
	public AdminVO adminLogin(AdminVO avo);

	public int adminLoginInfoUpdate(AdminVO avo);
}
