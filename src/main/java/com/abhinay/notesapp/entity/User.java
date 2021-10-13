package com.abhinay.notesapp.entity;

import java.sql.Timestamp;

import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

public class User {

	@Getter
	@Setter
	@Id
	private String email;
	
	@Getter
	@Setter
	private String password;
	
	@Getter
	@Setter
	private Timestamp createTime;
	
	@Getter
	@Setter
	private Timestamp lastUpdateTime;

	public User(String email, String password, 
			Timestamp createTime, Timestamp lastUpdateTime) {
		super();
		this.email = email;
		this.password = password;
		this.createTime = createTime;
		this.lastUpdateTime = lastUpdateTime;
	}

	public User() {
		super();
	}

}
