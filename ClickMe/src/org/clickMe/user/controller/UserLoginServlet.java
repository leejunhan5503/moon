package org.clickMe.user.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.reflection.SystemMetaObject;
import org.clickMe.common.model.dto.UserDTO;
import org.clickMe.user.service.UserService;

@WebServlet("/user/login")
public class UserLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		/* Http 요청의 파라미터 값 "userId", "userPsw"를 얻는다. */
		String userId = request.getParameter("userId");
		String userPwd = request.getParameter("userPwd");

		System.out.println("userId : " + userId);
		System.out.println("userPsw : " + userPwd);

		UserDTO requestUser = new UserDTO();
		requestUser.setId(userId);
		requestUser.setPsw(userPwd);

		UserService userService = new UserService();

		UserDTO loginUser = userService.loginCheck(requestUser);
		System.out.println(loginUser);

		if (loginUser != null) {
			HttpSession session = request.getSession();
			session.setAttribute("loginUser", loginUser);
			
			System.out.println("로그인 성공 입니다.");
			response.sendRedirect(request.getContextPath());
		} else {
			System.out.println("로그인 실패 입니다.");
		}
	}
}
