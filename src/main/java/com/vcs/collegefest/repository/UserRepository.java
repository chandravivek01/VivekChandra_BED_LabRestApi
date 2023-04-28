package com.vcs.collegefest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vcs.collegefest.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	public User findByUsername(String username);
}
