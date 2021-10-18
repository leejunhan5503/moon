package org.clickMe.notice.model.service;

import static org.clickMe.common.Template.getSqlSession;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.clickMe.common.model.dto.NoticeDTO;
import org.clickMe.notice.model.dao.NoticeMapper;
import org.clickMe.notice.model.dto.NoticeForAdminDTO;
import org.clickMe.notice.model.dto.NoticeSearch;

public class NoticeService {
	
	/* 공지사항 조회 */
	public List<NoticeDTO> selectNoticeList() {
		SqlSession sqlSession = getSqlSession();
		
		NoticeMapper noticeMapper = sqlSession.getMapper(NoticeMapper.class);
		
		List<NoticeDTO> noticeList = noticeMapper.selectNoticeList();
		
		sqlSession.close();
		
		return noticeList;
	}
	/* 검색 옵션에 따른 게시물 조회 */
	public List<NoticeDTO> selectNoticeByNoticeSearch(Object noticeSearch) {
		SqlSession sqlSession = getSqlSession();
		
		NoticeMapper noticeMapper = sqlSession.getMapper(NoticeMapper.class);
		
		List<NoticeDTO> searchedPostList = noticeMapper.selectNoticeByNoticeSearch(noticeSearch);
		
		sqlSession.close();
		
		return searchedPostList;
	}
	
	/* 관리자용 공지사항 */
	public List<NoticeForAdminDTO> selectNoticeForAdmin(Map<String, Object> parameter) {
		SqlSession sqlSession = getSqlSession();

		NoticeMapper noticeMapper = sqlSession.getMapper(NoticeMapper.class);
		
		List<NoticeForAdminDTO> noticeList = noticeMapper.selectNoticeForAdmin(parameter);
		
		sqlSession.close();
		
		return noticeList;
	}
	
	/* 신규 공지 사항 등록용 메소드 */
	public boolean registNotice(NoticeDTO notice) {
		SqlSession sqlSession = getSqlSession();
		
		NoticeMapper noticeMapper = sqlSession.getMapper(NoticeMapper.class);
		
		int result = noticeMapper.registNotice(notice);
		if(result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		
		return result > 0 ? true : false;
	}
	
	/* 공지사항 수정 메소드 */
	public boolean modifyNotice(Map<String, Object> parameter) {
		SqlSession sqlSession = getSqlSession();

		NoticeMapper noticeMapper = sqlSession.getMapper(NoticeMapper.class);
		
		int result = noticeMapper.modifyNotice(parameter);
		if(result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		return result > 0 ? true : false;
	}
	
	/* 공지사항 삭제 메소드 */
	public boolean deleteNotice(int code) {
		SqlSession sqlSession = getSqlSession();
		
		NoticeMapper noticeMapper = sqlSession.getMapper(NoticeMapper.class);
		
		int result = noticeMapper.deleteNotice(code);
		if(result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		
		return result > 0 ? true : false;
	}
	
	
		

	
}
