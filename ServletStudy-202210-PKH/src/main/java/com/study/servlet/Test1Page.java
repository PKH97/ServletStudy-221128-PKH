package com.study.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test1Page
 */
@WebServlet("/test/page/1")
public class Test1Page extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/test1.html").forward(request, response);
		// Dispatcher -> 해당 페이지로 응답을 해준다!! (자바코드안에서 접근을 하고 있기 때문에 WEB-INF폴더 안이라도 접근가능)
		
	}

}
