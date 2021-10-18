package org.clickMe.notice.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.clickMe.notice.NoticeResultView;
import org.clickMe.notice.model.service.NoticeService;

@WebServlet("/post/delete")
public class NoticeDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		NoticeService noticeService = new NoticeService();
		NoticeResultView noticeResultView = new NoticeResultView();
		
		System.out.println(NoticeDeleteServlet.class.getName() + " is successfully called.");
		
		request.setCharacterEncoding("UTF-8");
		
		int code = Integer.valueOf(request.getParameter("code"));
		
		String forwardingPath = "/WEB-INF/views/notice/deleteNotice.jsp";
		if (noticeService.deleteNotice(code)) {
			noticeResultView.printSuccessMessage("delete");
			request.setAttribute("isDMLSuccess", "success");
		} else {
			noticeResultView.printErrorMessage("delete");
			request.setAttribute("isDMLSuccess", "fail");
		}
		
		request.getRequestDispatcher(forwardingPath).forward(request, response);
	}

}
