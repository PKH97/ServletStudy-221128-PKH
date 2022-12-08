package com.study.servlet.cookie;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Cookie1
 */
@WebServlet("/cookie/1")
public class Cookie1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Cookie cookie = new Cookie("data1", "쿠키저장!!"); // 쿠키에는 띄어쓰기 X.
		cookie.setMaxAge(60 * 60); // 60*60 = 1시간
		
		Cookie cookie2 = new Cookie("data2", URLEncoder.encode("데이터하나더추가!", "UTF-8"));
		cookie2.setMaxAge(60 * 60);
		
		response.addCookie(cookie);
		response.addCookie(cookie2);
	
	}

}
