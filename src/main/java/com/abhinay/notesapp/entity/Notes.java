package com.abhinay.notesapp.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Notes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter
	@Setter
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="email", nullable=false)
	@Getter
	@Setter
	private User user;

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

	public Notes(Long id, String email, String title, String note, Timestamp createTime, Timestamp lastUpdateTime) {
		super();
		this.id = id;
		this.title = title;
		this.note = note;
		this.createTime = createTime;
		this.lastUpdateTime = lastUpdateTime;
		this.user = new User(email);
	}

	public Notes() {
		super();
	}
	
	public Notes(long id) {
		this(id,null,null,null,null,null);
	}

	public Notes(Long id, String title, String note, Timestamp createTime, Timestamp lastUpdateTime) {
		super();
		this.id = id;
		this.title = title;
		this.note = note;
		this.createTime = createTime;
		this.lastUpdateTime = lastUpdateTime;
	}
}
