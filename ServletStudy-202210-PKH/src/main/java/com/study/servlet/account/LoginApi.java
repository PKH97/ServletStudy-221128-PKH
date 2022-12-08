package com.study.servlet.account;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.study.Domain.User;
import com.study.service.AccountService;
import com.study.util.DTO;


@WebServlet("/auth/login")
public class LoginApi extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Map<String, String> loginUser = DTO.getParms(request);
		AccountService accountService = AccountService.getInstance();
		
		User user = accountService.loadUserByUsername(loginUser.get("username"));
		
		if(user == null) {
			System.out.println("아이디 틀림!");
			request.getRequestDispatcher("WEB-INF/accunt/error_login.html").forward(request, response);
			return;
		}
		if(!accountService.chackPassword(user, loginUser.get("password"))){
			System.out.println("비밀번호 틀림!");	
			request.getRequestDispatcher("WEB-INF/accunt/error_login.html").forward(request, response);
			return;
		}
		//위의 if에 걸리지 않으면
		
		//로그인 성공!
		HttpSession session = request.getSession();
		session.setAttribute("principal", user);
		
		response.sendRedirect("/mypage");
	
	}

}

//로그인시 post를 사용하는 이유 -> 로그인은 CRUD중 R이고 post요청을 통해 정보를 노출하지 않아야한다.