package org.clickMe.notice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.clickMe.notice.controller.NoticeController;
import org.clickMe.notice.model.dto.NoticeSearch;

public class Application {
	
	NoticeController noticeController = new NoticeController();
	public static void main(String[] args) {

		NoticeController noticeController = new NoticeController();
		
		Scanner sc= new Scanner(System.in);
		do {
			System.out.println("=====공지사항 단위테스트=====");
			System.out.println("1. 공지사항 조회");
			System.out.println("2. 공지사항 등록");
			System.out.println("3. 공지사항 수정");
			System.out.println("4. 공지사항 삭제");
			System.out.println("9. 공지사항 단위 테스트 종료");
			
			int no = sc.nextInt();
			
			switch(no) {
			/* 공지사항 전체 조회 */
			case 1 : noticeController.selectNoticeList();break;
			/* 공지사항 세부 조회 */
			case 2 : noticeController.selectNoticeByNoticeSearch(getNoticeSearch());break;
			/* 공지사항 등록 */
			case 3 : noticeController.registNotice(getRegistNotice());break;
			/* 공지사항 수정 */
			case 4 : noticeController.modifyNotice(getModifyNotice());break;
			/* 공지사항 삭제 */
			case 5 : noticeController.deleteNotice(getDeleteNotice());break;
			/* 공지사항 단위 테스트 종료 */
			case 9 : System.out.println("공지사항 단위 테스트 종료");break;
			}
		} while (true);
	}

	/* 공지사항 조회 */
	private static NoticeSearch getNoticeSearch() {
		Scanner sc = new Scanner(System.in);
		NoticeSearch noticeSearch = new NoticeSearch();
		
		System.out.println("공지사항을 검색할 검색 옵션을 입력해주세요" + 
		"선택 가능한 검색 옵션은 다음과 같습니다.");
		System.out.println("제목 = \'title\'입력");
		System.out.println("내용 = \'content\' 입력");
		System.out.println("검색 옵션 : ");
		noticeSearch.setOption(sc.nextLine());
		System.out.println("검색할 공지사항의 " + noticeSearch.getOption() + "을 입력해주세요 : ");
		noticeSearch.setValue(sc.nextLine());
		
		return noticeSearch;
	}
	/* 공지사항 등록 */
	private static Map<String, String> getRegistNotice() {
		Scanner sc = new Scanner(System.in);
		Map<String, String> parameter = new HashMap<>();
		
		System.out.println("제목 입력하시오");
		String title = sc.nextLine();
		System.out.println("내용 입력하시오");
		String content = sc.nextLine();
		
		parameter.put("title", title);
		parameter.put("content", content);
		
		return parameter;
		
	}
	/* 공지사항 수정 */
	private static Map<String, Object> getModifyNotice() {
		Scanner sc = new Scanner(System.in);
		Map<String, Object> parameter = new HashMap<>();
		
		System.out.println("공지사항을 수정하기 위해 몇 가지 정보를 수집합니다.");
		System.out.println("수정할 게시글의 코드를 입력해주세요");
		int code = sc.nextInt();
		sc.nextLine();
		System.out.println("공지사항의 내용을 수정하려면 입력하세요. ");
		String content = sc.nextLine();
		System.out.println("공지사항의 제목을 수정하려면 입력하세요. :");
		String title = sc.nextLine();
		sc.nextLine();
		
		parameter.put("code", code);
		parameter.put("title", title);
		parameter.put("content", content);
		
		return parameter;
		
	}
	/* 공지사항 삭제 */
	private static Map<String, String> getDeleteNotice() {
		Scanner sc = new Scanner(System.in);
		Map<String, String> parameter = new HashMap<>();
		
		System.out.println("수정할 공지사항의 코드를 입력해주세요.");
		String code = sc.nextLine();
		parameter.put("code", code);
		
		return parameter;
	}
}