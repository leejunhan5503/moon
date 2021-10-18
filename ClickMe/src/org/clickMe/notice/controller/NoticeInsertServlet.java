package org.clickMe.notice.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.clickMe.common.model.dto.NoticeDTO;
import org.clickMe.notice.NoticeResultView;
import org.clickMe.notice.model.service.NoticeService;

@WebServlet("/notice/insert")
public class NoticeInsertServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		NoticeService noticeService = new NoticeService();
		NoticeResultView noticeResultView = new NoticeResultView();
		NoticeDTO post = new NoticeDTO();
		
		System.out.println(NoticeInsertServlet.class.getName() + " is successfully called.");
		
		request.setCharacterEncoding("UTF-8");
		
		post.setCode(Integer.valueOf(request.getParameter("Code")));
		post.setTitle(request.getParameter("title"));
		post.setContent(request.getParameter("content"));
		
		String forwardingPath = "/WEB-INF/views/notice/NoticeInsert.jsp";
		if (noticeService.registNotice(post)) {
			noticeResultView.printSuccessMessage("insert");
			request.setAttribute("isDMLSuccess", "success");
		} else {
			noticeResultView.printErrorMessage("insert");
			request.setAttribute("isDMLSuccess", "fail");
		}
		
		request.getRequestDispatcher(forwardingPath).forward(request, response);
	}

}
