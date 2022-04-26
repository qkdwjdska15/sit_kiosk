package com.project.sit_kiosk.admin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.sit_kiosk.admin.service.AdminService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/admin/")
@AllArgsConstructor
public class AdminController {
	private AdminService adminService;
	
	@GetMapping("/login")
	public void adminLogin(HttpSession session, HttpServletRequest request) {
		log.info("adminLogin 호출");
		session.setAttribute("adminLoginResult", "test");
	}
	
	@GetMapping("/test")
	public String test_Chk(HttpSession session, Model model, HttpServletRequest request) {
		log.info("test");
		return "admin/test";
	}
}
