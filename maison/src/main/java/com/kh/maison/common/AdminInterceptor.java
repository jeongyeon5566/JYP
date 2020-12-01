package com.kh.maison.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.kh.maison.member.model.vo.Member;

public class AdminInterceptor extends HandlerInterceptorAdapter {

	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		Member loginMember = (Member)(request.getSession().getAttribute("loginMember"));
		String msg="";
		String loc="";
		if(loginMember==null || !loginMember.getMemberId().equals("admin")) {
			msg="관리자 로그인 후 이용해주세요";
			loc="/";
			request.setAttribute("msg", msg);
			request.setAttribute("loc", loc);
			request.getRequestDispatcher("/WEB-INF/views/common/msg.jsp").forward(request, response);
		}
		return super.preHandle(request, response, handler);
	}

	
}
