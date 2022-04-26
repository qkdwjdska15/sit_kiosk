package com.project.sit_kiosk.admin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.project.sit_kiosk.admin.service.AdminService;
import com.project.sit_kiosk.admin.vo.AdminVO;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/admin/")
@AllArgsConstructor
public class AdminController {
	private AdminService adminService;
	
	@GetMapping("/login")
	public void adminLogin() {
		log.info("adminLogin");
	}
	
	
	@PostMapping("/login")
	public String adminLoginResult(AdminVO avo, HttpSession session, RedirectAttributes rttr, HttpServletRequest request) {
		log.info("adminLoginResult");
		log.info(avo);
		AdminVO loginInfo = adminService.adminLogin(avo);
		if(loginInfo != null) {
			session.setAttribute("adminInfo", loginInfo);
			String ip = null;
	        ip = request.getHeader("X-Forwarded-For");
	        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) { 
	            ip = request.getHeader("Proxy-Client-IP"); 
	        } 
	        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) { 
	            ip = request.getHeader("WL-Proxy-Client-IP"); 
	        } 
	        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) { 
	            ip = request.getHeader("HTTP_CLIENT_IP"); 
	        } 
	        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) { 
	            ip = request.getHeader("HTTP_X_FORWARDED_FOR"); 
	        }
	        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) { 
	            ip = request.getHeader("X-Real-IP"); 
	        }
	        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) { 
	            ip = request.getHeader("X-RealIP"); 
	        }
	        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) { 
	            ip = request.getHeader("REMOTE_ADDR");
	        }
	        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) { 
	            ip = request.getRemoteAddr(); 
	        }
	        avo.setLast_access_ip(ip);
	        adminService.adminLoginInfoUpdate(avo);
			return "redirect:/admin/management/branchInfo";
		}else {
			rttr.addFlashAttribute("result" , "fail");
			rttr.addFlashAttribute("executions" , "로그인");
			return "redirect:/admin/login";
		}
	}
}
