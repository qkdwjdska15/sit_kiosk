package com.project.sit_kiosk.admin.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@ToString
public class AdminVO {
	private String admin_id;
	private String admin_pwd;
	private String last_access_date;
	private String last_access_ip;
}
