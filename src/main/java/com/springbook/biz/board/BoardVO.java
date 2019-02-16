package com.springbook.biz.board;

import java.sql.Date;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@ToString
@Getter @Setter
public class BoardVO {
	private int seq;
	private String title;
	private String writer;
	private String content;
	private Date regDate;
	private int cnt;
	
	/*
	 * @Override public String toString() { return "BoardVO[seq=" + seq + ", title="
	 * + title + ", writer=" + writer + ",content=" + content + "regDate=" + regDate
	 * + "cnt=" + cnt + "]"; }
	 */
}
