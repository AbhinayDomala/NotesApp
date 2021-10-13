package com.abhinay.notesapp.entity;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Pattern;

import lombok.Getter;
import lombok.Setter;

@Entity
public class User {

	@Getter
	@Setter
	@Id
	@Pattern(regexp="^[A-Za-z0-9._%+-]+@[A-Za-z.-]+\\.[A-Za-z]{2,6}$")
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
	
	@OneToMany(mappedBy="user",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private List<Notes> notes;

	public User(String email, String password, Timestamp createTime, Timestamp lastUpdateTime) {
		super();
		this.email = email;
		this.password = password;
		this.createTime = createTime;
		this.lastUpdateTime = lastUpdateTime;
	}

	public User() {
		super();
	}

	public User(String email) {
		this(email,null,null,null);
	}
}
