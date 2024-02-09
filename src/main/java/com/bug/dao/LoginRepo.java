package com.bug.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bug.bean.User;

@Repository
public interface LoginRepo extends JpaRepository<User, Long> {

	public User findByUserName(String userName);

	public User findByPassword(String password);

}
