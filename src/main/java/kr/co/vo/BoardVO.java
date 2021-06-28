package kr.co.vo;

import java.util.Date;

//게시글 VO
public class BoardVO {
	
	private int bno; //번호
	private String title; //제목
	private String content; //내용
	private String writer; //작성자
	private Date regdate; //작성일
	
	//get,set 생성 
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
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
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	

}
