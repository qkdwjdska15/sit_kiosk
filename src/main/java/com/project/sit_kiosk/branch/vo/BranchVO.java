package com.project.sit_kiosk.branch.vo;

import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@RequiredArgsConstructor
@ToString
public class BranchVO {
	private int branchManager_no;
	private String branchManager_id;
	private String branchManager_pwd;
	private String branchManager_email;
	private String branchManager_phone;
	private String branchManager_since;
	private String branchManager_access_date;
	private int branchManager_status; //0 정상 1 탈퇴
}
