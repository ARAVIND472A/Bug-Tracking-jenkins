package com.bug.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bug.bean.Bug;

public interface BugRepo extends JpaRepository<Bug, Long> {

	public List<Bug> findByUserName(String userName);

}
