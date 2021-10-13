package com.abhinay.notesapp.dto;

import java.sql.Timestamp;

import lombok.Getter;

public class NotesDTO {
	@Getter
	private Long id;
	@Getter
	private String email;
	@Getter
	private String title;
	@Getter
	private String note;
	@Getter
	private Timestamp createTime;
	@Getter
	private Timestamp lastUpdateTime;
	
	private NotesDTO(Long id,String email, String title, String note, Timestamp createTime, Timestamp lastUpdateTime) {
		super();
		this.id = id;
		this.email = email;
		this.title = title;
		this.note = note;
		this.createTime = createTime;
		this.lastUpdateTime = lastUpdateTime;
	}
}
