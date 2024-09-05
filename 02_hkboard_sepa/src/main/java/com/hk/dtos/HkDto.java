package com.hk.dtos;

import java.io.Serializable;
import java.sql.Date;

public class HkDto implements Serializable {
//Serializable 인터페이스를 구현 -> 데이터 직렬화 "data" -> [d a t a]
//데이터를 안정적으로 관리

	// 식별 관리 아이디
	private static final long serialVersionUID = 1L;

	private int seq;
	private String id;
	private String title;
	private String content;
	private Date regDate;

	public HkDto() {

	}

	public HkDto(int seq, String id, String title, String content, Date regDate) {

	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "HkDto [seq=" + seq + ", id=" + id + ", title=" + title + ", content=" + content + ", regDate=" + regDate
				+ "]";
	}

}
