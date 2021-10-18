package org.clickMe.notice.model.dto;

import java.sql.Date;

public class NoticeForAdminDTO {

	private int code;
	private String authStatus;
	private String title;
	private String content;
	private java.sql.Date time;

	public NoticeForAdminDTO() {
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getAuthStatus() {
		return authStatus;
	}

	public void setAuthStatus(String authStatus) {
		this.authStatus = authStatus;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public java.sql.Date getTime() {
		return time;
	}

	public void setTime(java.sql.Date time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "NoticeForAdminDTO [code=" + code + ", authStatus=" + authStatus + ", title=" + title + ", content="
				+ content + ", time=" + time + "]";
	}

	public NoticeForAdminDTO(int code, String authStatus, String title, String content, Date time) {
		super();
		this.code = code;
		this.authStatus = authStatus;
		this.title = title;
		this.content = content;
		this.time = time;
	} 
}
