package com.project.sit_kiosk.admin.management.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/admin/management")
@AllArgsConstructor
public class AdminManagementController {
	
	@GetMapping("/branchInfo")
	public String branchInfo_Chk(HttpServletRequest request) {
		log.info("branchInfo");
		
		return "admin/management/branchInfo";
	}
}
