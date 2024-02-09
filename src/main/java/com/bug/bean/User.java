package com.bug.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id", nullable = false)
	private long userId;

	@Column(name = "user_name", nullable = false)
	private String userName;

	@Column(name = "user_type", insertable = false)
	private String userType;

	@Column(name = "password ", nullable = false)
	private String password;

	public User() {
		super();
	}

	public User(Long userId, String userName, String userType, String password) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userType = userType;
		this.password = password;
	}

	public User(String userName, String password) {
		super();
		this.userName = userName;

		this.password = password;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
