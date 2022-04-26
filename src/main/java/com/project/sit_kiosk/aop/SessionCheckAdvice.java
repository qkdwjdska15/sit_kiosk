package com.project.sit_kiosk.aop;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.log4j.Log4j;

@Aspect
@Component
@Log4j
public class SessionCheckAdvice {
	@Pointcut("execution(* com.project.sit_kiosk.admin..*Controller.*_Chk(..))")
	private void sitKioskSessionCheck() {}

	@Around(value = "sitKioskSessionCheck()")
	public Object sitKioskAdminSessionCheck(ProceedingJoinPoint joinPoint) throws Throwable {
		HttpServletRequest request = null;
		Object result = null;
		ModelAndView mav = new ModelAndView();
		for (Object o : joinPoint.getArgs()) {
			if (o instanceof HttpServletRequest) {
				request = (HttpServletRequest) o;
			}
		}
		// 로그인을 체크해야 하는 페이지
		if (request != null) {
			// 세션체킹
			HttpSession session = request.getSession();
			String login = (String) session.getAttribute("adminLoginResult");
			if (login == null || "".equals(login)) {
				log.info("로그인 세션 없음");
				return "admin/login";
			}
		} // request가 null이 아니라면
			// controller에서 httprequest가 없거나 /login페이지라면
		
		log.info("로그인 세션 있음");
		result = joinPoint.proceed();

		return result;

	}

}
