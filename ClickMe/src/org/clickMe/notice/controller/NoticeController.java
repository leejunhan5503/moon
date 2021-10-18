package org.clickMe.notice.controller;

import java.util.List;
import java.util.Map;

import org.clickMe.common.model.dto.NoticeDTO;
import org.clickMe.notice.NoticeResultView;
import org.clickMe.notice.model.service.NoticeService;

public class NoticeController {
	private final NoticeService noticeService;
	private final NoticeResultView noticeResultView;

	public NoticeController() {
		this.noticeService = new NoticeService();
		this.noticeResultView = new NoticeResultView();
	}
	/* 공지사항 조회 */
	public void selectNoticeList() {
		List<NoticeDTO> noticeList = noticeService.selectNoticeList();
		
		if(!noticeList.isEmpty()) {
			noticeResultView.printSuccessMessage("search");
		} else {
			noticeResultView.printErrorMessage("search");
		}
	}
	/* 검색에 따른 공지사항 조회 */
	public void selectNoticeByNoticeSearch(Object noticeSearch) {
		List<NoticeDTO> searchedNoticeList = noticeService.selectNoticeByNoticeSearch(noticeSearch);
		
		if (!searchedNoticeList.isEmpty()) {
			noticeResultView.printSuccessMessage("search");
		} else {
			noticeResultView.printErrorMessage("search");
		}
		
	}
	/* 공지사항 등록 */
	public void registNotice(Map<String, String> parameter) {
		NoticeDTO  notice = new NoticeDTO();
		
		notice.setTitle(parameter.get("title"));
		notice.setContent(parameter.get("content"));
		
		if (noticeService.registNotice(notice)) {
			noticeResultView.printSuccessMessage("insert");
		} else {
			noticeResultView.printErrorMessage("insert");
		}
	}
	/* 공지사항 수정 */
	public void modifyNotice(Map<String, Object> parameter) {
		if (noticeService.modifyNotice(parameter)) {
			noticeResultView.printSuccessMessage("update");
		} else {
			noticeResultView.printErrorMessage("update");
		}
	}
	/* 공지사항 삭제 */
	public void deleteNotice(Map<String, String> parameter) {
		int code = Integer.valueOf(parameter.get("code"));
		
		if (noticeService.deleteNotice(code)) {
			noticeResultView.printSuccessMessage("delete");
		} else {
			noticeResultView.printErrorMessage("delete");
		}
	}
}
