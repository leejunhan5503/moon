package org.clickMe.notice.model.dao;

import java.util.List;
import java.util.Map;

import org.clickMe.common.model.dto.NoticeDTO;
import org.clickMe.notice.model.dto.NoticeForAdminDTO;
import org.clickMe.notice.model.dto.NoticeSearch;

public class NoticeMapper {

	public List<NoticeDTO> selectNoticeList() {
		return null;
	}
	
	public List<NoticeForAdminDTO> selectNoticeForAdmin(Map<String, Object> parameter) {
		return null;
	}
	List<NoticeDTO> selectNoticeByNoticeSearch(NoticeSearch noticeSearch) {
		return null;
	}
	public int registNotice(NoticeDTO notice) {
		return 0;
	} 
		
	public int modifyNotice(Map<String, Object> parameter) {
		return 0;
	}
	public int deleteNotice(int code) {
		return 0;
	}
	public List<NoticeDTO> selectNoticeByNoticeSearch(Object noticeSearch) {
		return null;
	}
}
