package com.bug.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_bugs")
public class Bug {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "bug_id", nullable = false)
	private long bugId;

	@Column(name = "bug_name", nullable = false)
	private String bugName;

	@Column(name = "user_name", nullable = false)
	private String userName;

	@Column(name = "description", nullable = false)
	private String description;

	@Column(name = "status", insertable = false)
	private String status;

	@Column(name = "solution", insertable = false)
	private String solution;

	public Bug() {
		super();

	}

	public Bug(long bugId, String bugName, String userName, String description, String status, String solution) {
		super();
		this.bugId = bugId;
		this.bugName = bugName;
		this.userName = userName;
		this.description = description;
		this.status = status;
		this.solution = solution;
	}

	public Bug(String bugName, String userName, String description) {
		super();
		this.bugName = bugName;
		this.userName = userName;
		this.description = description;
	}

	public Bug(String userName) {
		super();
		this.userName = userName;
	}

	public long getBugId() {
		return bugId;
	}

	public void setBugId(long bugId) {
		this.bugId = bugId;
	}

	public String getBugName() {
		return bugName;
	}

	public void setBugName(String bugName) {
		this.bugName = bugName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSolution() {
		return solution;
	}

	public void setSolution(String solution) {
		this.solution = solution;
	}

}
