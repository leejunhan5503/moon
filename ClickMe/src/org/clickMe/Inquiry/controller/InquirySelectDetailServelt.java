package org.clickMe.Inquiry.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.clickMe.Inquiry.model.service.InquiryService;
import org.clickMe.common.model.dto.InquiryDTO;

@WebServlet("/inquiry/detail")
public class InquirySelectDetailServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int no = Integer.parseInt(request.getParameter("code"));
		System.out.println(no);
		InquiryService inquiryService = new InquiryService();
		InquiryDTO inquiryDetail = inquiryService.selectNoticeDetail(no);
		
		System.out.println("inquiryDetail : " + inquiryDetail);
		
		String path = "";
		if(inquiryDetail != null) {
			path = "/WEB-INF/views/inquiry/inquiryDetail.jsp";
			request.setAttribute("inquiry", inquiryDetail);
		} else {
			System.out.println("기능동작안함");
		}
		request.getRequestDispatcher(path).forward(request, response);
	}
}
