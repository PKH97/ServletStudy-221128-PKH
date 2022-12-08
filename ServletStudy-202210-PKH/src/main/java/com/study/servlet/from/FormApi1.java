package com.study.servlet.from;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FromApi1
 */
@WebServlet("/api/form/1")
public class FormApi1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("get 요청옴!!");
		
		System.out.println(request.getParameter("name"));
		System.out.println(request.getParameter("phone"));
		System.out.println(request.getParameter("email"));
		System.out.println(request.getParameter("address"));
		System.out.println(request.getParameter("pw"));
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response, String name, String phone, String email, String pw, String address) throws ServletException, IOException {
		System.out.println("post 요청옴!!");
		
		request.setCharacterEncoding("UTF-8");
		
		System.out.println(request.getParameter("name"));
		System.out.println(request.getParameter("phone"));
		System.out.println(request.getParameter("email"));
		System.out.println(request.getParameter("address"));
		System.out.println(request.getParameter("pw"));
		
		
		response.setContentType("text/plain; charset=utf8");
		response.setCharacterEncoding("UTF-8");
		
		PrintWriter out = response.getWriter();
		out.println("이름: " + request.getParameter("name"));
		out.println("연락처: " + request.getParameter("phone"));
		out.println("이메일: " + request.getParameter("email"));
		out.println("주소: " + request.getParameter("address"));
		out.println("비밀번호: " + request.getParameter("pw"));
	}
}
