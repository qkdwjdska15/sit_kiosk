package com.project.sit_kiosk.admin.management.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.sit_kiosk.admin.management.service.BranchManagementService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/admin/management")
@AllArgsConstructor
public class AdminManagementController {
	
	@Autowired
	private BranchManagementService service;
	
	
	@GetMapping("/branchInfo")
	public String branchInfo_Chk(HttpServletRequest request, HttpSession session, Model model) {
		log.info("branchInfo");
		model.addAttribute("branchList" , service.getAllBranchInfo());
		return "admin/management/branchInfo";
	}
}
