package com.abhinay.notesapp.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Notes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter
	@Setter
	private Long id;

	@Getter
	@Setter
	private String title;

	@Getter
	@Setter
	private String note;

	@Getter
	@Setter
	private Timestamp createTime;

	@Getter
	@Setter
	private Timestamp lastUpdateTime;

	public Notes(Long id, String title, String note, Timestamp createTime, Timestamp lastUpdateTime) {
		super();
		this.id = id;
		this.title = title;
		this.note = note;
		this.createTime = createTime;
		this.lastUpdateTime = lastUpdateTime;
	}

	public Notes() {
		super();
	}
	
	public Notes(long id) {
		this(id,null,null,null,null);
	}
}
