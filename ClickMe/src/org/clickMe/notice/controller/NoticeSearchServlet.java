package org.clickMe.notice.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.clickMe.common.model.dto.NoticeDTO;
import org.clickMe.notice.NoticeResultView;
import org.clickMe.notice.model.dto.NoticeSearch;
import org.clickMe.notice.model.service.NoticeService;
import org.clickMe.post.controller.SearchPostServlet;

@WebServlet("/notice/list")
public class NoticeSearchServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		NoticeService noticeService = new NoticeService();
		NoticeResultView noticeResultView = new NoticeResultView();
		
		System.out.println(NoticeSearchServlet.class.getName() + " is successfully called.");
		
		List<NoticeDTO> noticeList = noticeService.selectNoticeList();
		
		for (NoticeDTO notice : noticeList) {
			System.out.println(notice);
		}
		
		String forwardingPath = "";
		if (!noticeList.isEmpty()) {
			forwardingPath = "/WEB-INF/views/notice/NoticeList.jsp";
			request.setAttribute("noticeList", noticeList);
		} else {
			noticeResultView.printErrorMessage("selectList");
		}
		/* getRequestDispatcher = 클라이언트로부터 들어온 요청을 JSP/Servlet 내에서 원하는
		 * 자원으로 요청을 넘기는 역할을 수행하거나, 특정 자원에 처리를 요청하고 처리 결과를 얻어옴 */
		/* forward() = 대상 자원으로 제어를 넘기는 넘기는 역할을 한다. */
		request.getRequestDispatcher(forwardingPath).forward(request, response);
	}
}
