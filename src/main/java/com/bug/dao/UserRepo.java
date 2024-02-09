package com.bug.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.bug.bean.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

}
